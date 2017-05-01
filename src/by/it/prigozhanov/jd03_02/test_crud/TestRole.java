package by.it.prigozhanov.jd03_02.test_crud;

import by.it.prigozhanov.jd03_02.beans.Role;
import by.it.prigozhanov.jd03_02.crud.RoleCRUD;

import java.sql.SQLException;

/**
 * Created by v-omf on 4/29/2017!
 */
public class TestRole {

    public static void main(String[] args) throws SQLException {
        RoleCRUD roleCRUD = new RoleCRUD();
        Role role = new Role(0, "Administrator");
        roleCRUD.create(role);

    }

}
