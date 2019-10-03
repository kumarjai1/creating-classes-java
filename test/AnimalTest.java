package test;
import src.Animal;
import src.Main;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static src.Animal.*;

public class AnimalTest {
    Animal animal = new Animal(4, 10,false, "Puppy");

    @Test
    public void testGetAnimalName() {
        assertEquals("Puppy", animal.getName());
    }

    @Test
    public void testGetTopSpeed() {
        assertEquals(10, animal.getTopSpeed());
    }

    @Test
    public void testGetIsEndangered() {
        assertEquals(false, animal.getIsEndangered());
    }

    @Test
    public void testGetNumLegs() {
        assertEquals(4, animal.getNumLegs());
    }

    @Test
    public void testSetName() {
        animal.setName("Dog");
        assertEquals("Dog", animal.getName());
    }
}

