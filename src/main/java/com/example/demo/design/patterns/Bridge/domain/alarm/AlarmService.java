package com.example.demo.design.patterns.Bridge.domain.alarm;

import com.example.demo.design.patterns.Bridge.domain.company.Company;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public abstract class AlarmService {
    protected final Company company;

    public abstract void send();
}
