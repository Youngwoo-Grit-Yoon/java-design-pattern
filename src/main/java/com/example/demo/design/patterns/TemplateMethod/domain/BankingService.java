package com.example.demo.design.patterns.TemplateMethod.domain;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public abstract class BankingService {
    private final User user;

    public void startProcess() {
        if (!validateUser()) {
            System.out.println("The user is blocked.");
            return;
        }

        if (!validateAccount()) {
            System.out.println("The user's account is blocked.");
            return;
        }

        execute();
    }

    protected boolean validateUser() {
        System.out.println("Validate user from database.");
        return true;
    }

    protected boolean validateAccount() {
        System.out.println("Validate user's account from database.");
        return true;
    }

    protected abstract void execute();
}
