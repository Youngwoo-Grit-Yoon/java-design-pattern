package com.example.demo.design.patterns.TemplateMethod;

import com.example.demo.design.patterns.DesignPattern;
import com.example.demo.design.patterns.TemplateMethod.domain.*;

public class TemplateMethod implements DesignPattern {
    @Override
    public void run() {
        User user = new User("윤영우");

        BankingService deposit = new Deposit(user);
        deposit.startProcess();

        BankingService transfer = new Transfer(user);
        transfer.startProcess();

        BankingService withdraw = new Withdraw(user);
        withdraw.startProcess();
    }
}
