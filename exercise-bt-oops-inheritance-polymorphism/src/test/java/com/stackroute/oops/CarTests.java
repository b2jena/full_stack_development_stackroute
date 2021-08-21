package com.stackroute.oops;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CarTests {

    private static final String MESSAGE_ONE = "Car object should be of type AbstractManufacturer and Vehicle";
    private static final String MESSAGE_TWO = "Car properties not set properly by constructor";
    private static final String MESSAGE_THREE = "Returned value of MaxSpeed is not correct";
    private static final String MESSAGE_FOUR = "Manufacturer details displayed is not correct";

    private Car car;

    @BeforeEach
    public void setUp() {
        car = new Car("Maruti Suziki", "Baleno", "sedan");
    }

    @AfterEach
    public void tearDown() {
        car = null;
    }

    @Test
    public void giveCarClassThenShouldBeOfVehicleType() {
        Assertions.assertTrue(Vehicle.class.isAssignableFrom(Car.class), MESSAGE_ONE);
    }

    @Test
    public void giveCarClassThenShouldBeOfManufacturerType() {
        Assertions.assertTrue(AbstractManufacturer.class.isAssignableFrom(Car.class), MESSAGE_ONE);
    }

    @Test
    public void givenCarObjectThenPropertiesAreSet() {
        Assertions.assertEquals("Maruti Suziki", car.getName(), MESSAGE_TWO);
        Assertions.assertEquals("Baleno", car.getModelName(), MESSAGE_TWO);
        Assertions.assertEquals("sedan", car.getType(), MESSAGE_TWO);
    }

    @Test
    public void givenCarObjectThenGetMaxSpeed() {
        Assertions.assertEquals(190, car.maxSpeed(car.getType()), MESSAGE_THREE);
    }

    @Test
    public void givenCarObjectThenGetManufacturerInformation() {
        String expected = "Car{Manufacturer Name:Maruti Suziki,Model Name:Baleno,Type:sedan}";
        Assertions.assertEquals(car.getManufacturerInformation().toLowerCase(), expected.toLowerCase(), MESSAGE_FOUR);
    }
}
