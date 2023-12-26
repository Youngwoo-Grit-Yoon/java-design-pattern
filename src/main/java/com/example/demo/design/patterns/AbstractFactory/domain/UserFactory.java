package com.example.demo.design.patterns.AbstractFactory.domain;

import com.example.demo.design.patterns.AbstractFactory.domain.agent.Agent;
import com.example.demo.design.patterns.AbstractFactory.domain.client.Client;

public interface UserFactory {
    Agent createAgent();
    Client createClient();
}
