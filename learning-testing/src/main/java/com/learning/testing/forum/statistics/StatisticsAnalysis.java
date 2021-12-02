package com.learning.testing.forum.statistics;

public class StatisticsAnalysis {

    private Statistics statistics;
    private int numberOfUsers;
    private int numberOfPosts;
    private int numberOfComments;
    private double averagePostsPerUser;
    private double averageCommentsPerUser;
    private double averageCommentsPerPost;

    public StatisticsAnalysis(Statistics statistics) {
        this.statistics = statistics;
    }

    public double getNumberOfUsers() {
        return numberOfUsers;
    }

    public double getNumberOfPosts() {
        return numberOfPosts;
    }

    public double getNumberOfComments() {
        return numberOfComments;
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

    public void setNumberOfUsers(int numberOfUsers) {
        this.numberOfUsers = numberOfUsers;
    }

    public void setNumberOfPosts(int numberOfPosts) {
        this.numberOfPosts = numberOfPosts;
    }

    public void setNumberOfComments(int numberOfComments) {
        this.numberOfComments = numberOfComments;
    }


    public void calculateAdvStatistics(Statistics statistics) {
        numberOfUsers = statistics.userNames().size();
        numberOfPosts = statistics.postsCount();
        numberOfComments = statistics.commentsCount();

        if (numberOfUsers == 0) {
            averageCommentsPerUser = 0.0;
            averagePostsPerUser = 0.0;
        } else {
            averagePostsPerUser = (double) numberOfPosts / numberOfUsers;
            averageCommentsPerUser = (double) numberOfComments / numberOfUsers;
        }
        if (numberOfPosts == 0.0) {
            averageCommentsPerPost = 0.0;
        } else {
            averageCommentsPerPost = (double) numberOfComments / numberOfPosts;
        }
    }

    public void showStatistics() {
        System.out.println("usersAmount= " + getNumberOfUsers() + "\npostsAmount= " + getNumberOfPosts() +
                "\ncommentsAmount= " + getNumberOfComments() + "\naveragePostsPerUser= " + getAveragePostsPerUser() +
                "\naverageCommentsPerUser= " + getAverageCommentsPerUser() + "\naverageCommentsPerPost= " + getAverageCommentsPerPost());
    }
}
