package com.example.demo.design.patterns.ChainOfResponsibility.domain.handler;

import com.example.demo.design.patterns.ChainOfResponsibility.domain.Database;

public class ValidPasswordHandler extends Handler {
    private final Database database;

    public ValidPasswordHandler(Database database) {
        this.database = database;
    }

    @Override
    public boolean handle(String username, String password) {
        if (!database.isValidPassword(username, password)) {
            System.out.println("Password is wrong.");
            return false;
        }
        return handleNext(username, password);
    }
}
