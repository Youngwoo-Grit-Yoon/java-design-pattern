package com.example.demo.design.patterns.FactoryMethod.domain;

import com.example.demo.design.patterns.FactoryMethod.domain.concrete.AmazonConnectCTI;
import com.example.demo.design.patterns.FactoryMethod.domain.concrete.CTI;

public class AmazonConnectCreator extends Creator {
    @Override
    public CTI createCTI() {
        return new AmazonConnectCTI();
    }
}
