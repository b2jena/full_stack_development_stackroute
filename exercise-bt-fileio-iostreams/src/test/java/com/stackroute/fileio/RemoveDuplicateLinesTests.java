package com.stackroute.fileio;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicateLinesTests {
    private RemoveDuplicateLines removeDuplicateLines;
    private static final String MESSAGE = "please check logic of removeDuplicateLines method";

    @BeforeEach
    public void setUp() {
        removeDuplicateLines = new RemoveDuplicateLines();
    }

    @AfterEach
    public void tearDown() {
        removeDuplicateLines = null;
    }

    @Test
    public void givenInputFileThenCheckForCorrectResult() throws IOException {

        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Good morning");
        hashSet.add("Work Hard");
        hashSet.add("Be Cool");
        hashSet.add("Hi, Hello World");
        Set<String> result = new HashSet<>();
        removeDuplicateLines.removeDuplicateLines();
        FileInputStream fis = new FileInputStream("output.txt");
        Scanner scanner = new Scanner(fis);
        while (scanner.hasNextLine()) {
            result.add(scanner.nextLine());
        }
        scanner.close();
        assertEquals(hashSet, result, MESSAGE);
    }

    @Test
    public void givenInputFileThenCheckForNotNull() throws IOException {
        Set<String> result = new HashSet<>();
        removeDuplicateLines.removeDuplicateLines();
        FileInputStream fis = new FileInputStream("output.txt");
        Scanner scanner = new Scanner(fis);
        while (scanner.hasNextLine()) {
            result.add(scanner.nextLine());
        }
        scanner.close();
        assertNotNull(result, MESSAGE);
    }

    @Test
    public void givenInputFileThenCheckForIncorrectResult() throws IOException {

        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Good morning");
        hashSet.add("Work Hard");
        hashSet.add("Be Cool");
        Set<String> result = new HashSet<>();
        removeDuplicateLines.removeDuplicateLines();
        FileInputStream fis = new FileInputStream("output.txt");
        Scanner scanner = new Scanner(fis);
        while (scanner.hasNextLine()) {
            result.add(scanner.nextLine());
        }
        scanner.close();
        assertNotEquals(hashSet, result, MESSAGE);
    }
}