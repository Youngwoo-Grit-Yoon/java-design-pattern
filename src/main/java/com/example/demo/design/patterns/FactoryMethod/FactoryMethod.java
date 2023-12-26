package com.example.demo.design.patterns.FactoryMethod;

import com.example.demo.design.patterns.DesignPattern;
import com.example.demo.design.patterns.FactoryMethod.domain.AmazonConnectCreator;
import com.example.demo.design.patterns.FactoryMethod.domain.SalesforceCreator;
import com.example.demo.design.patterns.FactoryMethod.domain.ZendeskCreator;
import com.example.demo.design.patterns.FactoryMethod.domain.concrete.CTI;

public class FactoryMethod implements DesignPattern {
    @Override
    public void run() {
        AmazonConnectCreator amazonConnectCreator = new AmazonConnectCreator();
        SalesforceCreator salesforceCreator = new SalesforceCreator();
        ZendeskCreator zendeskCreator = new ZendeskCreator();

        CTI amazonConnectCTI = amazonConnectCreator.createCTI();
        amazonConnectCTI.makeCall();

        CTI salesforceCTI = salesforceCreator.createCTI();
        salesforceCTI.makeCall();

        CTI zendeskCTI = zendeskCreator.createCTI();
        zendeskCTI.makeCall();
    }
}
