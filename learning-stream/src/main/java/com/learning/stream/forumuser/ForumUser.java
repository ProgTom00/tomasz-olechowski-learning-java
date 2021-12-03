package com.learning.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {

    private final int userId;
    private final String nameUser;
    private final char sex;
    private final LocalDate dateOfBirth;
    private final int postPublished;

    public ForumUser(int userId, String nameUser, char sex, LocalDate dateOfBirth, int postPublished) {

        this.userId = userId;
        this.nameUser = nameUser;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.postPublished = postPublished;
    }

    public int getUserId() {
        return userId;
    }

    public String getNameUser() {
        return nameUser;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getPostPublished() {
        return postPublished;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userId=" + userId +
                ", nameUser='" + nameUser + '\'' +
                ", sex=" + sex +
                ", dateOfBirth=" + dateOfBirth +
                ", postPublished=" + postPublished +
                '}';
    }
}
