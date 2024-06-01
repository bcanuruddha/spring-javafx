package com.example.springJavafx.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    public String getGreeting() {
        return "Welcome to Spring-JavaFX Application!";
    }
}
