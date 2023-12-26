package com.example.demo.design.patterns.ChainOfResponsibility.handler;

import com.example.demo.design.patterns.ChainOfResponsibility.Database;

public class UserExistHandler extends Handler {
    private final Database database;

    public UserExistHandler(Database database) {
        this.database = database;
    }

    @Override
    public boolean handle(String username, String password) {
        if (!database.isValidUser(username)) {
            System.out.println("User is not registered.");
            return false;
        }
        return handleNext(username, password);
    }
}
