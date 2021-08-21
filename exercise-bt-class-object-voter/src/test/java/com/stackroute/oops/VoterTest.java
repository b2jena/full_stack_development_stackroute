package com.stackroute.oops;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class VoterTest {
    private static final String MSG_01 = "voter details returned by toString do not match the required format or are incorrect";
    private static final String MSG_02 = "voter object properties are not set properly in constructor";
    private static final String MSG_03 = "voter with age greater than or equal to 18 are ADULT";
    private static final String MSG_04 = "voter with age less than 18 are UNDERAGE";


    private static final String ADULT = "ADULT";
    private static final String UNDERAGE = "UNDERAGE";

    private Voter voter;

    @BeforeEach
    public void setUp() {
        voter = new Voter("Mandakini", 20);
    }

    @AfterEach
    public void tearDown() {
        voter = null;
    }

    @Test
    public void givenVoterObjectThenGetVoterDetails() {
        String expectedVoterDetail = "Voter{name='Mandakini', age=20}";
        assertEquals(expectedVoterDetail, voter.toString(), MSG_01);
    }

    @Test
    public void givenVoterPropertyValuesWhenObjectCreatedThenPropertiesAreSet() {
        voter = new Voter("Anand", 47);
        assertEquals("Anand", voter.getName(), MSG_02);
        assertEquals(47, voter.getAge(), MSG_02);
    }

    @Test
    public void givenVoterObjectThenChangePropertyValues() {
        voter.setName("Anand");
        voter.setAge(47);
        assertEquals("Anand", voter.getName(), MSG_02);
        assertEquals(47, voter.getAge(), MSG_02);
    }

    @Test
    public void givenVoterObjectWhenAgeGreaterThanEqualToEighteenThenReturnAdult() {
        voter = new Voter("Seema", 28);
        assertEquals(ADULT, voter.getAgeCriteria(), MSG_03);
    }

    @Test
    public void givenVoterObjectWhenAgeLessThanEighteenThenReturnUnderAge() {
        voter = new Voter("Sana", 16);
        assertEquals(UNDERAGE, voter.getAgeCriteria(), MSG_04);
    }

}
