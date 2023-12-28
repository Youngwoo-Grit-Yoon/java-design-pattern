package com.example.demo.design.patterns.TemplateMethod.domain;

public class Transfer extends BankingService {
    public Transfer(User user) {
        super(user);
    }

    @Override
    protected void execute() {
        System.out.println("Executing transfer service.");
    }
}
