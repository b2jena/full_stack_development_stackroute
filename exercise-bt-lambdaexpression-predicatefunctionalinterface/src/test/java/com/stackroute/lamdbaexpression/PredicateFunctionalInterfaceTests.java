package com.stackroute.lamdbaexpression;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class PredicateFunctionalInterfaceTests {
    private PredicateFunctionalInterface predicateFunctionalInterface;
    private static final String MESSAGE = "Check the logic of your method findPattern";

    @BeforeEach
    public void setUp() {
        predicateFunctionalInterface = new PredicateFunctionalInterface();
    }

    @AfterEach
    public void tearDown() {
        predicateFunctionalInterface = null;
    }

    @Test
    public void givenListOfStringsThenReturnResult() {
        List<String> inputList = Arrays.asList("America", "India", "Russia", "China", "Japan", "Indonesia");
        List<String> output = Arrays.asList("India", "Indonesia");
        assertEquals(output, predicateFunctionalInterface.findPattern(inputList), MESSAGE);
    }

    @Test
    public void givenListOfStringsWithoutIThenReturnResult() {
        List<String> inputList = Arrays.asList("America", "China", "Japan", "Nepal");
        List<String> output = new ArrayList<>();
        assertEquals(output, predicateFunctionalInterface.findPattern(inputList), MESSAGE);
    }

    @Test
    public void givenListOfStringsWithMultipleOccurrencesThenReturnResult() {
        List<String> inputList = Arrays.asList("Indonesia", "Italy", "America", "India", "India", "China", "Italy", "Japan", "Indonesia");
        List<String> output = Arrays.asList("Indonesia", "Italy", "India");
        assertEquals(output, predicateFunctionalInterface.findPattern(inputList), MESSAGE);
    }

    @Test
    public void givenListThenReturnNotNull() {
        List<String> inputList = Arrays.asList("India");
        assertNotNull(predicateFunctionalInterface.findPattern(inputList), MESSAGE);
    }

    @Test
    public void givenEmptyListThenReturnEmptyList() {
        List<String> inputList = Arrays.asList();
        List<String> output = Arrays.asList();
        assertEquals(output, predicateFunctionalInterface.findPattern(inputList), MESSAGE);
    }

}
