package com.example.demo.design.patterns.Strategy.domain;

import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
public class WelcomeService {
    private final BankClient bankClient;
    private WelcomeStrategy strategy;

    public void processService() {
        if (strategy.validateClient(bankClient)) {
            strategy.send(bankClient.getName() + "님, 은행에 방문하신 것을 환영합니다!");
        }
    }

    public void setStrategy(WelcomeStrategy welcomeStrategy) {
        this.strategy = welcomeStrategy;
    }
}
