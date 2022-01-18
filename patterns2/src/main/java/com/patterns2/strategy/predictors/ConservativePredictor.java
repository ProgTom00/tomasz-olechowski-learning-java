package com.patterns2.strategy.predictors;

import com.patterns2.strategy.BuyPredictor;

public class ConservativePredictor implements BuyPredictor {
    @Override
    public String predictWhatToBuy() {
        return "[Conservative predictor] Buy debentures of XYZ";
    }
}
