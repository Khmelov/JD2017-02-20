package by.it.prigozhanov.jd03_03;

import by.it.prigozhanov.jd03_03.beans.Car;
import by.it.prigozhanov.jd03_03.beans.Role;
import by.it.prigozhanov.jd03_03.beans.User;
import by.it.prigozhanov.jd03_03.dao.DAO;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by v-omf on 5/4/2017.
 *
 * @author v-omf
 */
public class TestDaoRunner {
    public static void main(String[] args) throws SQLException {
        DAO dao = DAO.getInstance();
        List<User> users = dao.user.getAll("");
        System.out.println(users);
        List<Role> roles = dao.role.getAll("");
        System.out.println(roles);
        List<Car> cars = dao.car.getAll("");
        System.out.println(cars);
    }

}
