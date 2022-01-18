package com.patterns2.strategy.social;

public class User {

    private final String username;
    protected SocialPublisher socialPublisher;

    public User(String username) {
        this.username = username;
    }
    public String sharePost() {
        return socialPublisher.share();
    }
    public void setPublisher(SocialPublisher socialPublisher) {
        this.socialPublisher = socialPublisher;
    }

    public String getUsername() {
        return username;
    }
}
