package com.stackroute.commonjavaclasses;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;


public class WrapperClassConvertTests {
    private WrapperClassConvert wrapperClassConvert;

    private static final String MESSAGE = "Check the logic of your method convertToWrapper";
    private static final String PROPER_MESSAGE = "Give proper primitive type as input";

    @BeforeEach
    public void setUp() {
        wrapperClassConvert = new WrapperClassConvert();
    }

    @AfterEach
    public void tearDown() {
        wrapperClassConvert = null;
    }

    @Test
    public void givenIntInputThenReturnResult() {
        Integer output = 10;
        int input = 10;
        assertEquals(output, wrapperClassConvert.convertToWrapper(input), MESSAGE);
    }

    @Test
    public void givenBooleanInputThenReturnResult() {
        Boolean output = false;
        boolean input = false;
        assertEquals(output, wrapperClassConvert.convertToWrapper(input), MESSAGE);
    }

    @Test
    public void givenCharInputThenReturnResult() {
        Character output = 'j';
        char input = 'j';
        assertEquals(output, wrapperClassConvert.convertToWrapper(input), MESSAGE);
    }

    @Test
    public void givenByteInputThenReturnResult() {
        Byte output = 1;
        byte input = 1;
        assertEquals(output, wrapperClassConvert.convertToWrapper(input), MESSAGE);
    }

    @Test
    public void givenShortInputThenReturnResult() {
        Short output = 4;
        short input = 4;
        assertEquals(output, wrapperClassConvert.convertToWrapper(input), MESSAGE);
    }

    @Test
    public void givenLongInputThenReturnResult() {
        Long output = 44l;
        long input = 44;
        assertEquals(output, wrapperClassConvert.convertToWrapper(input), MESSAGE);
    }

    @Test
    public void givenDoubleInputThenReturnResult() {
        Double output = 10.00d;
        double input = 10.00;
        assertEquals(output, wrapperClassConvert.convertToWrapper(input), MESSAGE);
    }

    @Test
    public void givenFloatInputThenReturnResult() {
        Float output = 10f;
        float input = 10;
        assertEquals(output, wrapperClassConvert.convertToWrapper(input), MESSAGE);
    }

    @Test
    public void givenStringInputThenReturnErrorString() {
        String input = "Java";
        assertEquals(PROPER_MESSAGE, wrapperClassConvert.convertToWrapper(input), MESSAGE);
    }

    @Test
    public void givenNullInputThenReturnResult() {
        assertEquals(PROPER_MESSAGE, wrapperClassConvert.convertToWrapper(null), MESSAGE);
    }

    @Test
    public void givenInputThenReturnResultNotNull() {
        assertNotNull(wrapperClassConvert.convertToWrapper(new StringBuffer("Coding")));
    }
}