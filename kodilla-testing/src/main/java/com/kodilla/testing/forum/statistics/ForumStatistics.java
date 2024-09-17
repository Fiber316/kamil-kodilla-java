package com.kodilla.testing.forum.statistics;

public class ForumStatistics {


    public int usersCount;
    public int postsCount;
    public int commentsCount;
    public double averagePostsPerUser;
    public double averageCommentsPerUser;
    public double averageCommentsPerPost;
    public boolean isUsersCountZero;
    public boolean isPostsCountZero;

    public ForumStatistics() {
        this.isUsersCountZero = false;
        this.isPostsCountZero = false;
    }

    public int getUsersCount() {
        return usersCount;
    }

    public int getPostsCount() {
        return postsCount;
    }

    public int getCommentsCount() {
        return commentsCount;
    }

    public double getAveragePostsPerUser() {
        return averagePostsPerUser;
    }

    public double getAverageCommentsPerUser() {
        return averageCommentsPerUser;
    }

    public double getAverageCommentsPerPost() {
        return averageCommentsPerPost;
    }

    public void calculateAdvStatistics(Statistics statistics){
        usersCount = statistics.usersNames().size();
        postsCount = statistics.postsCount();
        commentsCount = statistics.commentsCount();
        if (usersCount == 0){
            isUsersCountZero = true;
        }
        if (postsCount == 0){
            isPostsCountZero = true;
        }
        if (isUsersCountZero == false){
            averagePostsPerUser = (double) postsCount / usersCount;
            averageCommentsPerUser = (double) commentsCount / usersCount;
        }
        if (isPostsCountZero == false){
            averageCommentsPerPost = (double) commentsCount / postsCount;
        }
    }

    public void showStatistics(){
        System.out.println("Forum statistics:");
        System.out.println("Users count: " + usersCount);
        System.out.println("Posts count: " + postsCount);
        System.out.println("Comments count: " + commentsCount);
        if (isUsersCountZero == false) {
            System.out.println("Average posts per user: " + averagePostsPerUser);
            System.out.println("Average comments per user: " + averageCommentsPerUser);
        } else {
            System.out.println("Average posts per user: not a number");
            System.out.println("Average comments per user: not a number");
        }
        if (isPostsCountZero == false) {
            System.out.println("Average comments per post: " + averageCommentsPerPost);
        } else {
            System.out.println("Average comments per post: not a number");
        }
    }

}
