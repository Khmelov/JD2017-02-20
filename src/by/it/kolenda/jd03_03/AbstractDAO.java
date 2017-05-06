package by.it.kolenda.jd03_03;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AbstractDAO {

    int executeCreate(String sql) throws SQLException {
        try (Connection connection = ConnectionCreator.getConnection();
             Statement statement = connection.createStatement()) {
            if (1==statement.executeUpdate(sql, Statement.RETURN_GENERATED_KEYS)){
                ResultSet keys = statement.getGeneratedKeys();
                if (keys.next()){
                    return keys.getInt(1);
                }
            }
            return -1;
        }
    }
    boolean executeUpdate (String sql) throws SQLException {
        try (Connection connection = ConnectionCreator.getConnection();
             Statement statement = connection.createStatement()){
            return (statement.executeUpdate(sql)>0);
        }
    }
}
