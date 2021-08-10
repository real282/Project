package jm.task.core.jdbc.util;

import java.sql.*;

public class Util {
    private static String url = "jdbc:mysql://localhost:3306/db_test?sslUse=false";
    private static String userName = "root";
    private static String pass = "root";

    public static Statement statement;

    static {
        try {
            Connection connection = DriverManager.getConnection(url, userName, pass);
            statement = connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
