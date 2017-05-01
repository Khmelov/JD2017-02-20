package by.it.prigozhanov.jd03_02.crud;

import by.it.prigozhanov.jd03_02.beans.Role;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by v-omf on 4/29/2017!
 */
public class RoleCRUD {

    public boolean create(Role role) throws SQLException {
        try (Connection connection = ConnectorCreator.getConnection();
             Statement statement = connection.createStatement()) {
            String sql = String.format("INSERT INTO `role` " + "VALUES ('%s')", role.getRole());
            if (1==statement.executeUpdate(sql, Statement.RETURN_GENERATED_KEYS)) {
                ResultSet keys = statement.getGeneratedKeys();
                if (keys.next()) {
                    int id = keys.getInt(1);
                    role.setId(id);
                    return true;
                }
            }
        return false;
        }

    }

    public boolean update(Role role) throws SQLException {
        try (Connection connection = ConnectorCreator.getConnection();
             Statement statement = connection.createStatement()) {
            String sql = String.format("INSERT INTO `roles` " + "VALUES ('%s')", role.getRole());
            if (1==statement.executeUpdate(sql, Statement.RETURN_GENERATED_KEYS)) {
                ResultSet keys = statement.getGeneratedKeys();
                if (keys.next()) {
                    int id = keys.getInt(1);
                    role.setId(id);
                    return true;
                }
            }
        return false;
        }

    }



}