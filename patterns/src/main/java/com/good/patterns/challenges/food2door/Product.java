package com.good.patterns.challenges.food2door;

import lombok.Getter;

@Getter
public class Product {
    private final String productName;
    private final double price;

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

}
