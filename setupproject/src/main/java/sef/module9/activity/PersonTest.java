
package sef.module9.activity;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PersonTest {

    private Person person;

    @Before
    public void setUp() throws Exception {
        // Initialize person object
        person = new Person();
    }

    @After
    public void tearDown() throws Exception {
        // Set person to null
        person = null;
    }

    @Test
    public void testGettersAndSetters() {
        // Test setWeight/getWeight and setHeight/getHeight
        person.setWeight(55);
        person.setHeight(1.72F);

        assertEquals(55, person.getWeight());
        assertEquals(1.72F, person.getHeight(), 0.01F);
    }

    @Test
    public void testGetBodyMassIndex() {

        // Test valid BMI categories
        assertEquals("Underweight", person.getBodyMassIndex(50, 1.72));
        assertEquals("Normal weight", person.getBodyMassIndex(65, 1.72));
        assertEquals("Overweight", person.getBodyMassIndex(80, 1.72));
        assertEquals("Obese", person.getBodyMassIndex(90, 1.72));

        // Test invalid inputs
        assertEquals("Invalid input", person.getBodyMassIndex(-65, 1.72));
        assertEquals("Invalid input", person.getBodyMassIndex(800, 1.72));
        assertEquals("Invalid input", person.getBodyMassIndex(0, 1.72));

        assertEquals("Invalid input", person.getBodyMassIndex(55, 6.7));
        assertEquals("Invalid input", person.getBodyMassIndex(55, 0));
        assertEquals("Invalid input", person.getBodyMassIndex(62, -60));
    }
}
