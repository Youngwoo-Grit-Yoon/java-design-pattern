package com.example.demo.design.patterns.FactoryMethod.domain;

import com.example.demo.design.patterns.FactoryMethod.domain.concrete.CTI;
import com.example.demo.design.patterns.FactoryMethod.domain.concrete.ZendeskCTI;

public class ZendeskCreator extends Creator {
    @Override
    public CTI createCTI() {
        return new ZendeskCTI();
    }
}
