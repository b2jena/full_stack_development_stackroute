package com.stackroute.collections;
import org.junit.jupiter.api.*;


import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class UniqueNumbersCounterTests {
    private static final String MESSAGE = "Check the logic of your findUniqueNumbersCount method";
    private static final String PROPER_MESSAGE = "Give proper input not empty array";
    private static final String PROPER_NEGATIVE_ZERO_MESSAGE = "Give proper input, sub array length can not be negative or zero";
    private static final String PROPER_LENGTH_MESSAGE = "Give proper input, sub array length exceeds array length";
    private static final String PROPER_INPUT_NOT_NULL_MESSAGE = "Give proper input not null array";
    private UniqueNumbersCounter uniqueNumbersCounter;

    @BeforeEach
    public void setUp() {
        uniqueNumbersCounter = new UniqueNumbersCounter();
    }

    @AfterEach
    public void tearDown() {
        uniqueNumbersCounter = null;
    }

    @Test
    public void givenInputThenReturnResult() {
        int[] inputArray = {6, 3, 4, 2, 1, 2, 0};
        int subArrayLength = 3;
        assertEquals("Count of Unique Numbers is 3", uniqueNumbersCounter.findUniqueNumbersCount(inputArray, subArrayLength), MESSAGE);
    }

    @Test
    public void givenInputWithLengthOfSubArrayThenReturnResult() {
        int[] inputArray = {2, 3, 4, 2, 1, 2, 0};
        int subArrayLength = 7;
        assertEquals("Count of Unique Numbers is 5", uniqueNumbersCounter.findUniqueNumbersCount(inputArray, subArrayLength), MESSAGE);
    }

    @Test
    public void givenInputWithNegativeNumbersArrayThenReturnResult() {
        int[] inputArray = {-2, -43, -4, -2, -1, -12};
        int subArrayLength = 6;
        assertEquals("Count of Unique Numbers is 5", uniqueNumbersCounter.findUniqueNumbersCount(inputArray, subArrayLength), MESSAGE);
    }

    @Test
    public void givenEmptyArrayThenReturnErrorString() {
        int[] inputArray = {};
        int subArrayLength = 4;
        assertEquals(PROPER_MESSAGE, uniqueNumbersCounter.findUniqueNumbersCount(inputArray, subArrayLength), MESSAGE);
    }

    @Test
    public void givenSubArrayLengthGreaterThanArrayLengthThenReturnErrorString() {
        int[] inputArray = {2, 5, 6, 57, 4, 6, 4};
        int subArrayLength = 10;
        assertEquals(PROPER_LENGTH_MESSAGE, uniqueNumbersCounter.findUniqueNumbersCount(inputArray, subArrayLength), MESSAGE);
    }

    @Test
    public void givenInputNegativeLengthOfSubArrayThenReturnErrorString() {
        int[] inputArray = {2, 3, 4, 2, 1, 2, 0};
        int subArrayLength = -4;
        assertEquals(PROPER_NEGATIVE_ZERO_MESSAGE, uniqueNumbersCounter.findUniqueNumbersCount(inputArray, subArrayLength), MESSAGE);
    }

    @Test
    public void givenInputZeroLengthOfSubArrayThenReturnErrorString() {
        int[] inputArray = {2, 3, 4, 2, 1, 2, 0};
        int subArrayLength = 0;
        assertEquals(PROPER_NEGATIVE_ZERO_MESSAGE, uniqueNumbersCounter.findUniqueNumbersCount(inputArray, subArrayLength), MESSAGE);
    }

    @Test
    public void givenInputThenReturnResultNotNull() {
        int[] inputArray = {2, 3, 4, 2, 1, 2, 0};
        int subArrayLength = 3;
        assertNotNull(uniqueNumbersCounter.findUniqueNumbersCount(inputArray, subArrayLength), MESSAGE);
    }

    @Test
    public void givenInputArrayOfNullThenReturnErrorString() {
        int subArrayLength = 4;
        assertEquals(PROPER_INPUT_NOT_NULL_MESSAGE, uniqueNumbersCounter.findUniqueNumbersCount(null, subArrayLength), MESSAGE);
    }
}