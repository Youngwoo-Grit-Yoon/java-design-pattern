package com.example.demo.design.patterns.Strategy.domain;

public interface WelcomeStrategy {
    boolean validateClient(BankClient client);
    void send(String message);
}
