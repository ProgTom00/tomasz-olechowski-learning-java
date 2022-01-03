package com.good.patterns.challenges;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ItemOrderRepository implements OrderRepository{
    @Override
    public void createOrder(User user, Item item) {
        log.info("Order created in repository");

    }
}
