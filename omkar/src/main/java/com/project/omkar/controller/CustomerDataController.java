package com.project.omkar.controller;

import com.project.omkar.entity.CustomerData;
import com.project.omkar.service.CustomerDataService;
import com.project.omkar.service.Emailservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class CustomerDataController
{
    @Autowired
    private CustomerDataService service;

    @Autowired
    private Emailservice emailservice; // Dependency Injection for email service

    @PostMapping("/contact")
    public ResponseEntity<String> saveContact(
            @RequestParam String name,
            @RequestParam String phone,
            @RequestParam String email,
            @RequestParam String message
            )
    {
        CustomerData data = new CustomerData(name,phone,email,message);
        service.save(data);

        // send mail to you
        emailservice.sendContactEmail("abhijeetgadge2829@gmail.com",name,phone,message);

        // send acknowledgment mail to client
        emailservice.sendAcknowledgementToClient(email,name);

        return ResponseEntity.ok("Thanks for contacting us, " + name + "! We'll respond shortly.");
    }
}
