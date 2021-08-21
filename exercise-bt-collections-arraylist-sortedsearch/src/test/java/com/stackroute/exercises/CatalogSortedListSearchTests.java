package com.stackroute.exercises;

import org.junit.jupiter.api.*;


import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CatalogSortedListSearchTests {

    private CatalogSortedListSearch catalogSortedListSearch;
    private String message_01 = "Check the logic in method catalogListSorter, should throw error string when array list contains a";
    private String message_02 = "Check the logic in method catalogListSearcher, should throw error string when value is";

    @BeforeEach
    public void setUp() {
        catalogSortedListSearch = new CatalogSortedListSearch();
    }

    @AfterEach
    public void tearDown() {
        catalogSortedListSearch = null;
    }

    @Test
    public void givenEmptyArrayListToSortThenReturnAnErrorString() {
        ArrayList<String> catalogListDemo = new ArrayList<>();
        assertEquals("The catalog List is empty", catalogSortedListSearch.catalogListSorter(catalogListDemo), "Empty array list should not be passed");
    }

    @Test
    public void givenArrayListAsNullToSortThenReturnAnErrorString() {
        assertEquals("The catalog list is null", catalogSortedListSearch.catalogListSorter(null), "Null array list should not be passed");
    }

    @Test
    public void givenAStringListWhenSortedThenReturnAStringResult() {
        ArrayList<String> catalogListDemo = new ArrayList<>();
        catalogListDemo.add("Nike");
        catalogListDemo.add("Puma");
        catalogListDemo.add("Adidas");
        catalogListDemo.add("Reebok");
        catalogListDemo.add("UnderArmour");
        catalogListDemo.add("NBalance");
        catalogListDemo.add("SuperDry");
        assertEquals("[Adidas, NBalance, Nike, Puma, Reebok, SuperDry, UnderArmour]", catalogSortedListSearch.catalogListSorter(catalogListDemo), "Check the logic in method catalogListSorter");
    }

    @Test
    public void givenANullStringListWhenSortedThenReturnAnErrorString() {
        ArrayList<String> catalogListDemo = new ArrayList<>();
        catalogListDemo.add("Nike");
        catalogListDemo.add("Puma");
        catalogListDemo.add("Adidas");
        catalogListDemo.add("Reebok");
        catalogListDemo.add("UnderArmour");
        catalogListDemo.add("NBalance");
        catalogListDemo.add(null);
        assertEquals("The catalog List contains empty or null or blank space as a value", catalogSortedListSearch.catalogListSorter(catalogListDemo), message_01 + " null as a value");
    }

    @Test
    public void givenABlankSpaceStringListWhenSortedThenReturnAnErrorString() {
        ArrayList<String> catalogListDemo = new ArrayList<>();
        catalogListDemo.add("Nike");
        catalogListDemo.add("Puma");
        catalogListDemo.add("Adidas");
        catalogListDemo.add("Reebok");
        catalogListDemo.add("UnderArmour");
        catalogListDemo.add("NBalance");
        catalogListDemo.add(" ");
        assertEquals("The catalog List contains empty or null or blank space as a value", catalogSortedListSearch.catalogListSorter(catalogListDemo), message_01 + " blank space as a value");
    }

    @Test
    public void givenAEmptyStringListWhenSortedThenReturnAnErrorString() {
        ArrayList<String> catalogListDemo = new ArrayList<>();
        catalogListDemo.add("Nike");
        catalogListDemo.add("Puma");
        catalogListDemo.add("Adidas");
        catalogListDemo.add("Reebok");
        catalogListDemo.add("UnderArmour");
        catalogListDemo.add("NBalance");
        catalogListDemo.add("");
        assertEquals("The catalog List contains empty or null or blank space as a value", catalogSortedListSearch.catalogListSorter(catalogListDemo), message_01 + " empty as a value");
    }

    @Test
    public void givenAStringListAndStringThenReturnAStringResult() {
        ArrayList<String> catalogListDemo = new ArrayList<>();
        String message = "Check the logic in method catalogListSearcher";
        catalogListDemo.add("Nike");
        catalogListDemo.add("Puma");
        catalogListDemo.add("Adidas");
        catalogListDemo.add("Reebok");
        catalogListDemo.add("UnderArmour");
        catalogListDemo.add("NBalance");
        catalogListDemo.add("SuperDry");
        catalogSortedListSearch.catalogListSorter(catalogListDemo);
        assertEquals("Found: Reebok", catalogSortedListSearch.catalogListSearcher("Reebok"), message);
        assertEquals("Found: Reebok", catalogSortedListSearch.catalogListSearcher("reebok"), message);
    }

    @Test
    public void givenAStringListAndWrongStringThenReturnAnErrorString() {
        ArrayList<String> catalogListDemo = new ArrayList<>();
        catalogListDemo.add("Nike");
        catalogListDemo.add("Puma");
        catalogListDemo.add("Adidas");
        catalogListDemo.add("Reebok");
        catalogListDemo.add("UnderArmour");
        catalogListDemo.add("NBalance");
        catalogListDemo.add("SuperDry");
        catalogSortedListSearch.catalogListSorter(catalogListDemo);
        assertEquals("Not Found", catalogSortedListSearch.catalogListSearcher("Levis"), "Check the logic in method catalogListSearcher");
    }

    @Test
    public void givenAStringListAndANullStringThenReturnAnErrorString() {
        ArrayList<String> catalogListDemo = new ArrayList<>();
        catalogListDemo.add("Nike");
        catalogListDemo.add("Puma");
        catalogListDemo.add("Adidas");
        catalogListDemo.add("Reebok");
        catalogListDemo.add("UnderArmour");
        catalogListDemo.add("NBalance");
        catalogListDemo.add("SuperDry");
        catalogSortedListSearch.catalogListSorter(catalogListDemo);
        assertEquals("Input is not accepted", catalogSortedListSearch.catalogListSearcher(null), message_02 + " null");
    }

    @Test
    public void givenAStringListAndAEmptyStringThenReturnAnErrorString() {
        ArrayList<String> catalogListDemo = new ArrayList<>();
        catalogListDemo.add("Nike");
        catalogListDemo.add("Puma");
        catalogListDemo.add("Adidas");
        catalogListDemo.add("Reebok");
        catalogListDemo.add("UnderArmour");
        catalogListDemo.add("NBalance");
        catalogListDemo.add("SuperDry");
        catalogSortedListSearch.catalogListSorter(catalogListDemo);
        assertEquals("Input is not accepted", catalogSortedListSearch.catalogListSearcher(""), message_02 + " empty");
    }

    @Test
    public void givenAStringListAndABlankSpaceStringThenReturnAnErrorString() {
        ArrayList<String> catalogListDemo = new ArrayList<>();
        catalogListDemo.add("Nike");
        catalogListDemo.add("Puma");
        catalogListDemo.add("Adidas");
        catalogListDemo.add("Reebok");
        catalogListDemo.add("UnderArmour");
        catalogListDemo.add("NBalance");
        catalogListDemo.add("SuperDry");
        catalogSortedListSearch.catalogListSorter(catalogListDemo);
        assertEquals("Input is not accepted", catalogSortedListSearch.catalogListSearcher(" "), message_02 + " blank space");
    }

}
