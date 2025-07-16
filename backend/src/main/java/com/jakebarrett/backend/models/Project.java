package com.jakebarrett.backend.models;

public class Project {

    private String id;
    private String title;
    private String description;
    private String techStack;
    private String githubUrl;
    private String liveDemoUrl;

    public Project(String id, String title, String description, String techStack, String githubUrl, String liveDemoUrl) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.techStack = techStack;
        this.githubUrl = githubUrl;
        this.liveDemoUrl = liveDemoUrl;
    }

    public Project() {
    }

    @Override
    public String toString() {
        return "Project{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getTechStack() {
        return techStack;
    }

    public String getGithubUrl() {
        return githubUrl;
    }

    public String getLiveDemoUrl() {
        return liveDemoUrl;
    }
}