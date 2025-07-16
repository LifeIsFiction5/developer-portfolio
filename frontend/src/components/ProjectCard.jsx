import React from "react";

export default function ProjectCard({ project: { title, description, techStack, githubUrl, liveDemoUrl } }) {
    return (
        <div className="p-4 border rounded-xl shadow-lg bg-white dark:bg-zinc-900">
            <h2 className="text-xl font-bold mb-2">{title}</h2>
            <p className="mb-2">{description}</p>
            <p className="text-sm text-zinc-500 mb-2">{techStack}</p>
            <div className="flex gap-4">
                <a className="text-blue-600 underline" href={githubUrl} target="_blank">GitHub</a>
                <a className="text-blue-600 underline" href={liveDemoUrl} target="_blank">Live Demo</a>
            </div>
        </div>
    );
};