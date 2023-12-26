package com.example.demo.design.patterns.AbstractFactory;

import com.example.demo.design.patterns.AbstractFactory.domain.BankUserFactory;
import com.example.demo.design.patterns.AbstractFactory.domain.InsuranceUserFactory;
import com.example.demo.design.patterns.AbstractFactory.domain.SecuritiesUserFactory;
import com.example.demo.design.patterns.AbstractFactory.domain.agent.Agent;
import com.example.demo.design.patterns.AbstractFactory.domain.client.Client;
import com.example.demo.design.patterns.DesignPattern;

public class AbstractFactory implements DesignPattern  {
    @Override
    public void run() {
        BankUserFactory bankUserFactory = new BankUserFactory();
        InsuranceUserFactory insuranceUserFactory = new InsuranceUserFactory();
        SecuritiesUserFactory securitiesUserFactory = new SecuritiesUserFactory();

        // 은행
        Agent bankAgent = bankUserFactory.createAgent();
        Client bankClient = bankUserFactory.createClient();

        // 보험
        Agent insuranceAgent = insuranceUserFactory.createAgent();
        Client insuranceClient = insuranceUserFactory.createClient();

        // 증권
        Agent securitiesAgent = securitiesUserFactory.createAgent();
        Client securitiesClient = securitiesUserFactory.createClient();
    }
}
