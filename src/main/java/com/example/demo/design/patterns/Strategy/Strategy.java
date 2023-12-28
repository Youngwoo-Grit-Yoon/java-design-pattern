package com.example.demo.design.patterns.Strategy;

import com.example.demo.design.patterns.DesignPattern;
import com.example.demo.design.patterns.Strategy.domain.BankClient;
import com.example.demo.design.patterns.Strategy.domain.PushStrategy;
import com.example.demo.design.patterns.Strategy.domain.SmsStrategy;
import com.example.demo.design.patterns.Strategy.domain.WelcomeService;

public class Strategy implements DesignPattern {
    @Override
    public void run() {
        BankClient client = new BankClient("윤영우");

        WelcomeService welcomeService = new WelcomeService(client);
        welcomeService.setStrategy(new PushStrategy());
        welcomeService.processService();
        welcomeService.setStrategy(new SmsStrategy());
        welcomeService.processService();
    }
}
