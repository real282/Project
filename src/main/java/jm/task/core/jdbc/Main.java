package jm.task.core.jdbc;


import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Main {
    public static void main(String[] args) throws SQLException {
        UserService userService = new UserServiceImpl();
        //userService.createUsersTable();
        userService.saveUser("Evgen", "Roznin", (byte)37);
        userService.saveUser("Ivan", "Petrov", (byte)30);
        //userService.removeUserById(1);
        userService.cleanUsersTable();
    }
}
