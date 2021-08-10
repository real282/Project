package jm.task.core.jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Main {
    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/cities?useSSL=false", "root", "root");

        connection.close();
    }
}
