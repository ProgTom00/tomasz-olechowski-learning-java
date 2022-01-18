package com.patterns2.strategy;

import com.patterns2.strategy.predictors.AggressivePredictor;

public class IndividualYoungCustomer extends Customer{
    public IndividualYoungCustomer(String name) {
        super(name);
        this.buyPredictor = new AggressivePredictor();
    }
}
