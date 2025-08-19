package com.project.omkar.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class Emailservice
{
    @Autowired
    private JavaMailSender mailSender;

    @Async // For faster Email service
    public void sendContactEmail(String toEmail, String name, String phone, String message)
    {
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setTo(toEmail); // Your mail or Client email
        mailMessage.setSubject("New Contact Message from" + name);
        mailMessage.setText("Name: "+ name + "\nPhone: " + phone + "\nMessage: " + message);

        mailSender.send(mailMessage);
    }

    @Async
    public void sendAcknowledgementToClient(String clientEmail, String name)
    {
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setTo(clientEmail);
        mailMessage.setSubject("Than you for contacting ApplePortfolio");
        mailMessage.setText("Hi " + name + ",\n\nThank you for reaching out to ApplePortfolio Photography. We'll get back to you shortly.\n\nBest,\nApplePortfolio Team");

        mailSender.send(mailMessage);
    }
}
