package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CustomListTest {
    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);
        // This will fail initially because hasCity() doesn't exist
        assertTrue(list.hasCity(calgary));
    }

    @Test
    public void testDeleteCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");

        list.addCity(calgary);
        assertTrue(list.hasCity(calgary));

        list.deleteCity(calgary);

        // This will fail initially because deleteCity() doesn't exist
        assertFalse(list.hasCity(calgary));
    }

    @Test
    void testCountCities() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");

        list.addCity(calgary);
        assertTrue(list.hasCity(calgary));

        assertEquals(1, list.countCities());

        City city = new City("Islamabad", "Punjab");
        list.addCity(city);
        assertEquals(2, list.countCities());

        list.deleteCity(city);
        assertEquals(1, list.countCities());
    }
}
