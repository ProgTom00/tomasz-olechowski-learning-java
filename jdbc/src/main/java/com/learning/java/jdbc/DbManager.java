package com.learning.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DbManager {

    private Connection conn;
    private static DbManager dbManagerInstance;

    private DbManager() throws SQLException {
        Properties connection = new Properties();
        connection.put("user", "course_user");
        connection.put("password", "course_password");
        conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/course_java?serverTimeZone=Europe/Warsaw/" +
                       "&useSSL=False",
                connection);
    }
    public static DbManager getInstance() throws SQLException {
        if(dbManagerInstance == null) {
            dbManagerInstance = new DbManager();
        }
        return dbManagerInstance;
    }

    public Connection getConnection() {
        return conn;
    }
}
