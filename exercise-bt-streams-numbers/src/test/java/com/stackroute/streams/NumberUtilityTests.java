package com.stackroute.streams;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;

import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class NumberUtilityTests {

    private static final String MSG_01 = "should return the count of even numbers";
    private static final String MSG_02 = "should return 0 for null or empty input list";
    private static final String MSG_03 = "should return list with even multiples of 3";
    private static final String MSG_04 = "should return empty list, for given null or empty list";
    private static final String MSG_05 = "should return the max of odd numbers";

    private NumberUtility numberUtility;

    /**
     * Below static methods are the test data for parameterized Tests
     */
    private static Stream<Arguments> testDataForEvenMultiplesOfThree() {
        return Stream.of(
                Arguments.of(List.of(3, 6, 5, 9, 12), List.of(6, 12)),
                Arguments.of(List.of(1, 3, 5, 8, 10), Collections.emptyList())
        );
    }

    private static Stream<Arguments> testDataForEvenNumberCount() {
        return Stream.of(
                Arguments.of(List.of(1, 2, 3, 4, 5, 6), 3),
                Arguments.of(List.of(1, 3, 5), 0)
        );
    }

    private static Stream<Arguments> testDataForMaxOfOddNumbers() {
        return Stream.of(
                Arguments.of(List.of(1, 2, 3, 4, 5, 6), 5),
                Arguments.of(List.of(2, 4, 6), 0)
        );
    }

    @BeforeEach
    public void setUp() {
        numberUtility = new NumberUtility();
    }

    @AfterEach
    public void tearDown() {
        numberUtility = null;
    }

    @ParameterizedTest(name = "{0} contains {1} even number/s")
    @MethodSource("testDataForEvenNumberCount")
    public void givenListOfIntegersThenGetEvenNumberCount(List<Integer> numbers, long expected) {
        assertThat(MSG_01, numberUtility.getEvenNumberCount(numbers), is(expected));
    }

    @ParameterizedTest(name = "when input is {0}, return 0")
    @NullAndEmptySource
    public void givenEmptyOrNullInputListOfIntegersThenGetEvenNumberCountShouldBeZero(List<Integer> numbers) {
        assertThat(MSG_02, numberUtility.getEvenNumberCount(numbers), is(0L));
    }

    @ParameterizedTest(name = "{0} returns {1}")
    @MethodSource("testDataForEvenMultiplesOfThree")
    public void givenListOfIntegersThenGetEvenMultiplesOfThree(List<Integer> numbers, List<Integer> expected) {
        assertThat(MSG_03, numberUtility.getEvenMultiplesOfThree(numbers), is(expected));
    }

    @ParameterizedTest(name = "when input is {0}, return 0")
    @NullAndEmptySource
    public void givenEmptyOrNullInputThenGetEvenMultiplesOfThreeShouldReturnEmptyList(List<Integer> numbers) {
        assertThat(MSG_04, numberUtility.getEvenMultiplesOfThree(numbers), is(Collections.emptyList()));
    }

    @ParameterizedTest(name = "{0} returns {1}")
    @MethodSource("testDataForMaxOfOddNumbers")
    public void givenListOfIntegersThenGetMaximumOfOddNumbers(List<Integer> numbers, Integer expected) {
        assertThat(MSG_05, numberUtility.getMaximumOfOddNumbers(numbers), is(expected));
    }

    @ParameterizedTest(name = "when input is {0}, return 0")
    @NullAndEmptySource
    public void givenEmptyOrNullInputThenReturnMaxAsZero(List<Integer> numbers) {
        assertThat(MSG_02, numberUtility.getMaximumOfOddNumbers(numbers), is(0));
    }
}