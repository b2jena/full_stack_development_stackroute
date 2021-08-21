package com.stackroute.oops;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddressTests {

    private static final String MSG_01 = "check the constructor for proper initialization of properties";
    private static final String MSG_02 = "equals methods should return true when Address objects are having same property values";
    private static final String MSG_03 = "equals methods should return false when Address objects having different property values";
    private static final String MSG_04 = "equals methods should return false when the passed other Address object is null";
    private static final String MSG_05 = "equals methods should return false when Address objects are compared with other object types";
    private static final String MSG_06 = "equals methods should return false when the property values of one of the Address object is null";

    private Address addressOne;
    private Address addressTwo;

    @BeforeEach
    public void setUp() {
        addressOne = new Address("HSR", "Bangalore");
        addressTwo = new Address("HSR", "Bangalore");
    }

    @AfterEach
    public void tearDown() {
        addressOne = null;
        addressTwo = null;
    }

    @Test
    public void givenValidPropertyValuesWhenAddressObjectCreatedThenPropertiesAreSet() {
        assertEquals("HSR", addressOne.getArea(), MSG_01);
        assertEquals("Bangalore", addressOne.getCity(), MSG_01);
    }

    @Test
    public void givenTwoAddressObjectsWhenPropertyValuesAreSameThenEqualsMethodReturnsTrue() {
        assertTrue(addressOne.equals(addressTwo), MSG_02);
        assertTrue(addressTwo.equals(addressOne), MSG_02);
    }

    @Test
    public void givenTwoAddressObjectsWhenPropertyValuesAreDifferentThenEqualsMethodReturnsFalse() {
        addressTwo.setCity("Mangalore");
        assertFalse(addressOne.equals(addressTwo), MSG_03);
        assertFalse(addressTwo.equals(addressOne), MSG_03);
    }

    @Test
    public void givenTwoAddressObjectsWhenPassedAddressObjectIsNullThenEqualsMethodReturnsFalse() {
        addressTwo = null;
        assertFalse(addressOne.equals(addressTwo), MSG_04);
    }

    @Test
    public void givenAddressObjectsWhenOtherObjectIsNotAddressThenEqualsMethodReturnsFalse() {
        String sample = "sample";
        assertFalse(addressOne.equals(sample), MSG_05);
    }

    @Test
    public void givenTwoAddressObjectsWhenBothObjectsPropertyValueIsNullThenEqualsMethodReturnsTrue() {
        addressOne.setCity(null);
        addressTwo.setCity(null);
        assertTrue(addressOne.equals(addressTwo), MSG_02);
        assertTrue(addressTwo.equals(addressOne), MSG_02);
    }

    @Test
    public void givenTwoAddressObjectsWhenOneObjectsPropertyValuesIsNullThenEqualsMethodReturnsFalse() {
        addressOne.setCity(null);
        assertFalse(addressOne.equals(addressTwo), MSG_06);
        assertFalse(addressTwo.equals(addressOne), MSG_06);
    }
}