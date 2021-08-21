package com.stackroute.oops;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BikeTests {
    private static final String MESSAGE_ONE = "Bike object should be of type AbstractManufacturer and Vehicle";
    private static final String MESSAGE_TWO = "Bike properties not set properly by constructor";
    private static final String MESSAGE_THREE = "Returned value of MaxSpeed is not correct";
    private static final String MESSAGE_FOUR = "Manufacturer details displayed is not correct";

    private Bike bike;

    @BeforeEach
    public void setUp() {
        bike = new Bike("Eicher Motors", "Royal Enfield Classic 350", "cruiser");
    }

    @AfterEach
    public void tearDown() {
        bike = null;
    }

    @Test
    public void giveBikeClassThenShouldBeOfVehicleType() {
        Assertions.assertTrue(Vehicle.class.isAssignableFrom(Bike.class), MESSAGE_ONE);
    }

    @Test
    public void giveCarClassThenShouldBeOfManufacturerType() {
        Assertions.assertTrue(AbstractManufacturer.class.isAssignableFrom(Car.class), MESSAGE_ONE);
    }

    @Test
    public void givenCarObjectThenPropertiesAreSet() {
        Assertions.assertEquals("Eicher Motors", bike.getName(), MESSAGE_TWO);
        Assertions.assertEquals("Royal Enfield Classic 350", bike.getModelName(), MESSAGE_TWO);
        Assertions.assertEquals("cruiser", bike.getType(), MESSAGE_TWO);
    }

    @Test
    public void givenCarObjectThenGetMaxSpeed() {
        Assertions.assertEquals(170, bike.maxSpeed(bike.getType()), MESSAGE_THREE);
    }

    @Test
    public void givenCarObjectThenGetManufacturerInformation() {
        String expected = "Bike{Manufacturer Name:Eicher Motors,Model Name:Royal Enfield Classic 350,Type:cruiser}";
        Assertions.assertEquals(bike.getManufacturerInformation().toLowerCase(), expected.toLowerCase(), MESSAGE_FOUR);
    }
}
