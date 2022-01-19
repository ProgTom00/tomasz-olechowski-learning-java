package com.patterns2.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BigMacTestSuite {

    @Test
    void testBicMacBuilder() {


        // Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("without sesame")
                .burgers(2)
                .sauce("barbecue")
                .ingredient("Cheese")
                .ingredient("Onion")
                .ingredient("Cucumber")
                .build();
        System.out.println(bigmac);
        // When
        int howManyIngredients = bigmac.getIngredients().size();
        int howManyBurgers = bigmac.getBurgers();
        boolean hasIngredient = bigmac.getIngredients().contains("Cheese");
        // Then
        assertEquals(3, howManyIngredients);
        assertEquals(2, howManyBurgers);
        assertTrue(hasIngredient);

    }
}