package com.jakebarrett.backend.controllers;

import com.jakebarrett.backend.models.ContactMessage;
import com.jakebarrett.backend.repositories.ContactMessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/contact")
@CrossOrigin(origins = "http://localhost:5173")
public class ContactController {

    private final ContactMessageRepository contactMessageRepository;

    @Autowired
    public ContactController(ContactMessageRepository contactMessageRepository) {
        this.contactMessageRepository = contactMessageRepository;
    }

    @GetMapping("/messages")
    public ResponseEntity<List<ContactMessage>> getAllMessages(@RequestParam String adminToken) {
        List<ContactMessage> messages = contactMessageRepository.findAll();
        return ResponseEntity.ok(messages);
    }

    @PostMapping
    public ResponseEntity<String> handleContactForm(@RequestBody ContactMessage contactMessage) {

         if (contactMessage.getName() == null || contactMessage.getName().isEmpty() ||
         contactMessage.getEmail() == null || contactMessage.getEmail().isEmpty() ||
            contactMessage.getMessage() == null || contactMessage.getMessage().isEmpty()) {
             return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("All fields are required.");
         }

        if (contactMessage.getName().length() < 2 || contactMessage.getName().length() > 50) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Name must be between 2 and 50 characters.");
        }

        String emailPattern = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        if (!contactMessage.getEmail().matches(emailPattern)) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Invalid email format.");
        }

        if (contactMessage.getMessage().length() < 10 || contactMessage.getMessage().length() > 10000) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Message must be between 10 and 10000 characters.");
        }

        System.out.println("Name: " + contactMessage.getName());
        System.out.println("Email: " + contactMessage.getEmail());
        System.out.println("Message: " + contactMessage.getMessage());

                contactMessageRepository.save(contactMessage);
                return ResponseEntity.ok("Message received successfully!");

            }
        }
