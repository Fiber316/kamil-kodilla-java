package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {
    @Mock
    private ForumStatistics forumStatistics;
    private Statistics statisticsMock;

    @BeforeEach
    public void setUp() {
        statisticsMock = mock(Statistics.class);
        forumStatistics = new ForumStatistics();
    }

    @Test
    void testCalculateAdvStatisticsWithZeroPosts() {
        // Given
        List<String> forumUsersList = new ArrayList<String>();
        forumUsersList.add("user1");
        forumUsersList.add("user2");
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(100);
        when(statisticsMock.usersNames()).thenReturn(forumUsersList);
        // When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        // Then
        assertEquals(2, forumStatistics.getUsersCount());
        assertEquals(0, forumStatistics.getPostsCount());
        assertEquals(100, forumStatistics.getCommentsCount());;
        assertEquals(0.0, forumStatistics.getAveragePostsPerUser());
        assertEquals(50, forumStatistics.getAverageCommentsPerUser());
        assertEquals(true, forumStatistics.isPostsCountZero);
    }
    @Test
    void testCalculateAdvStatisticsWithThousandPosts() {
        // Given
        List<String> forumUsersList = new ArrayList<String>();
        forumUsersList.add("user1");
        forumUsersList.add("user2");
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(100);
        when(statisticsMock.usersNames()).thenReturn(forumUsersList);
        // When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        // Then
        assertEquals(2, forumStatistics.getUsersCount());
        assertEquals(1000, forumStatistics.getPostsCount());
        assertEquals(100, forumStatistics.getCommentsCount());;
        assertEquals(500, forumStatistics.getAveragePostsPerUser());
        assertEquals(50, forumStatistics.getAverageCommentsPerUser());
        assertEquals(0.1, forumStatistics.getAverageCommentsPerPost());
    }
    @Test
    void testCalculateAdvStatisticsWithZeroComments() {
        // Given
        List<String> forumUsersList = new ArrayList<String>();
        forumUsersList.add("user1");
        forumUsersList.add("user2");
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(0);
        when(statisticsMock.usersNames()).thenReturn(forumUsersList);
        // When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        // Then
        assertEquals(2, forumStatistics.getUsersCount());
        assertEquals(100, forumStatistics.getPostsCount());
        assertEquals(0, forumStatistics.getCommentsCount());;
        assertEquals(50, forumStatistics.getAveragePostsPerUser());
        assertEquals(0, forumStatistics.getAverageCommentsPerUser());
        assertEquals(0, forumStatistics.getAverageCommentsPerPost());
    }
    @Test
    void testCalculateAdvStatisticsWithLessCommentsThanPosts() {
        // Given
        List<String> forumUsersList = new ArrayList<String>();
        forumUsersList.add("user1");
        forumUsersList.add("user2");
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(50);
        when(statisticsMock.usersNames()).thenReturn(forumUsersList);
        // When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        // Then
        assertEquals(2, forumStatistics.getUsersCount());
        assertEquals(100, forumStatistics.getPostsCount());
        assertEquals(50, forumStatistics.getCommentsCount());;
        assertEquals(50, forumStatistics.getAveragePostsPerUser());
        assertEquals(25, forumStatistics.getAverageCommentsPerUser());
        assertEquals(0.5, forumStatistics.getAverageCommentsPerPost());

    }
    @Test
    void testCalculateAdvStatisticsWithMoreCommentsThanPosts() {
        // Given
        List<String> forumUsersList = new ArrayList<String>();
        forumUsersList.add("user1");
        forumUsersList.add("user2");
        when(statisticsMock.postsCount()).thenReturn(50);
        when(statisticsMock.commentsCount()).thenReturn(100);
        when(statisticsMock.usersNames()).thenReturn(forumUsersList);
        // When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        // Then
        assertEquals(2, forumStatistics.getUsersCount());
        assertEquals(50, forumStatistics.getPostsCount());
        assertEquals(100, forumStatistics.getCommentsCount());;
        assertEquals(25, forumStatistics.getAveragePostsPerUser());
        assertEquals(50, forumStatistics.getAverageCommentsPerUser());
        assertEquals(2, forumStatistics.getAverageCommentsPerPost());

    }
    @Test
    void testCalculateAdvStatisticsWithZeroUsers() {
        // Given
        List<String> forumUsersList = new ArrayList<String>();
        when(statisticsMock.postsCount()).thenReturn(50);
        when(statisticsMock.commentsCount()).thenReturn(100);
        when(statisticsMock.usersNames()).thenReturn(forumUsersList);
        // When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        // Then
        assertEquals(0, forumStatistics.getUsersCount());
        assertEquals(50, forumStatistics.getPostsCount());
        assertEquals(100, forumStatistics.getCommentsCount());;
        assertEquals(true, forumStatistics.isUsersCountZero);
        assertEquals(true, forumStatistics.isUsersCountZero);
        assertEquals(2, forumStatistics.getAverageCommentsPerPost());

    }
    @Test
    void testCalculateAdvStatisticsWithHundredUsers() {
        // Given
        List<String> forumUsersList = new ArrayList<String>();
        for (int i = 0; i < 100; i++) {
            forumUsersList.add("user" + i);
        }
        when(statisticsMock.postsCount()).thenReturn(50);
        when(statisticsMock.commentsCount()).thenReturn(100);
        when(statisticsMock.usersNames()).thenReturn(forumUsersList);
        // When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        // Then
        assertEquals(100, forumStatistics.getUsersCount());
        assertEquals(50, forumStatistics.getPostsCount());
        assertEquals(100, forumStatistics.getCommentsCount());;
        assertEquals(0.5, forumStatistics.getAveragePostsPerUser());
        assertEquals(1, forumStatistics.getAverageCommentsPerUser());
        assertEquals(2, forumStatistics.getAverageCommentsPerPost());

    }
}
