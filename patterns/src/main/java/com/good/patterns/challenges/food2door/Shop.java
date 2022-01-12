package com.good.patterns.challenges.food2door;

import lombok.Getter;

@Getter
public class Shop {
    private final Product product;
    private final int quantity;

    public Shop(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }
}
