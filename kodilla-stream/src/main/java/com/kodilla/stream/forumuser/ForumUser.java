package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    private final int userId;
    private final String userName;
    private final char gender;
    private final LocalDate birthday;
    private final int numberOfPosts;

    public ForumUser(int userId, String userName, char gender, LocalDate birthday, int numberOfPosts) {
        this.userId = userId;
        this.userName = userName;
        this.gender = gender;
        this.birthday = birthday;
        this.numberOfPosts = numberOfPosts;
    }
    public int getUserId() {
        return userId;
    }
    public String getUserName() {
        return userName;
    }
    public char getGender() {
        return gender;
    }
    public LocalDate getBirthday() {
        return birthday;
    }
    public int getNumberOfPosts() {
        return numberOfPosts;
    }
    @Override
    public String toString() {
        return "ForumUser{" + "userId='" + userId + "', userName='" + userName + "', gender='" + gender +
                "', birthday=" + birthday + ", numberOfPosts=" + numberOfPosts + "}";
    }
}
