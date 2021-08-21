package com.stackroute.strings;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;


public class LongestSubStringTests {
    private LongestSubString longestSubString;

    private static final String MESSAGE = "Check the logic of your method findLongestSubString";

    @BeforeEach
    public void setUp() {
        longestSubString = new LongestSubString();
    }

    @AfterEach
    public void tearDown() {
        longestSubString = null;
    }

    @Test
    public void givenStringBuilderWithLongestSubStringThenReturnResult() {
        StringBuilder output = new StringBuilder("run");
        StringBuilder input = new StringBuilder("runnerrun");
        assertEquals(output.toString(), longestSubString.findLongestSubString(input).toString(), MESSAGE);
    }

    @Test
    public void givenStringBuilderWithOutLongestSubStringThenReturnError() {
        StringBuilder output = new StringBuilder("Longest substring is not present in the given StringBuilder");
        StringBuilder input = new StringBuilder("dancerdances");
        assertEquals(output.toString(), longestSubString.findLongestSubString(input).toString(), MESSAGE);
    }

    @Test
    public void givenStringBuilderWithUppercaseLongestSubStringThenReturnResult() {
        StringBuilder output = new StringBuilder("JAVA");
        StringBuilder input = new StringBuilder("JAVAJAVA");
        assertEquals(output.toString(), longestSubString.findLongestSubString(input).toString(), MESSAGE);
    }

    @Test
    public void givenStringBuilderThenReturnNotNull() {
        StringBuilder input = new StringBuilder("dancerdances");
        assertNotNull(longestSubString.findLongestSubString(input), MESSAGE);
    }

    @Test
    public void givenStringBuilderWithLengthOneLongestSubStringThenReturnResult() {
        StringBuilder output = new StringBuilder("J");
        StringBuilder input = new StringBuilder("J");
        assertEquals(output.toString(), longestSubString.findLongestSubString(input).toString(), MESSAGE);
    }

    @Test
    public void givenStringBuilderWithSpacesThenReturnResult() {
        StringBuilder output = new StringBuilder("Java Programming");
        StringBuilder input = new StringBuilder("Java Programming Java Programming");
        assertEquals(output.toString(), longestSubString.findLongestSubString(input).toString(), MESSAGE);
    }

    @Test
    public void givenInputBlankThenCheckNotNull() {
        StringBuilder output = new StringBuilder("Give proper input");
        StringBuilder input = new StringBuilder("");
        assertNotNull(longestSubString.findLongestSubString(input).toString(), MESSAGE);
    }

    @Test
    public void givenInputWithSpecialCharactersThenCheckNotNull() {
        StringBuilder output = new StringBuilder("@#");
        StringBuilder input = new StringBuilder("@#Java@#");
        assertNotNull(longestSubString.findLongestSubString(input).toString(), MESSAGE);
    }
}