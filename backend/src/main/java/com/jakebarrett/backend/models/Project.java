package com.jakebarrett.backend.models;

public class Project {

    private String title;
    private String description;
    private String techStack;
    private String githubUrl;
    private String liveDemoUrl;

    public Project(String title, String description, String techStack, String githubUrl, String liveDemoUrl) {
        this.title = title;
        this.description = description;
        this.techStack = techStack;
        this.githubUrl = githubUrl;
        this.liveDemoUrl = liveDemoUrl;
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