package com.stackroute.oops;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


public class VoterServiceTest {

    private static final String MSG_01 = "voter object returned by createVoter(..) should not be null";
    private static final String MSG_02 = "voter type enum returned is not correct for the given age";
    private VoterService voterService;

    @BeforeEach
    public void setUp() {
        voterService = new VoterService();
    }

    @AfterEach
    public void tearDown() {
        voterService = null;
    }

    @Test
    public void givenVoterPropertyValuesThenReturnVoterObject() {
        final Voter voter = voterService.createVoter("Ajay", 30);
        assertNotNull(voter, MSG_01);
    }

    @Test
    public void givenVoterObjectWhenVoterCanCastVoteThenReturnCorrectVoterType() {
        final Voter voter = voterService.createVoter("Naina", 24);
        assertEquals(VoterType.VOTER_CAN_CAST_VOTE, voterService.getVoterDescription(voter), MSG_02);
    }

    @Test
    public void givenVoterObjectWhenVoterCannotCastVoteThenReturnCorrectVoterType() {
        final Voter voter = voterService.createVoter("Naina", 17);
        assertEquals(VoterType.VOTER_CANNOT_CAST_VOTE, voterService.getVoterDescription(voter), MSG_02);
    }

    @Test
    public void givenVoterObjectWhenInvalidVoterThenReturnCorrectVoterType() {
        final Voter voter = voterService.createVoter("Naina", -11);
        assertEquals(VoterType.INVALID_VOTER, voterService.getVoterDescription(voter), MSG_02);
    }

    @Test
    public void givenVoterObjectWhenInvalidVoterWithAgeZeroThenReturnCorrectVoterType() {
        final Voter voter = voterService.createVoter("Naina", 0);
        assertEquals(VoterType.INVALID_VOTER, voterService.getVoterDescription(voter), MSG_02);
    }
}
