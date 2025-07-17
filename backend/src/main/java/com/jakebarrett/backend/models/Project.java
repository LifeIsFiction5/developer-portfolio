package com.jakebarrett.backend.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
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

    public Project() {
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", techStack='" + techStack + '\'' +
                ", githubUrl='" + githubUrl + '\'' +
                ", liveDemoUrl='" + liveDemoUrl + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) { this.id = id; }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

//Should these Projects somehow be sourced directly from GitHub?  How would I scrape my account page?
//Consider playwright implementation, or using the GitHub API to fetch repositories.