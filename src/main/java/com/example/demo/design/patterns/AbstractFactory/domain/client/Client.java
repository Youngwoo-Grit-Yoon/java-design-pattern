package com.example.demo.design.patterns.AbstractFactory.domain.client;

import lombok.Data;

@Data
public abstract class Client implements ClientOperations {
    private String id;
    private String name;

    @Override
    public boolean isBlacklisted() {
        return false;
    }
}
