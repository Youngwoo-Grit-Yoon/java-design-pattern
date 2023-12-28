package com.example.demo.design.patterns.Bridge;

import com.example.demo.design.patterns.Bridge.domain.alarm.AlarmService;
import com.example.demo.design.patterns.Bridge.domain.alarm.Email;
import com.example.demo.design.patterns.Bridge.domain.alarm.Push;
import com.example.demo.design.patterns.Bridge.domain.alarm.SMS;
import com.example.demo.design.patterns.Bridge.domain.company.Bank;
import com.example.demo.design.patterns.Bridge.domain.company.Company;
import com.example.demo.design.patterns.Bridge.domain.company.Insurance;
import com.example.demo.design.patterns.Bridge.domain.company.Securities;
import com.example.demo.design.patterns.DesignPattern;

public class Bridge implements DesignPattern {
    @Override
    public void run() {
        Company bank = new Bank();
        Company insurance = new Insurance();
        Company securities = new Securities();

        AlarmService email = new Email(bank);
        email.send();

        AlarmService push = new Push(insurance);
        push.send();

        AlarmService sms = new SMS(securities);
        sms.send();
    }
}
