package com.example.demo.design.patterns.Bridge.domain.alarm;

import com.example.demo.design.patterns.Bridge.domain.company.Company;

public class SMS extends AlarmService {
    public SMS(Company company) {
        super(company);
    }

    @Override
    public void send() {
        System.out.println(company.getIntro() + "에서 문자를 발송합니다.");
    }
}
