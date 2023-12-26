package com.example.demo.design.patterns.ChainOfResponsibility;

import com.example.demo.design.patterns.ChainOfResponsibility.handler.Handler;

public class AuthService {
    private final Handler handler;

    public AuthService(Handler handler) {
        this.handler = handler;
    }

    public boolean logIn(String username, String password) {
        if (handler.handle(username, password)) {
            System.out.println("Authorization is successful!");
            return true;
        }
        return false;
    }
}
