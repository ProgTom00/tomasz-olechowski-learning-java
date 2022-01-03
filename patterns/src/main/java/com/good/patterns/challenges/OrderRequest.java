package com.good.patterns.challenges;

import lombok.extern.slf4j.Slf4j;

import java.time.LocalDate;

@Slf4j
public class OrderRequest {
    private final User user;
    private final Item item;
    private final LocalDate dateOfSale;

    public OrderRequest(final User user, final Item item, final LocalDate dateOfSale) {
        this.user = user;
        this.item = item;
        this.dateOfSale = dateOfSale;
            log.info("DateOfSale " + dateOfSale);
            log.info("OrderRequest for item " + item.getName() + " from user " + user.getUserName() + " has been created.");
        }

    public User getUser() {
        return user;
    }

    public Item getItem() {
        return item;
    }

    public LocalDate getDateOfSale() {
        return dateOfSale;
    }
}
