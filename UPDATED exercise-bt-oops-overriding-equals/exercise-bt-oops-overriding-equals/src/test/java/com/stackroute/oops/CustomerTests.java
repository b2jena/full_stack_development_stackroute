package com.stackroute.oops;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CustomerTests {
    public static final String ACTIVE = "active";
    private static final String MSG_01 = "check the constructor for proper initialization of properties";
    private static final String MSG_02 = "equals methods should return true for customer objects having same property values";
    private static final String MSG_03 = "equals methods should return false when customer objects having different property values";
    private static final String MSG_04 = "equals methods should return false when the passed other customer object is null";
    private static final String MSG_05 = "equals methods should return false when customer objects are compared with other object types";
    private static final String MSG_06 = "equals methods should return false when the property values of one of the customer object is null";

    private Customer customerOne;
    private Customer customerTwo;
    private Address addressOne;
    private Address addressTwo;

    @BeforeEach
    public void setUp() {
        addressOne = new Address("HSR", "Bangalore");
        addressTwo = new Address("HSR", "Bangalore");
        customerOne = new Customer(101, "John", "john@stackroute.in", addressOne);
        customerTwo = new Customer(101, "John", "john@stackroute.in", addressTwo);
    }

    @AfterEach
    public void tearDown() {
        addressOne = null;
        addressTwo = null;
        customerOne = null;
        customerTwo = null;
    }

    @Test
    public void givenValidPropertyValuesWhenCustomerObjectCreatedThenPropertiesAreSet() {
        assertEquals(101, customerOne.getCustomerId(), MSG_01);
        assertEquals("John", customerOne.getName(), MSG_01);
        assertEquals("john@stackroute.in", customerOne.getEmail(), MSG_01);
        assertNotNull(customerOne.getAddress(), MSG_01);
    }

    @Test
    public void givenTwoCustomerObjectsWhenPropertyValuesAreSameThenReturnTrue() {
        assertTrue(customerOne.equals(customerTwo), MSG_02);
        assertTrue(customerTwo.equals(customerOne), MSG_02);
    }

    @Test
    public void givenTwoCustomerObjectsWhenCreatedUsingDefaultConstructorThenReturnTrue() {
        customerOne = new Customer();
        customerTwo = new Customer();
        assertTrue(customerOne.equals(customerTwo), MSG_02);
        assertTrue(customerTwo.equals(customerOne), MSG_02);
    }

    @Test
    public void givenCustomerObjectWhenComparedWithItselfThenEqualsShouldReturnTrue() {
        assertTrue(customerOne.equals(customerOne), MSG_02);
        assertTrue(customerTwo.equals(customerTwo), MSG_02);
    }

    @Test
    public void givenTwoCustomerObjectsWhenPropertyValuesAreDifferentThenEqualsMethodReturnsFalse() {
        customerOne.setCustomerId(102);
        assertFalse(customerOne.equals(customerTwo), MSG_03);
        assertFalse(customerTwo.equals(customerOne), MSG_03);
    }

    @Test
    public void givenTwoCustomerObjectsWhenAddressValuesAreDifferentThenEqualsMethodReturnsFalse() {
        customerOne.getAddress().setCity("Mangalore");
        assertFalse(customerOne.equals(customerTwo), MSG_03);
        assertFalse(customerTwo.equals(customerOne), MSG_03);
    }

    @Test
    public void givenTwoCustomerObjectsWhenPassedCustomerObjectIsNullThenEqualsMethodReturnsFalse() {
        customerTwo = null;
        assertFalse(customerOne.equals(customerTwo), MSG_04);
    }

    @Test
    public void givenCustomerObjectsWhenOtherObjectIsNotCustomerThenEqualsMethodReturnsFalse() {
        String sample = "sample";
        assertFalse(customerOne.equals(sample), MSG_05);
    }

    @Test
    public void givenTwoCustomerObjectsWhenBothObjectsPropertyValueIsNullThenEqualsMethodReturnsTrue() {
        customerOne.setEmail(null);
        customerTwo.setEmail(null);

        assertTrue(customerOne.equals(customerTwo), MSG_02);
        assertTrue(customerTwo.equals(customerOne), MSG_02);
    }


    @Test
    public void givenTwoCustomerObjectsWhenOneObjectsPropertyValuesIsNullThenEqualsMethodReturnsFalse() {
        customerTwo.setEmail(null);
        assertFalse(customerOne.equals(customerTwo), MSG_06);
        assertFalse(customerTwo.equals(customerOne), MSG_06);
    }

}