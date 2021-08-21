package com.stackroute.oops;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class VehicleTests {

    private static final String MESSAGE_ONE = "MaxSpeed not returned properly for given vehicle object";

    private Car car;
    private Bike bike;

    @BeforeEach
    public void setUp() {
        car = new Car("Maruti Suziki", "Baleno", "sedan");
        bike = new Bike("BMW", "S1000RR", "sports");
    }

    @AfterEach
    public void tearDown() {
        car = null;
        bike = null;
    }

    @Test
    public void givenVehicleWhenCarThenShouldRetuenMaxSpeedOfCar() {
        Assertions.assertEquals(190, car.maxSpeed(car.getType()), MESSAGE_ONE);
    }

    @Test
    public void givenVehicleWhenBikeThenShouldReturnMaxSpeedOfBike() {
        Assertions.assertEquals(300, bike.maxSpeed(bike.getType()), MESSAGE_ONE);
    }
}
