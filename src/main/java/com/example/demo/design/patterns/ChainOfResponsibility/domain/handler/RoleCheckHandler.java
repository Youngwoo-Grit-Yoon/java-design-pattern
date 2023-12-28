package com.example.demo.design.patterns.ChainOfResponsibility.domain.handler;

public class RoleCheckHandler extends Handler {
    @Override
    public boolean handle(String username, String password) {
        if (!"admin_username".equals(username)) {
            System.out.println("Admin Role");
            return true;
        }
        System.out.println("User Role");
        return handleNext(username, password);
    }
}
