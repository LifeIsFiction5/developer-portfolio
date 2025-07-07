import { Link } from 'react-router-dom';

export default function Navbar() {
    return (
        <nav className='bg-gray-800 text-white p-4'>
            <div className="container mx-auto flex space-x-6">
                <Link to="/" className='hover:text-gray-300 transition-colors'>Home</Link>
                <Link to="/projects" className='hover:text-gray-300 transition-colors'>Projects</Link>
                <Link to="/resume" className='hover:text-gray-300 transition-colors'>Resume</Link>
                <Link to="/contact" className='hover:text-gray-300 transition-colors'>Contact</Link>
            </div>
        </nav>
    );
}