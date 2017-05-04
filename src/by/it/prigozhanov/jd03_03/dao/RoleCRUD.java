package by.it.prigozhanov.jd03_03.dao;

import by.it.prigozhanov.jd03_03.beans.Role;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

/**
 * Created by v-omf on 4/29/2017!
 */
public class RoleCRUD extends AbstractDAO implements InterfaceDAO<Role> {
    @Override
    public boolean create(Role role) throws SQLException {
        String sql = String.format(
                "INSERT INTO `roles`(`Role`)" +
                        " VALUES ('%s')", role.getRole()
        );
        int id = executeCreate(sql);
        if (id > 0) {
            role.setId(id);
            return true;
        }
        return false;
    }

    @Override
    public Role read(int id) throws SQLException {
        Role result = null;
        try (Connection connection = ConnectorCreator.getConnection();
             Statement statement = connection.createStatement()) {
            String sql = String.format("SELECT `ID`, `Role` FROM `roles` WHERE ID=%d", id);
            ResultSet keys = statement.executeQuery(sql);
            if (keys.next()) {
                result = new Role(keys.getInt("ID"), keys.getString("Role"));
            }
        }
        return result;
    }

    @Override
    public boolean update(Role role) throws SQLException {
        try (Connection connection = ConnectorCreator.getConnection();
             Statement statement = connection.createStatement()) {
            String sql = String.format(
                    "UPDATE `roles` SET `Role`='%s' WHERE ID=%d",
                    role.getRole(), role.getId()
            );
            return (1 == statement.executeUpdate(sql));
        }
    }

    @Override
    public boolean delete(Role role) throws SQLException {
        try (Connection connection = ConnectorCreator.getConnection();
             Statement statement = connection.createStatement()) {
            String sql = String.format("DELETE FROM `roles` WHERE ID = %d", role.getId());
            return (1 == statement.executeUpdate(sql));
        }
    }

    @Override
    public List getAll(String whereString) {
        return null;
    }
}



