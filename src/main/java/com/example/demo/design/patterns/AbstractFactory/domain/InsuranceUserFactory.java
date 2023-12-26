package com.example.demo.design.patterns.AbstractFactory.domain;

import com.example.demo.design.patterns.AbstractFactory.domain.agent.Agent;
import com.example.demo.design.patterns.AbstractFactory.domain.agent.InsuranceAgent;
import com.example.demo.design.patterns.AbstractFactory.domain.client.Client;
import com.example.demo.design.patterns.AbstractFactory.domain.client.InsuranceClient;

public class InsuranceUserFactory implements UserFactory {
    @Override
    public Agent createAgent() {
        return new InsuranceAgent();
    }

    @Override
    public Client createClient() {
        return new InsuranceClient();
    }
}
