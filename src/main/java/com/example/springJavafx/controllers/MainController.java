package com.example.springJavafx.controllers;


import javafx.fxml.FXML;
import javafx.scene.control.Label;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.example.springJavafx.services.GreetingService;

@Component
public class MainController {

    @FXML
    private Label welcomeText;

    @Autowired
    private GreetingService greetingService;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText(greetingService.getGreeting());
    }
}