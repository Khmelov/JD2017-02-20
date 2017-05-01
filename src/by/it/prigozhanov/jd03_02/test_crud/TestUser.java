package by.it.prigozhanov.jd03_02.test_crud;

import by.it.prigozhanov.jd03_02.beans.User;
import by.it.prigozhanov.jd03_02.crud.UserCRUD;

import java.sql.SQLException;

/**
 * Created by v-omf on 4/29/2017!
 */
public class TestUser {
    public static void main(String[] args) throws SQLException {
        UserCRUD userCRUD = new UserCRUD();
        User user = new User(1, "Ltest", "Ptest", "Mtest", 2);
        System.out.println(user);
        if (userCRUD.create(user)) {
            System.out.println("CREATE" + user);
        }
    }

}
