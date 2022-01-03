package com.good.patterns.challenges;

public class OrderDto {
    private final User user;
    private final boolean wasPaid;
    private final double moneyAmount;

    public OrderDto(final User user, final boolean wasPaid, final double moneyAmount) {
        this.user = user;
        this.wasPaid = wasPaid;
        this.moneyAmount = moneyAmount;
    }

    public User getUser() {
        return user;
    }

    public boolean isWasPaid() {
        return wasPaid;
    }

    public double getMoneyAmount() {
        return moneyAmount;
    }
}
