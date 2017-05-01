package by.it.prigozhanov.jd03_02.crud;

import by.it.prigozhanov.jd03_02.beans.User;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by v-omf on 4/29/2017!
 */
public class UserCRUD {
    
    public boolean create(User user) throws SQLException {
        try (Connection connection = ConnectorCreator.getConnection();
             Statement statement = connection.createStatement()) {
            String sql = String.format("INSERT INTO `users`(`Role`, `Login`, `Password`, `Email`) VALUES (%d,%s,%s,%s)",
                            user.getRole(), user.getLogin(), user.getPassword(), user.getEmail());
            if (1 == statement.executeUpdate(sql, Statement.RETURN_GENERATED_KEYS)) {
                ResultSet keys = statement.getGeneratedKeys();
                if (keys.next()) {
                    int id = keys.getInt(1);
                    user.setId(id);
                    return true;
                }
            }
            return false;
        }

    }

    public User read(User user) throws SQLException {
        User result = null;
        try (Connection connection = ConnectorCreator.getConnection();
             Statement statement = connection.createStatement()) {
            String sql = String.format(
                    "SELECT `ID`, `Role`, `Login`, `Password`, `Email` FROM `users` WHERE %d", user.getId());
            ResultSet rs = statement.executeQuery(sql);
            if (rs.next()) {
                result = new User(
                        rs.getInt("ID"),
                        rs.getString("Login"),
                        rs.getString("Password"),
                        rs.getString("Email"),
                        rs.getInt("Role")
                );
            }
        }
        return result;
    }

    public boolean update(User user) throws SQLException {
        try (Connection connection = ConnectorCreator.getConnection();
             Statement statement = connection.createStatement()) {
            String sql = String.format(
                    "UPDATE `users` SET " +
                            "`Role`=%d," +
                            "`Login`=%s," +
                            "`Password`=%s," +
                            "`Email`=[value-5] WHERE ID=%d",
                    user.getRole(), user.getLogin(), user.getPassword(), user.getEmail(), user.getId());
            return (1 == statement.executeUpdate(sql));
        }
    }

    public boolean delete(User user) throws SQLException {
        try (Connection connection = ConnectorCreator.getConnection();
             Statement statement = connection.createStatement()) {
            String sql = String.format("DELETE FROM `users` WHERE ID = %d", user.getId());
            return (1 == statement.executeUpdate(sql));
        }
    }
}
