package com.stackroute.oops;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AbstractManufacturerTests {
    private final static String MESSAGE_ONE = "AbstractManufacturer should have name property";
    private final static String MESSAGE_TWO = "AbstractManufacturer should have modelName property";
    private final static String MESSAGE_THREE = "AbstractManufacturer should have type property";

    private AbstractManufacturer car;
    private AbstractManufacturer bike;

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
    public void givenAbstractManufacturerObjectWhenCarThenShouldSetName() {
        Assertions.assertEquals("Maruti Suziki", car.getName(), MESSAGE_ONE);
    }

    @Test
    public void givenAbstractManufacturerObjectWhenCarThenShouldSetModelName() {
        Assertions.assertEquals("Baleno", car.getModelName(), MESSAGE_TWO);
    }

    @Test
    public void givenAbstractManufacturerObjectWhenCarThenShouldSetType() {
        Assertions.assertEquals("sedan", car.getType(), MESSAGE_THREE);
    }

    @Test
    public void givenAbstractManufacturerObjectWhenBikeThenShouldSetName() {
        Assertions.assertEquals("BMW", bike.getName(), MESSAGE_ONE);
    }

    @Test
    public void givenAbstractManufacturerObjectWhenBikeThenShouldSetModelName() {
        Assertions.assertEquals("S1000RR", bike.getModelName(), MESSAGE_TWO);
    }

    @Test
    public void givenAbstractManufacturerObjectWhenBikeThenShouldSetType() {
        Assertions.assertEquals("sports", bike.getType(), MESSAGE_THREE);
    }
}
