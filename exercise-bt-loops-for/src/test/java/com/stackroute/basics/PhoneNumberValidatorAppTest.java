package com.stackroute.basics;

import com.stackroute.basics.PhoneNumberValidator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhoneNumberValidatorAppTest {
    private static final String VALID="Valid";
    private static final String INVALID="Invalid or empty string";
    private static  String input="";
    private static final String MSG_01="Phone number is valid";
    private static final String MSG_02="Phone number is invalid";
    private static final String MSG_03="String is empty or null";
    private ByteArrayOutputStream myOutStream;
    private ByteArrayInputStream myInputStream;
    private static final String VALIDVALUES = "99-080-99889";
    private static final String INVALIDVALUES = "99-009-78u888";
    private static final String[] EMPTYVALUES = {" ",null};;

    @BeforeEach
    public void setUp() {
        myOutStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(myOutStream));
    }

    @Test
    public void givenValidValuesWhenCheckedThenDisplayValid() {
        input=VALIDVALUES;
        myInputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(myInputStream);

        PhoneNumberValidator.main(null);
        String actual = myOutStream.toString().toLowerCase().replaceAll("\\s+", "");
        assertEquals(VALID.toLowerCase().replaceAll("\\s+", ""),actual,MSG_01);
    }

    @Test
    public void givenInvalidValuesWhenCheckedThenDisplayInvalid() {
        input=INVALIDVALUES;
        myInputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(myInputStream);

        PhoneNumberValidator.main(null);
        String actual = myOutStream.toString().toLowerCase().replaceAll("\\s+", "");
        assertEquals(INVALID.toLowerCase().replaceAll("\\s+", ""),actual,MSG_02);
    }

    @Test
    public void givenEmptyOrNullValuesWhenCheckedThenDisplayEmpty() {
        input=INVALIDVALUES;
        myInputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(myInputStream);

        PhoneNumberValidator.main(null);
        String actual = myOutStream.toString().toLowerCase().replaceAll("\\s+", "");
        assertEquals(INVALID.toLowerCase().replaceAll("\\s+", ""),actual,MSG_03);
    }
}
