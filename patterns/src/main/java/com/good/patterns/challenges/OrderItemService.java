package com.good.patterns.challenges;

public class OrderItemService implements OrderService {
    @Override
    public boolean order(User user, Item item) {
        return user.getBalance() >= item.getPrice();
    }
}
