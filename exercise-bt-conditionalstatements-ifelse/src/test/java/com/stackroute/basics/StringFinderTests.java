package com.stackroute.basics;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringFinderTests {
    private static final String MESSAGE_ONE = "Should return 1 when string found as expected";
    private static final String MESSAGE_TWO = "Should return 0 when string is not found as expected";
    private static final String MESSAGE_THREE = "Should return -1 for empty or null values";
    private static StringFinder object;
    private static final String[][] VALID_VALUES = {{"string finder", "string", "finder"}, {"string comes later", "string", "later"}};
    private static final String[][] INVALID_VALUES = {{"string finder", "finder", "string"}, {"string does not comes later", "later", "string"},
            {"String not matching", "new", "matching"}, {"string not matching", "string", "value"}};
    private static final String[][] EMPTY_VALUES = {{"", "finder", "string"}, {"string comes later", "", "string"},
            {"string", "first", ""}, {"", "", ""}, {null, "value1", "value2"}, {"string values", null, null}, {null, null, null}};

    @BeforeEach
    public void setUp() {
        // This methods runs, before running each test case
        // This method is used to initialize the required variables
        object = new StringFinder();
    }

    @AfterEach
    public void tearDown() {
        // This method runs, after running each test case
        // This method is used to clear the initialized variables
        object = null;
    }

    @Test
    void givenValidValuesWhenCheckedThenReturnOne() {
        assertEquals(1, object.findString(VALID_VALUES[0][0], VALID_VALUES[0][1], VALID_VALUES[0][2]), MESSAGE_ONE);
        assertEquals(1, object.findString(VALID_VALUES[1][0], VALID_VALUES[1][1], VALID_VALUES[1][2]), MESSAGE_ONE);
    }

    @Test
    void givenInvalidValuesWhenCheckedThenReturnZero() {
        assertEquals(0, object.findString(INVALID_VALUES[0][0], INVALID_VALUES[0][1], INVALID_VALUES[0][2]), MESSAGE_TWO);
        assertEquals(0, object.findString(INVALID_VALUES[1][0], INVALID_VALUES[1][1], INVALID_VALUES[1][2]), MESSAGE_TWO);
        assertEquals(0, object.findString(INVALID_VALUES[2][0], INVALID_VALUES[2][1], INVALID_VALUES[2][2]), MESSAGE_TWO);
        assertEquals(0, object.findString(INVALID_VALUES[3][0], INVALID_VALUES[3][1], INVALID_VALUES[3][2]), MESSAGE_TWO);
    }

    @Test
    void givenEmptyOrNullValuesWhenCheckedThenReturnMinusOne() {
        assertEquals(-1, object.findString(EMPTY_VALUES[0][0], EMPTY_VALUES[0][1], EMPTY_VALUES[0][2]), MESSAGE_THREE);
        assertEquals(-1, object.findString(EMPTY_VALUES[1][0], EMPTY_VALUES[1][1], EMPTY_VALUES[1][2]), MESSAGE_THREE);
        assertEquals(-1, object.findString(EMPTY_VALUES[2][0], EMPTY_VALUES[2][1], EMPTY_VALUES[2][2]), MESSAGE_THREE);
        assertEquals(-1, object.findString(EMPTY_VALUES[3][0], EMPTY_VALUES[3][1], EMPTY_VALUES[3][2]), MESSAGE_THREE);
        assertEquals(-1, object.findString(EMPTY_VALUES[4][0], EMPTY_VALUES[4][1], EMPTY_VALUES[4][2]), MESSAGE_THREE);
        assertEquals(-1, object.findString(EMPTY_VALUES[5][0], EMPTY_VALUES[5][1], EMPTY_VALUES[5][2]), MESSAGE_THREE);
        assertEquals(-1, object.findString(EMPTY_VALUES[6][0], EMPTY_VALUES[6][1], EMPTY_VALUES[6][2]), MESSAGE_THREE);
    }
}


