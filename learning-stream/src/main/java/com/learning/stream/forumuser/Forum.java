package com.learning.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> forumUsersList = new ArrayList<>();

    public Forum() {
        forumUsersList.add(new ForumUser(970612, "john23", 'M', LocalDate.of(1995, 3, 11), 55));
        forumUsersList.add(new ForumUser(950515, "tom24", 'M', LocalDate.of(1993, 2, 12), 44));
        forumUsersList.add(new ForumUser(940414, "Kate", 'F', LocalDate.of(2010, 1, 29), 5));
        forumUsersList.add(new ForumUser(930313, "diablo91", 'M', LocalDate.of(1991, 4, 25), 99));
        forumUsersList.add(new ForumUser(990925, "starCraft00", 'M', LocalDate.of(2005, 9, 24), 100));
        forumUsersList.add(new ForumUser(980219, "eleonora", 'F', LocalDate.of(1998, 10, 23), 12));
        forumUsersList.add(new ForumUser(970116, "justin11", 'F', LocalDate.of(1995, 11, 11), 54));

    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(forumUsersList);
    }
}
