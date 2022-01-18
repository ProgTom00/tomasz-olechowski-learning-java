package com.patterns2.strategy.social;

public class ZGeneration extends User {
    public ZGeneration(String username) {
        super(username);
        this.socialPublisher = new TwitterPublisher();
    }
}
