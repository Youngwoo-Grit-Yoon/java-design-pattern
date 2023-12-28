package com.example.demo.design.patterns.Bridge.domain.alarm;

import com.example.demo.design.patterns.Bridge.domain.company.Company;

public class Push extends AlarmService {
    public Push(Company company) {
        super(company);
    }

    @Override
    public void send() {
        System.out.println(company.getIntro() + "에서 푸시를 발송합니다.");
    }
}
