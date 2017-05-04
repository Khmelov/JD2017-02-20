package by.it.prigozhanov.jd03_03.dao.tests;


import by.it.prigozhanov.jd03_03.beans.Role;
import by.it.prigozhanov.jd03_03.dao.RoleCRUD;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Created by v-omf on 5/2/2017.
 *
 * @author v-omf
 */
public class RoleCRUDTest {
    private static RoleCRUD roleCRUD = new RoleCRUD();

    @Test
    public void testUser() throws Exception {
        Role role = new Role(1,"Test");
        assertTrue(roleCRUD.create(role));
        assertNotNull(roleCRUD.read(1));
        assertTrue(roleCRUD.update(role));
        assertTrue(roleCRUD.delete(role));
    }


}