package com.jakebarrett.backend.repositories;

import com.jakebarrett.backend.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
