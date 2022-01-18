package com.patterns2.strategy;

import com.patterns2.strategy.predictors.AggressivePredictor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomerTestSuite {
    @Test
    void testDefaultInvestingStrategies() {
        // Given
        Customer steven = new IndividualCustomer("Steven Links");
        Customer john = new IndividualYoungCustomer("John Hemerald");
        Customer comarch = new CorporateCustomer("Comarch");
        // When
        String stevenShouldBuy = steven.predict();
        System.out.println("Steven should: " + stevenShouldBuy);
        String johnShouldBuy = john.predict();
        System.out.println("John should: " + johnShouldBuy);
        String comarchShouldBuy = comarch.predict();
        System.out.println("Comarch should: " + comarchShouldBuy);
        // Then
        assertEquals("[Conservative predictor] Buy debentures of XYZ", stevenShouldBuy);
        assertEquals("[Aggressive predictor] Buy stock of XYZ", johnShouldBuy);
        assertEquals("[Balanced predictor] Buy shared units of Fund XYZ", comarchShouldBuy);
    }
    @Test
    void testIndividualInvestingStrategy() {
        // Given
        Customer steven = new IndividualCustomer("Steven Links");
        // When
        String stevenShouldBuy = steven.predict();
        System.out.println("Steven should: " + stevenShouldBuy);
        steven.setBuyingStrategy(new AggressivePredictor());
        stevenShouldBuy = steven.predict();
        System.out.println("Steven now should: " + stevenShouldBuy);
        // Then
        assertEquals("[Aggressive predictor] Buy stock of XYZ", stevenShouldBuy);
    }
}
