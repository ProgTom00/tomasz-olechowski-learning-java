package com.patterns2.strategy;

import com.patterns2.strategy.predictors.BalancedPredictor;

public class CorporateCustomer extends Customer {
    public CorporateCustomer(String name) {
        super(name);
        this.buyPredictor =  new BalancedPredictor();
        }
    }

