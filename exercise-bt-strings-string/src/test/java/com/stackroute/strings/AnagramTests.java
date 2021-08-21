package com.stackroute.strings;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;



public class AnagramTests {
    private Anagram anagram;

    private static final String MESSAGE = "Check the logic of your method checkAnagrams";
    private static final String PROPER_MESSAGE = "Give proper input not empty phrases";
    private static final String ANAGRAMS = "Given phrases are anagrams";
    private static final String NOT_ANAGRAMS = "Given phrases are not anagrams";

    @BeforeEach
    public void setUp() {
        anagram = new Anagram();
    }

    @AfterEach
    public void tearDown() {
        anagram = null;
    }

    @Test
    public void givenPhrasesAreAnagramsThenReturnAnagrams() {
        assertEquals(ANAGRAMS, anagram.checkAnagrams("race car", "car race"), MESSAGE);
    }

    @Test
    public void givenPhrasesAreAnagramsWithCamelCaseThenReturnAnagrams() {
        assertEquals(ANAGRAMS, anagram.checkAnagrams("Welcome Java World Hey", "Hey Welcome Java World"), MESSAGE);
    }

    @Test
    public void givenPhrasesAreAnagramsWithUpperCaseThenReturnAnagrams() {
        assertEquals(ANAGRAMS, anagram.checkAnagrams("WELCOME TO JAVA WORLD OF PROGRAMMING", "JAVA WORLD WELCOME TO OF PROGRAMMING"), MESSAGE);
    }

    @Test
    public void givenPhrasesAreNotAnagramsThenReturnNotAnagrams() {
        assertEquals(NOT_ANAGRAMS, anagram.checkAnagrams("abcd abcd abac", "cbad abcd abaa"), MESSAGE);
        assertEquals(NOT_ANAGRAMS, anagram.checkAnagrams("hi hello hie hi", "hi hi hi hello"), MESSAGE);

    }

    @Test
    public void givenPhrasesAreNotAnagramsWithCamelCaseThenReturnNotAnagrams() {
        assertEquals(NOT_ANAGRAMS, anagram.checkAnagrams("Hello Welcome To Java", "Welcome To Java"), MESSAGE);
    }

    @Test
    public void givenPhrasesAreNotAnagramsWithUpperCaseThenReturnNotAnagrams() {
        assertEquals(NOT_ANAGRAMS, anagram.checkAnagrams("HELLO FULL STACK DEVELOPER", "FULL STACK DEVELOPER"), MESSAGE);
        assertEquals(NOT_ANAGRAMS, anagram.checkAnagrams("hello Java", "Java Hello"), MESSAGE);
    }

    @Test
    public void givenPhrasesWithUnEvenSpacesThenReturnNotAnagrams() {
        assertEquals(NOT_ANAGRAMS, anagram.checkAnagrams(" abcd abcd abac ", "abcd abcd abac"), MESSAGE);
        assertEquals(NOT_ANAGRAMS, anagram.checkAnagrams("hi hello hie hi", "hi hello  hie hi"), MESSAGE);
        assertEquals(NOT_ANAGRAMS, anagram.checkAnagrams("Hello World", "Hello    World"), MESSAGE);
    }

    @Test
    public void givenPhrasesThenReturnSomethingNotNull() {
        assertNotNull(anagram.checkAnagrams("abcd", "cbad"), MESSAGE);
        assertNotNull(anagram.checkAnagrams("hi hello hi hi", "hi hi hi hello"), MESSAGE);
    }

    @Test
    public void givenInputPhraseOneWithSpecialCharacterThenReturnNotAnagrams() {
        assertEquals(NOT_ANAGRAMS, anagram.checkAnagrams("race@ car", ",car race"), MESSAGE);
    }

    @Test
    public void givenInputPhraseTwoWithSpecialCharacterThenReturnAnagrams() {
        assertEquals(ANAGRAMS, anagram.checkAnagrams("aba $cba", "cba $aba"), MESSAGE);
    }

    @Test
    public void givenInputPhraseTwoWithBlankThenReturnErrorString() {
        assertEquals(PROPER_MESSAGE, anagram.checkAnagrams("", ""), MESSAGE);
    }
}
