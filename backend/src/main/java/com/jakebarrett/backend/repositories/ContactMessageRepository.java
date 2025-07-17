package com.jakebarrett.backend.repositories;

import com.jakebarrett.backend.models.ContactMessage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactMessageRepository extends JpaRepository<ContactMessage, Long> {
}
