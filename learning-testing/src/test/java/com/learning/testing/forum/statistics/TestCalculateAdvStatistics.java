package com.learning.testing.forum.statistics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class TestCalculateAdvStatistics {

    public List<String> usersGenerateList(int count) {
        List<String> usersList = new ArrayList<>();
        for (int i = 1; i <= count; i++) {
            usersList.add("user" + i);
        }
        return usersList;
    }

    @Mock
    private Statistics statisticsMock;

    @BeforeEach
    public void beforeEachTest() {
        List<String> usersList = usersGenerateList(4);
        int posts = 1;
        int comments = 1;

        when(statisticsMock.userNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(posts);
        when(statisticsMock.commentsCount()).thenReturn(comments);
    }

    @DisplayName("Test when posts are equal to 0")
    @Test
    void testNumberOfPostsEqualTo0() {
        // Given
        int posts = 0;
        when(statisticsMock.postsCount()).thenReturn(posts);
        StatisticsAnalysis statisticsAnalysis = new StatisticsAnalysis(statisticsMock);
        // When
        statisticsAnalysis.calculateAdvStatistics(statisticsMock);
        // Then
        assertEquals(posts, statisticsMock.postsCount());
        assertEquals(1, statisticsMock.commentsCount());
        assertEquals(4, statisticsMock.userNames().size());
        assertEquals(0, statisticsAnalysis.getAverageCommentsPerPost());
        assertEquals(1 / 4.0, statisticsAnalysis.getAverageCommentsPerUser());
        assertEquals(0, statisticsAnalysis.getAveragePostsPerUser());

    }

    @DisplayName("Test when posts are equal to 1000")
    @Test
    void testNumberOfPostsEqualTo1000() {
        // Given
        int posts = 1000;
        when(statisticsMock.postsCount()).thenReturn(posts);
        StatisticsAnalysis statisticsAnalysis = new StatisticsAnalysis(statisticsMock);
        // When
        statisticsAnalysis.calculateAdvStatistics(statisticsMock);
        // Then
        assertEquals(posts, statisticsMock.postsCount());
        assertEquals(1, statisticsMock.commentsCount());
        assertEquals(4, statisticsMock.userNames().size());
        assertEquals(1 / 1000.0, statisticsAnalysis.getAverageCommentsPerPost());
        assertEquals(1 / 4.0, statisticsAnalysis.getAverageCommentsPerUser());
        assertEquals(1000 / 4.0, statisticsAnalysis.getAveragePostsPerUser());
    }

    @DisplayName("Test when comments are equal to 0")
    @Test
    void testNumberOfCommentsEqualTo0() {
        // Given
        int comments = 0;
        when(statisticsMock.commentsCount()).thenReturn(comments);
        StatisticsAnalysis statisticsAnalysis = new StatisticsAnalysis(statisticsMock);
        // When
        statisticsAnalysis.calculateAdvStatistics(statisticsMock);
        // Then
        assertEquals(comments, statisticsMock.commentsCount());
        assertEquals(1, statisticsMock.postsCount());
        assertEquals(4, statisticsMock.userNames().size());
        assertEquals(0, statisticsAnalysis.getAverageCommentsPerPost());
        assertEquals(0, statisticsAnalysis.getAverageCommentsPerUser());
        assertEquals(1 / 4.0, statisticsAnalysis.getAveragePostsPerUser());
    }

    @DisplayName("Test when the number of posts are greater than number of comments")
    @Test
    void testNumberOfPostsGreaterThanComments() {
        // Given
        int posts = 1000;
        int comments = 500;
        when(statisticsMock.postsCount()).thenReturn(posts);
        when(statisticsMock.commentsCount()).thenReturn(comments);
        StatisticsAnalysis statisticsAnalysis = new StatisticsAnalysis(statisticsMock);
        // When
        statisticsAnalysis.calculateAdvStatistics(statisticsMock);
        // Then
        assertEquals(comments, statisticsMock.commentsCount());
        assertEquals(posts, statisticsMock.postsCount());
        assertEquals(4, statisticsMock.userNames().size());
        assertEquals(0.5, statisticsAnalysis.getAverageCommentsPerPost());
        assertEquals(500 / 4.0, statisticsAnalysis.getAverageCommentsPerUser());
        assertEquals(1000 / 4.0, statisticsAnalysis.getAveragePostsPerUser());


    }

    @DisplayName("Test when the number of comments are greater than posts")
    @Test
    void testNumberOfCommentsGreaterThanPosts() {
        // Given
        int posts = 100;
        int comments = 500;
        when(statisticsMock.postsCount()).thenReturn(posts);
        when(statisticsMock.commentsCount()).thenReturn(comments);
        StatisticsAnalysis statisticsAnalysis = new StatisticsAnalysis(statisticsMock);
        // When
        statisticsAnalysis.calculateAdvStatistics(statisticsMock);
        // Then
        assertEquals(comments, statisticsMock.commentsCount());
        assertEquals(posts, statisticsMock.postsCount());
        assertEquals(4, statisticsMock.userNames().size());
        assertEquals(5, statisticsAnalysis.getAverageCommentsPerPost());
        assertEquals(500 / 4.0, statisticsAnalysis.getAverageCommentsPerUser());
        assertEquals(100 / 4.0, statisticsAnalysis.getAveragePostsPerUser());
    }

    @DisplayName("Test when the number of users are equal to 0")
    @Test
    void testNumberOfUsers0() {
        // Given
        List<String> users = usersGenerateList(0);
        int posts = 100;
        int comments = 500;
        when(statisticsMock.userNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(posts);
        when(statisticsMock.commentsCount()).thenReturn(comments);
        StatisticsAnalysis statisticsAnalysis = new StatisticsAnalysis(statisticsMock);
        // When
        statisticsAnalysis.calculateAdvStatistics(statisticsMock);
        // Then
        assertEquals(users, statisticsMock.userNames());
        assertEquals(posts, statisticsMock.postsCount());
        assertEquals(comments, statisticsMock.commentsCount());
        assertEquals(500 / 100.0, statisticsAnalysis.getAverageCommentsPerPost());
        assertEquals(0, statisticsAnalysis.getAverageCommentsPerUser());
        assertEquals(0, statisticsAnalysis.getAveragePostsPerUser());

    }

    @DisplayName("Test when the number of users are equal 100")
    @Test
    void testNumberOfUsers100() {
        // Given
        List<String> users = usersGenerateList(100);
        when(statisticsMock.userNames()).thenReturn(users);
        StatisticsAnalysis statisticsAnalysis = new StatisticsAnalysis(statisticsMock);
        // When
        statisticsAnalysis.calculateAdvStatistics(statisticsMock);
        // Then
        assertEquals(users, statisticsMock.userNames());
        assertEquals(1, statisticsMock.postsCount());
        assertEquals(1, statisticsMock.commentsCount());
        assertEquals(1, statisticsAnalysis.getAverageCommentsPerPost());
        assertEquals(1 / 100.0, statisticsAnalysis.getAverageCommentsPerUser());
        assertEquals(1 / 100.0, statisticsAnalysis.getAveragePostsPerUser());

    }
}
