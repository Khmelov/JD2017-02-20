package by.it.prigozhanov.project.java.dao.tests;

import by.it.prigozhanov.project.java.beans.Car;
import by.it.prigozhanov.project.java.dao.DAO;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by v-omf on 5/6/2017!
 */
public class CarDAOTest {
    Car car = new Car(0, "Porsche", "Carrera", 650, "Minsk", 2, 2000, 4, 10);
    DAO dao = DAO.getInstance();
    @Test
    public void create() throws Exception {
        assertTrue(dao.car.create(car));
    }

    @Test
    public void read() throws Exception {
        assertNotNull(dao.car.update(car));

    }

    @Test
    public void update() throws Exception {
        assertTrue(dao.car.update(car));
    }

    @Test
    public void delete() throws Exception {
        assertTrue(dao.car.delete(car));
    }

    @Test
    public void getAll() throws Exception {
        assertNotNull(dao.car.getAll(""));
    }

}