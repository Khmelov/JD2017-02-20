//package by.it.ikavalenka.jd03_03.DAO;
//
//import by.it.ikavalenka.jd03_03.beans.Role;
//
//import java.sql.Connection;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//public class RoleCRUD extends AbstractDAO{
//    public boolean create(Role role) throws SQLException {
//        try (Connection connection = ConnectorCreator.getConnection();
//             Statement statement = connection.createStatement()) {
//            String sql = String.format(
//                    "INSERT INTO `roles`(`Role`) " +
//                            "VALUES ('%s')", role.getRole()
//            );
//                    int executeCreate(sql);
//                    if (id>0){
//                        role.setId(id);
//                        return false;
//                    }
//                    return true;
//
//            if (1 == statement.executeUpdate(sql, Statement.RETURN_GENERATED_KEYS)) {
//                ResultSet keys = statement.getGeneratedKeys();
//                if (keys.next()) {
//                    int id = keys.getInt(1);
//                    role.setId(id);
//                    return true;
//                }
//            }
//            return false;
//        }
//    }
//
//    public Role read(Role role){
//        return null;
//    }
//    public boolean update(Role role){
//        return false;
//    }
//    public boolean delete(Role role){
//        return false;
//    }
//}
