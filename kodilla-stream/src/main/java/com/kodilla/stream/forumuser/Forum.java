package com.kodilla.stream.forumuser;

import com.kodilla.stream.book.Book;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> forumUserList = new ArrayList<ForumUser>();

    public Forum () {
        forumUserList.add(new ForumUser(1, "Jacek Kowal", 'M',
                LocalDate.of(1990, 1, 15), 29));
        forumUserList.add(new ForumUser(2, "Ania Maj", 'F',
                LocalDate.of(1985, 2, 2), 0));
        forumUserList.add(new ForumUser(3, "Tomasz Dom", 'M',
                LocalDate.of(2020, 3, 3), 0));
        forumUserList.add(new ForumUser(4, "Alicja Kot", 'F',
                LocalDate.of(1997, 4, 4), 10));
        forumUserList.add(new ForumUser(5, "Damian Los", 'M',
                LocalDate.of(2004, 10, 10), 11));
    }
    public List<ForumUser> getList() {
        return new ArrayList<>(forumUserList);
    }
}
