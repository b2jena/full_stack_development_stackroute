package com.stackroute.exercises;


import org.junit.jupiter.api.*;

import java.util.Arrays;


import static org.junit.jupiter.api.Assertions.*;

public class StringSortTests {

    private StringSort stringSort;
    private String message = "Check the logic in method stringSorter, method should return error string when";
    private String expectedErrorMessage = "Given stringList or sortingOrder is empty, null or blank space";

    @BeforeEach
    public void setUp() {
        stringSort = new StringSort();
    }

    @AfterEach
    public void tearDown() {
        stringSort = null;
    }

    @Test
    public void givenStringListAndStringWhenSortedThenReturnAStringResult() {
        String message = "Check the logic in method stringSorter";
        assertEquals("[Kennedy, John, Apple]", stringSort.stringSorter(Arrays.asList("Kennedy", "Apple", "John"), "desc"), message);
        assertEquals("[Apple, John, Kennedy]", stringSort.stringSorter(Arrays.asList("Kennedy", "Apple", "John"), "ASC"), message);
    }

    @Test
    public void givenStringListAndWrongStringWhenSortedThenReturnAnErrorString() {
        assertEquals("No sorting order present for given string 'demo' , 'asc' for ascending order sort and 'desc' for descending order sort", stringSort.stringSorter(Arrays.asList("Kennedy", "John", "Apple"), "demo"), message + " sortingOrder has value which is not 'asc' or 'desc'");
    }

    @Test
    public void givenEmptyStringListAndStringWhenSortedThenReturnAnErrorString() {
        String errorMessage = message + " stringList or sortingOrder is empty";
        assertEquals(expectedErrorMessage, stringSort.stringSorter(Arrays.asList("Kennedy", "John", "Apple"), ""), errorMessage);
        assertEquals(expectedErrorMessage, stringSort.stringSorter(Arrays.asList(), "desc"), errorMessage);
        assertEquals(expectedErrorMessage, stringSort.stringSorter(Arrays.asList(), ""), errorMessage);
    }

    @Test
    public void givenSingletonStringListAndStringWhenSortedThenReturnAnErrorString() {
        assertEquals("The list contains only one value", stringSort.stringSorter(Arrays.asList("Kennedy"), "asc"), message + " stringList has only one value");
    }

    @Test
    public void givenStringListWithEmptyValueAndStringWhenSortedThenReturnAnErrorString() {

        assertEquals("The list contains an empty or blank space value", stringSort.stringSorter(Arrays.asList("Kennedy", ""), "asc"), message + " stringList has empty value");
        assertEquals("The list contains an empty or blank space value", stringSort.stringSorter(Arrays.asList(""), "desc"), message + " stringList has empty value");
    }

    @Test
    public void givenStringListWithBlankSpaceValueAndStringWhenSortedThenReturnAnErrorString() {
        assertEquals("The list contains an empty or blank space value", stringSort.stringSorter(Arrays.asList("Kennedy", " "), "asc"), message + " stringList has blank space value");
        assertEquals("The list contains an empty or blank space value", stringSort.stringSorter(Arrays.asList(" "), "desc"), message + " stringList has blank space value");
    }

    @Test
    public void givenStringListAndBlankSpaceStringWhenSortedThenReturnAnErrorString() {
        assertEquals(expectedErrorMessage, stringSort.stringSorter(Arrays.asList("Kennedy", "John", "Apple"), " "), message + " sortingOrder is blank space");
    }

    @Test
    public void givenNullStringListAndStringWhenSortedThenReturnAnErrorString() {
        String errorMessage = message + " stringList or sortingOrder is null";
        assertEquals(expectedErrorMessage, stringSort.stringSorter(Arrays.asList("Kennedy", "John", "Apple"), null), errorMessage);
        assertEquals(expectedErrorMessage, stringSort.stringSorter(null, "asc"), errorMessage);
        assertEquals(expectedErrorMessage, stringSort.stringSorter(null, null), errorMessage);
    }

}
