package com.learning.java.jdbc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DbManagerTestSuite {

    @Test
    void testConnect() throws SQLException {
        // Given
        // When
        DbManager dbManager = DbManager.getInstance();
        // Then
        Assertions.assertNotNull(dbManager.getConnection());
    }

    @Test
    void testSelectUsers() throws SQLException {
        // Given
        DbManager dbManager = DbManager.getInstance();
        // When
        String sqlQuery = "SELECT * FROM USERS";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);
        // Then
        int counter = 0;
        while (rs.next()) {
            System.out.println(rs.getInt("ID") + ", " +
                    rs.getString("FIRSTNAME") + ", " +
                    rs.getString("LASTNAME"));
            counter++;
        }
        rs.close();
        statement.close();
        assertEquals(5, counter);
    }

    @Test
    void testSelectUsersAndPosts() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();

        //When
        String sqlQuery = "SELECT U.FIRSTNAME, U.LASTNAME, COUNT(*) AS POSTS_NUMBER\n" +
                "FROM USERS U\n" +
                "JOIN POSTS P ON U.ID = P.USER_ID\n" +
                "GROUP BY P.USER_ID\n" +
                "HAVING COUNT(*) > 1";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);

        //Then
        int counter = 0;
        while (rs.next()) {
            counter++;
            System.out.println(rs.getString("FIRSTNAME") + ", " +
                    rs.getString("LASTNAME") + ", " +
                    rs.getString("POSTS_NUMBER"));
        }
        rs.close();
        statement.close();
        assertEquals(2, counter);
    }

    @Test
    void testSelectUsersAndIssues () throws SQLException {
        // Given
        DbManager dbManager = DbManager.getInstance();
        // When
        String sqlQuery = "SELECT U.FIRSTNAME, U.LASTNAME, COUNT(*) AS TASKS_ASSIGNED\n" +
                "FROM ISSUES I\n" +
                "JOIN USERS U ON I.USER_ID_ASSIGNEDTO = U.ID\n" +
                "GROUP BY I.USER_ID_ASSIGNEDTO\n" +
                 "HAVING COUNT(*) > 1";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);
        // Then
        int counter = 0;
        while(rs.next()) {
            counter++;
            System.out.println(rs.getString("FIRSTNAME") + ", " +
                    rs.getString("LASTNAME") + ", " +
                    rs.getString("TASKS_ASSIGNED"));
        }
        rs.close();
        statement.close();
        assertEquals(4, counter);



    }
}