// ANTIQUATED FILE, NOT USED IN PROJECT

// import { useState } from "react";

// export default function ContactFormTwo() {
//   const [name, setName] = useState("");
//   const [email, setEmail] = useState("");
//   const [message, setMessage] = useState("");

//   const handleSubmit = (e) => {
//     e.preventDefault();
// fetch('http://localhost:8080/api/contact', {
//   method: 'POST',
//   headers: {
//     'Content-Type': 'application/json; charset=utf-8' 
//   },
//   body: JSON.stringify({ name, email, message })
// })
// .then(response => response.json())
// .then(json => { 
//     console.log("Server Response: ", json);
//     console.log("Form submitted:", { name, email, message })
// })
// .catch(error => console.error("Error submitting form:", error));
//   };

//   return (
//     <form onSubmit={handleSubmit} className="space-y-4">
//       <div>
//         <label className="block text-sm font-medium">Name</label>
//         <input
//           type="text"
//           className="w-full border rounded p-2"
//           value={name}
//           onChange={(e) => setName(e.target.value)}
//         />
//       </div>

//       <div>
//         <label className="block text-sm font-medium">Email</label>
//         <input
//           type="email"
//           className="w-full border rounded p-2"
//           value={email}
//           onChange={(e) => setEmail(e.target.value)}
//         />
//       </div>

//       <div>
//         <label className="block text-sm font-medium">Message</label>
//         <textarea
//           className="w-full border rounded p-2 min-h-[100px]"
//           value={message}
//           onChange={(e) => setMessage(e.target.value)}
//         />
//       </div>

//       <button
//         type="submit"
//         className="bg-blue-600 text-white px-4 py-2 rounded hover:bg-blue-700"
//       >
//         Send Message
//       </button>
//     </form>
//   );
// }
