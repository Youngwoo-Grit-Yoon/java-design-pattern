package com.example.demo.design.patterns.ChainOfResponsibility;

import com.example.demo.design.patterns.ChainOfResponsibility.handler.Handler;
import com.example.demo.design.patterns.ChainOfResponsibility.handler.RoleCheckHandler;
import com.example.demo.design.patterns.ChainOfResponsibility.handler.UserExistHandler;
import com.example.demo.design.patterns.ChainOfResponsibility.handler.ValidPasswordHandler;
import com.example.demo.design.patterns.DesignPattern;

public class ChainOfResponsibility implements DesignPattern {
    @Override
    public void run() {
        Database database = new Database();

        Handler handler = new UserExistHandler(database);
        handler.setNextHandler(new ValidPasswordHandler(database))
                .setNextHandler(new RoleCheckHandler());

        AuthService service = new AuthService(handler);
        service.logIn("user_username", "user_password");
        service.logIn("admin_username", "admin_password");
        service.logIn("username", "password");
    }
}
