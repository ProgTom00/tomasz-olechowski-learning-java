package com.good.patterns.challenges.food2door;

import java.util.ArrayList;
import java.util.List;

public class OrderRequest {
    private final List<Shop> orderList;

    public OrderRequest() {
        orderList = new ArrayList<>();
    }

    public List<Shop> getOrderList() {
        return orderList;
    }

    public void addProduct(Shop shop) {
        orderList.add(shop);
    }
}
