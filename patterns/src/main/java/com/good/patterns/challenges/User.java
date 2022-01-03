package com.good.patterns.challenges;

public class User {
    private final String userName;
    private final double balance;

    public User(String userName, double balance) {
        this.userName = userName;
        this.balance = balance;
    }

    public String getUserName() {
        return userName;
    }

    public double getBalance() {
        return balance;
    }
}




