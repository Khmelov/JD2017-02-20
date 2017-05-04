package by.it.prigozhanov.jd03_03.dao.tests;

import by.it.prigozhanov.jd03_03.beans.Car;
import by.it.prigozhanov.jd03_03.dao.CarCRUD;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Created by v-omf on 5/2/2017.
 *
 * @author v-omf
 */
public class CarCRUDTest {
    private static CarCRUD carCRUD = new CarCRUD();

    @Test
    public void testUser() throws Exception {
        Car car = new Car(1,"MarkTest", "ModelTest", 60, "LicationTest", 6);
        assertTrue(carCRUD.create(car));
        assertNotNull(carCRUD.read(car));
        assertTrue(carCRUD.update(car));
        assertTrue(carCRUD.delete(car));
    }
}