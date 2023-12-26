package com.example.demo.design.patterns.AbstractFactory.domain.agent;

import lombok.Data;

@Data
public abstract class Agent implements AgentOperations {
    private String id;
    private String name;

    @Override
    public boolean isLogin() {
        return false;
    }
}
