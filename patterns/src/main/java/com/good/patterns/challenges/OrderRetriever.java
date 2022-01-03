package com.good.patterns.challenges;

import lombok.extern.slf4j.Slf4j;

import java.time.LocalDate;

@Slf4j
public class OrderRetriever {

    public OrderRequest retrieve() {
       User user = new User("Tomek", 350.0);
       Item item = new Item("Laptop", 351.0);
       LocalDate localDate = LocalDate.of(2021, 1,30);
       log.info("Customer has been created");

       return new OrderRequest(user, item,localDate);
    }
}
