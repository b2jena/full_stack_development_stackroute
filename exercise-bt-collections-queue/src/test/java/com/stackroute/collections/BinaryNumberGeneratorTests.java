package com.stackroute.collections;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class BinaryNumberGeneratorTests {
    private static final String MESSAGE = "Check the logic of the method findBinaryNumbersSequence";
    private static final String ZERO_NEGATIVE_MESSAGE = "Give proper input not zero or negative";
    private static final String RANGE_MESSAGE = "Give proper input not greater than 20";
    private BinaryNumberGenerator binaryNumberGenerator;

    @BeforeEach
    public void setUp() {
        binaryNumberGenerator = new BinaryNumberGenerator();
    }

    @AfterEach
    public void tearDown() {
        binaryNumberGenerator = null;
    }

    @Test
    public void givenInputThenReturnResult() {
        int input = 14;
        String output = "1 10 11 100 101 110 111 1000 1001 1010 1011 1100 1101 1110";
        assertEquals(output, binaryNumberGenerator.findBinaryNumbersSequence(input), MESSAGE);
    }

    @Test
    public void givenInputAsTwentyThenReturnResult() {
        int input = 20;
        String output = "1 10 11 100 101 110 111 1000 1001 1010 1011 1100 1101 1110 1111 10000 10001 10010 10011 10100";
        assertEquals(output, binaryNumberGenerator.findBinaryNumbersSequence(input), MESSAGE);
    }

    @Test
    public void givenInputAsNegativeNumberThenReturnErrorString() {
        int input = -4;
        assertEquals(ZERO_NEGATIVE_MESSAGE, binaryNumberGenerator.findBinaryNumbersSequence(input), MESSAGE);
    }

    @Test
    public void givenInputAsZeroThenReturnErrorString() {
        int input = 0;
        assertEquals(ZERO_NEGATIVE_MESSAGE, binaryNumberGenerator.findBinaryNumbersSequence(input), MESSAGE);
    }

    @Test
    public void givenInputAsOneThenReturnResult() {
        int input = 1;
        assertEquals("1", binaryNumberGenerator.findBinaryNumbersSequence(input), MESSAGE);
    }

    @Test
    public void givenInputGreaterThanRangeThenReturnErrorString() {
        int input = 40;
        assertEquals(RANGE_MESSAGE, binaryNumberGenerator.findBinaryNumbersSequence(input), MESSAGE);
    }

    @Test
    public void givenInputThenReturnResultNotNull() {
        int input = 10;
        assertNotNull(binaryNumberGenerator.findBinaryNumbersSequence(input), MESSAGE);
    }


}
