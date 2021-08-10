package jm.task.core.jdbc.dao;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class UserDaoJDBCImpl implements UserDao {
    public UserDaoJDBCImpl() {

    }
    private static Statement statement = Util.statement;

    public void createUsersTable() {
        String sqlCreate = "CREATE TABLE users (id INT AUTO_INCREMENT, name VARCHAR(30), lastName VARCHAR(30), age TINYINT, PRIMARY KEY (id))";
        try {
            statement.execute(sqlCreate);
        } catch (SQLException e) {

        }

    }

    public void dropUsersTable() {
        String sqlDropTable = "DROP TABLE users";
        try {
            statement.execute(sqlDropTable);
        } catch (Exception e) {

        }
    }

    public void saveUser(String name, String lastName, byte age) {
        String sqlSaveUser = String.format("INSERT INTO users VALUES(DEFAULT, \'%s\', \'%s\', %d)", name, lastName, age);
        try {
            statement.execute(sqlSaveUser);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void removeUserById(long id) {
        String sqlDeleteUser = String.format("DELETE FROM users WHERE id = \' %s \'", id);
        try {
            statement.execute(sqlDeleteUser);
        } catch (SQLException e) {

        }

    }

    public List<User> getAllUsers() {
        return null;
    }

    public void cleanUsersTable() {

    }
}
