package com.example.demo.design.patterns.AbstractFactory.domain;

import com.example.demo.design.patterns.AbstractFactory.domain.agent.Agent;
import com.example.demo.design.patterns.AbstractFactory.domain.agent.SecuritiesAgent;
import com.example.demo.design.patterns.AbstractFactory.domain.client.Client;
import com.example.demo.design.patterns.AbstractFactory.domain.client.SecuritiesClient;

public class SecuritiesUserFactory implements UserFactory {
    @Override
    public Agent createAgent() {
        return new SecuritiesAgent();
    }

    @Override
    public Client createClient() {
        return new SecuritiesClient();
    }
}
