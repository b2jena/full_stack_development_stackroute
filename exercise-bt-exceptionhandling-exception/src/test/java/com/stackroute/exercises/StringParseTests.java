package com.stackroute.exercises;

import org.junit.jupiter.api.*;


import static org.junit.jupiter.api.Assertions.*;

public class StringParseTests {

    private StringParse stringParse;

    @BeforeEach
    public void setUp() {
        stringParse = new StringParse();
    }

    @AfterEach
    public void tearDown() {
        stringParse = null;
    }

    @Test
    public void givenStringSentenceAndStringIntegerThenReturnACharacter() {
        assertEquals('g', stringParse.characterLocator("Learning Java", "7"), "Check the logic of the method characterLocator");
    }

    @Test
    public void givenStringSentenceAndWrongStringIntegerThenThrowAnException() {
        assertThrows(NumberFormatException.class,
                () -> {
                    stringParse.characterLocator("This is not a negative testcase", "xy");
                }, "Parsing String with characters to int is not possible");
    }

    @Test
    public void givenStringSentenceAndOutOfBoundStringIntegerThenThrowAnException() {
        assertThrows(StringIndexOutOfBoundsException.class,
                () -> {
                    stringParse.characterLocator("The index value is higher no of characters", "60");
                }, "When number given is more than range out of bound exception is thrown");
    }

    @Test
    public void givenStringSentenceAndNegativeStringIntegerThenThrowAnException() {
        assertThrows(StringIndexOutOfBoundsException.class,
                () -> {
                    stringParse.characterLocator("Index cannot be negative", "-3");
                }, "Any index cannot be negative");
    }

}
