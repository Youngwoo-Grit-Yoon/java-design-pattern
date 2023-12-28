package com.example.demo.design.patterns.Strategy.domain;

public class PushStrategy implements WelcomeStrategy {
    @Override
    public boolean validateClient(BankClient client) {
        // Validate if client is registered in push blacklist database.
        return true;
    }

    @Override
    public void send(String message) {
        // Send welcome message using push method.
        System.out.println(message + "(push)");
    }
}
