package com.stackroute.streams;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class StringFormatTests {
    private StringFormat stringFormat;

    private static final String MESSAGE = "Check the logic of your method findStringFormat";

    @BeforeEach
    public void setUp() {
        stringFormat = new StringFormat();
    }

    @AfterEach
    public void tearDown() {
        stringFormat = null;
    }

    @Test
    public void givenOddNumbersInputThenReturnResult() {
        String output = "odd1,odd5,odd41,odd97";
        List<Integer> input = Stream.of(1, 5, 41, 97).collect(Collectors.toList());
        assertEquals(output, stringFormat.findStringFormat(input), MESSAGE);
    }

    @Test
    public void givenEvenNumbersInputThenReturnResult() {
        String output = "even2,even44,even1000,even474";
        List<Integer> input = Stream.of(2, 44, 1000, 474).collect(Collectors.toList());
        assertEquals(output, stringFormat.findStringFormat(input), MESSAGE);
    }

    @Test
    public void givenEvenAndOddNumbersInputThenReturnResult() {
        String output = "odd79,even444,odd1009,odd471,even34,even22";
        List<Integer> input = Stream.of(79, 444, 1009, 471, 34, 22).collect(Collectors.toList());
        assertEquals(output, stringFormat.findStringFormat(input), MESSAGE);
    }

    @Test
    public void givenInputThenReturnNotNull() {
        String output = "odd79,even444,odd1009,even34,even22";
        List<Integer> input = Stream.of(79, 444, 1009, 471, 34, 22).collect(Collectors.toList());
        assertNotNull(stringFormat.findStringFormat(input), MESSAGE);
    }

    @Test
    public void givenEmptyListThenReturnErrorString() {
        String output = "Give proper input not empty list";
        List<Integer> input = new ArrayList<>();
        assertEquals(output, stringFormat.findStringFormat(input), MESSAGE);

    }

    @Test
    public void givenNegativeValuesThenReturnErrorString() {
        String output = "Give proper input not negative values";
        List<Integer> input = Stream.of(2, 4, 234, -1, 34, 22).collect(Collectors.toList());
        assertEquals(output, stringFormat.findStringFormat(input), MESSAGE);

    }

    @Test
    public void givenZeroThenReturnResult() {
        String output = "even0";
        List<Integer> input = Stream.of(0).collect(Collectors.toList());
        assertEquals(output, stringFormat.findStringFormat(input), MESSAGE);

    }
}