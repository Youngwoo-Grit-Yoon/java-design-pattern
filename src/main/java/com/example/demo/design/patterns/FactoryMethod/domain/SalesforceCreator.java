package com.example.demo.design.patterns.FactoryMethod.domain;

import com.example.demo.design.patterns.FactoryMethod.domain.concrete.CTI;
import com.example.demo.design.patterns.FactoryMethod.domain.concrete.SalesforceCTI;

public class SalesforceCreator extends Creator {
    @Override
    public CTI createCTI() {
        return new SalesforceCTI();
    }
}
