package com.example.demo.design.patterns.Strategy.domain;

public class SmsStrategy implements WelcomeStrategy {
    @Override
    public boolean validateClient(BankClient client) {
        // Validate if client is registered in sms blacklist database.
        return true;
    }

    @Override
    public void send(String message) {
        // Send welcome message using sms method.
        System.out.println(message + "(sms)");
    }
}
