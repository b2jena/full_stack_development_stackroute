package com.stackroute.basics;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.stackroute.basics.RectanglePerimeter;
import org.junit.jupiter.api.*;

public class RectanglePerimeterTests {
    private RectanglePerimeter rectanglePerimeter;

    @BeforeEach
    public void setUp() {
        rectanglePerimeter = new RectanglePerimeter();
    }

    @AfterEach
    public void tearDown() {
        rectanglePerimeter = null;
    }

    @Test
    public void givenTwoIntegersThenReturnDoubleResult() {
        assertEquals(16, rectanglePerimeter.perimeterCalculator(6, 2), "Check the logic and datatype of the method");
    }

    @Test
    public void givenTwoFloatsThenReturnDoubleResult() {
        assertEquals(29.6, rectanglePerimeter.perimeterCalculator(4.9, 9.9), "Check the logic and datatype of the method");
    }

    @Test
    public void givenTwoDoublesThenReturnDoubleResult() {
        assertEquals(2577.1346652, rectanglePerimeter.perimeterCalculator(356.4555556, 932.111777), "Check the logic and datatype of the method");
    }
}
