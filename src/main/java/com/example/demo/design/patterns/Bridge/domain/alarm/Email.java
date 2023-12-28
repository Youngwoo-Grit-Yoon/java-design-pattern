package com.example.demo.design.patterns.Bridge.domain.alarm;

import com.example.demo.design.patterns.Bridge.domain.company.Company;

public class Email extends AlarmService {
    public Email(Company company) {
        super(company);
    }

    @Override
    public void send() {
        System.out.println(company.getIntro() + "에서 이메일을 발송합니다.");
    }
}
