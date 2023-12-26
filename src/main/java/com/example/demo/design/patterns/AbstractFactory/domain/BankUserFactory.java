package com.example.demo.design.patterns.AbstractFactory.domain;

import com.example.demo.design.patterns.AbstractFactory.domain.agent.Agent;
import com.example.demo.design.patterns.AbstractFactory.domain.agent.BankAgent;
import com.example.demo.design.patterns.AbstractFactory.domain.client.BankClient;
import com.example.demo.design.patterns.AbstractFactory.domain.client.Client;

public class BankUserFactory implements UserFactory {
    @Override
    public Agent createAgent() {
        return new BankAgent();
    }

    @Override
    public Client createClient() {
        return new BankClient();
    }
}
