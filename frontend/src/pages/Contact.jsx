import { useState } from "react";

export default function ContactFormTwo() {
  const [name, setName] = useState("");
  const [email, setEmail] = useState("");
  const [message, setMessage] = useState("");
  const [success, setSuccess] = useState("");
  const [error, setError] = useState("");
  const [isSubmitting, setIsSubmitting] = useState(false);

  const handleSubmit = (e) => {
    e.preventDefault();
    setIsSubmitting(true);
    fetch('http://localhost:8080/api/contact', {
      method: 'POST',
      headers: {
        'Content-Type': 'application/json'
      },
      body: JSON.stringify({ name, email, message })
    })
    .then(async (response) => {
      const text = await response.text();
      if (!response.ok) {
        throw new Error(text); // pass backend message to catch
      }
      setSuccess(text);
      setError("");
    })
    .catch(error => {
      setError(error.message);
      setSuccess("");
    })
    .finally(() => {
      setIsSubmitting(false);
    });
  };

  return (
    <div>
      {error && <p className="text-red-500">{error}</p>}
      {success && <p className="text-green-500">{success}</p>}
      <form onSubmit={handleSubmit} className="space-y-4">
        <div>
          <label className="block text-sm font-medium">Name</label>
          <input
            type="text"
            className="w-full border rounded p-2"
            value={name}
            onChange={(e) => setName(e.target.value)}
          />
        </div>

        <div>
          <label className="block text-sm font-medium">Email</label>
          <input
            type="email"
            className="w-full border rounded p-2"
            value={email}
            onChange={(e) => setEmail(e.target.value)}
          />
        </div>

        <div>
          <label className="block text-sm font-medium">Message</label>
          <textarea
            className="w-full border rounded p-2 min-h-[100px]"
            value={message}
            onChange={(e) => setMessage(e.target.value)}
          />
        </div>

        <button 
          disabled={isSubmitting}
          type="submit"
          className="bg-blue-600 text-white px-4 py-2 rounded hover:bg-blue-700"
        >
          {isSubmitting ? "Sending..." : "Send Message"}
        </button>
      </form>
    </div>
  );
}