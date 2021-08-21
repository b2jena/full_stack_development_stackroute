package com.stackroute.oops;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class ProductRepositoryTests {

    private static final String MSG_02 = "check the array returned contains the correct number of products";
    private static final String MSG_01 = "get Products should return an array of Products";

    @Test
    public void givenProductRepositoryWhenProductsFetchedThenCheckNumberOfProductsIsEight() {
        assertNotNull(ProductRepository.getProducts(), MSG_02);
        assertEquals(8, ProductRepository.getProducts().length, MSG_01);
    }
}