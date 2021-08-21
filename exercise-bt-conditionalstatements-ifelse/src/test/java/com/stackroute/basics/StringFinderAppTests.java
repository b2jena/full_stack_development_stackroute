package com.stackroute.basics;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringFinderAppTests {
    private static final String FOUND = "Found as expected";
    private static final String NOT_FOUND = "Not found";
    private static final String EMPTY = "Empty string or null";
    private static String input = "";
    private static final String MESSAGE_ONE = "Search string is found as expected";
    private static final String MESSAGE_TWO = "Search string is not found as expected";
    private static final String MESSAGE_THREE = "String is empty or null";
    private ByteArrayOutputStream myOutStream;
    private ByteArrayInputStream myInputStream;
    private static final String[] VALID_VALUES = {"string finder", "string", "finder"};
    private static final String[] INVALID_VALUES = {"string finder", "finder", "string"};
    private static final String[][] EMPTY_VALUES = {{"", "finder", "string"}, {"string not found", "", "string"}};

    @BeforeEach
    public void setUp() {
        myOutStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(myOutStream));
    }

    @AfterEach
    public void tearDown() {
        myOutStream = null;
    }

    @Test
    public void givenValidValuesWhenCheckedThenDisplayFound() {
        input = VALID_VALUES[0] + "\n" + VALID_VALUES[0] + "\n" + VALID_VALUES[2] + "\n";
        myInputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(myInputStream);

        StringFinder.main(null);
        String actual = myOutStream.toString().toLowerCase().replaceAll("\\s+", "");
        assertEquals(FOUND.toLowerCase().replaceAll("\\s+", ""), actual, MESSAGE_ONE);
    }

    @Test
    public void givenInvalidValuesSWhenCheckedThenDisplayNotFound() {
        input = INVALID_VALUES[0] + "\n" + INVALID_VALUES[1] + "\n" + INVALID_VALUES[2] + "\n";
        myInputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(myInputStream);

        StringFinder.main(null);
        String actual = myOutStream.toString().toLowerCase().replaceAll("\\s+", "");
        assertEquals(NOT_FOUND.toLowerCase().replaceAll("\\s+", ""), actual, MESSAGE_TWO);
    }

    @Test
    public void givenEmptyValuesForSearchStringWhenCheckedThenDisplayEmpty() {
        input = EMPTY_VALUES[0][0] + "\n" + EMPTY_VALUES[0][1] + "\n" + EMPTY_VALUES[0][2] + "\n";
        myInputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(myInputStream);

        StringFinder.main(null);
        String actual = myOutStream.toString().toLowerCase().replaceAll("\\s+", "");
        assertEquals(EMPTY.toLowerCase().replaceAll("\\s+", ""), actual, MESSAGE_THREE);
    }

    @Test
    public void givenEmptyValuesForFirstStringWhenCheckedThenDisplayEmpty() {
        input = EMPTY_VALUES[1][0] + "\n" + EMPTY_VALUES[1][1] + "\n" + EMPTY_VALUES[1][2] + "\n";
        myInputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(myInputStream);

        StringFinder.main(null);
        String actual = myOutStream.toString().toLowerCase().replaceAll("\\s+", "");
        assertEquals(EMPTY.toLowerCase().replaceAll("\\s+", ""), actual, MESSAGE_THREE);
    }
}
