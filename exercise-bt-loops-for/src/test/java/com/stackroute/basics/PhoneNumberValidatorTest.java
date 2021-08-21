package com.stackroute.basics;

import com.stackroute.basics.PhoneNumberValidator;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PhoneNumberValidatorTest {

    private static final String MSG_01 = "Should return true for valid values";
    private static final String MSG_02 = "Should return false for invalid values";
    private static final String MSG_03 = "Should return false for empty or null values";
    private static PhoneNumberValidator object;
    private static final String[] VALIDVALUES = {"99-080-99889","999-99-99999"};
    private static final String[] INVALIDVALUES = {"99-009-78u888","9999","-99-999-999991-","#$$-5556-999"};
    private static final String[] EMPTYVALUES = {" ",null};;

    @BeforeAll
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        object = new PhoneNumberValidator();
    }

    @AfterAll
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        object = null;
    }

    @Test
    public void givenValidValuesWhenCheckedThenReturnTrue(){
        assertTrue(object.validatePhoneNumber(VALIDVALUES[0]),MSG_01);
        assertTrue(object.validatePhoneNumber(VALIDVALUES[1]),MSG_01);
    }

    @Test
    public void givenInvalidValuesWhenCheckedThenReturnFalse(){
        assertFalse(object.validatePhoneNumber(INVALIDVALUES[0]),MSG_02);
        assertFalse(object.validatePhoneNumber(INVALIDVALUES[1]),MSG_02);
        assertFalse(object.validatePhoneNumber(INVALIDVALUES[2]),MSG_02);
        assertFalse(object.validatePhoneNumber(INVALIDVALUES[3]),MSG_02);

    }

    @Test
    public void givenEmptyOrNullValuesWhenCheckedThenReturnFalse(){
        assertFalse(object.validatePhoneNumber(EMPTYVALUES[0]),MSG_03);
        assertFalse(object.validatePhoneNumber(EMPTYVALUES[1]),MSG_03);
    }
}
