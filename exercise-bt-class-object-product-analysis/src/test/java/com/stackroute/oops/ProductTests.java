package com.stackroute.oops;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductTests {
    private static final String MSG_01 = "check the constructor for proper initialization of properties";
    private static final String MSG_02 = "check the setter for proper setting of properties";

    private Product product;

    @BeforeEach
    public void setUp() {
        product = new Product(101, "mouse", 500, "computers");
    }

    @AfterEach
    public void tearDown() {
        product = null;
    }

    @Test
    public void givenValidPropertyValuesWhenProductObjectCreatedThenPropertiesAreSet() {
        assertEquals(101, product.getProductCode(), MSG_01);
        assertEquals("mouse", product.getName(), MSG_01);
        assertEquals(500, product.getPrice(), 0.01, MSG_01);
        assertEquals("computers", product.getCategory(), MSG_01);
    }

    @Test
    public void givenProductObjectWhenSettersExecutedThenPropertiesAreChanged() {
        product.setProductCode(102);
        product.setName("mousepad");
        product.setPrice(1500);
        product.setCategory("COMPUTERS");
        assertEquals(102, product.getProductCode(), MSG_02);
        assertEquals("mousepad", product.getName(), MSG_02);
        assertEquals(1500, product.getPrice(), 0.01, MSG_02);
        assertEquals("COMPUTERS", product.getCategory(), MSG_02);
    }

}