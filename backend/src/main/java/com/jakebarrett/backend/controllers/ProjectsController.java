package com.jakebarrett.backend.controllers;

import com.jakebarrett.backend.models.Project;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/projects")
public class ProjectsController {

    @GetMapping
    public List<Project> getProjects() {
        return List.of(
                new Project(
                        "MusemMatch",
                        "Tinder-style app that matches users with artwork based on their art preferences.",
                        "React, Spring Boot, MySQL, Chicago Art Institute API",
                        "https:///github.com/LifeIsFiction5/musematch",
                        "https://musematch-demo.netlify.app"
                ),
                new Project(
                        "SquareSpace Analytics Scraper",
                        "Uses Playwright to scrape and return analytics from the last 2 weeks of site activity",
                        "TypeScript, Playwright",
                        "https://github.com/LifeIsFiction5/SquareSpaceAnalyticsScraper",
                        "https://SquareSpaceAnalyticsScraper.netlify.app"
                )
        );
    }
}
