package com.example.demo.design.patterns.TemplateMethod.domain;

public class Deposit extends BankingService {
    public Deposit(User user) {
        super(user);
    }

    @Override
    protected void execute() {
        System.out.println("Executing deposit service.");
    }
}
