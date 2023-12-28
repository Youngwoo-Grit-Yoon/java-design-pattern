package com.example.demo.design.patterns.TemplateMethod.domain;

public class Withdraw extends BankingService {
    public Withdraw(User user) {
        super(user);
    }

    @Override
    protected void execute() {
        System.out.println("Executing withdraw service.");
    }
}
