package com.stackroute.oops;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class VehicleServiceTests {
    private static final String MESSAGE_ONE = "Car object returned by createCar() should not be null";
    private static final String MESSAGE_TWO = "Bike object returned by createBike() should not be null";
    private static final String MESSAGE_THREE = "maxSpeed should return greatest max speed for sports type vehicles";
    private static final String MESSAGE_FOUR = "maxSpeed should return -1 if the type is not of sports type";

    private VehicleService service;

    @BeforeEach
    public void setUp() {
        service = new VehicleService();
    }

    @AfterEach
    public void tearDown() {
        service = null;
    }

    @Test
    public void givenPropertyValuesThenCreateCarObject() {
        final Car car = service.createCar("BMW", "M3", "Sports");
        Assertions.assertNotNull(car, MESSAGE_ONE);
    }

    @Test
    public void givenPropertyValuesThenCreateBikeObject() {
        final Bike bike = service.createBike("BMW", "S1000RR", "sports");
        Assertions.assertNotNull(bike, MESSAGE_TWO);
    }

    @Test
    void givenTwoVehiclesWhenCarSpeedGreaterThenReturnCarMaxSpeed() {
        final Car car = new Car("BMW", "M3", "sports");
        final Bike bike = new Bike("BMW", "S1000RR", "sports");
        Assertions.assertEquals(300, service.compareMaxSpeed(car, bike), MESSAGE_THREE);
    }

    @Test
    public void givenTwoVehiclesWhenBikeSpeedGreaterThenReturnBikeSpeed() {
        final Car car = new Car("BMW", "M3", "sports");
        final Bike bike = new Bike("BMW", "S1000RR", "sports");
        Assertions.assertEquals(300, service.compareMaxSpeed(car, bike), MESSAGE_THREE);
    }

    @Test
    public void givenTwoVehiclesWhenNotSportsTypeThenReturnMinusOne() {
        final Car car = new Car("Maruti Suziki", "Ciaz", "sedan");
        final Bike bike = new Bike("BMW", "S1000RR", "sports");
        Assertions.assertEquals(-1, service.compareMaxSpeed(car, bike), MESSAGE_FOUR);
    }


}
