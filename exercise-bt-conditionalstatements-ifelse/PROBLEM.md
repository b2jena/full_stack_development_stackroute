## Problem Statement: String finder using if else ##

**Given 3 Strings find whether second string comes after the first string in the search string**

**This exercise contains a class named StringFinder with the following methods:**

    +getInput() : String 
    - Should scan for three input strings naming searchString,firstString and secondString respectively. 
--------------------------------------------------------------------------------------------- 
     +findString(String,String,String) : int
    - Should return 1 if the secondString comes after after firstString in the searchString.
    - Should return 0 if the strings are not found as expected.
    - Should return -1 if the input string is empty/null. 
    - Input Strings can contain alphanumeric character, spaces and special characters.
-------------------------------------------------------------------------------------------
    +displayResutl() : void 
    - Should displays the result as shown in example section.  
---------------------------------------------------------------------------------------
    +closeScanner() : void
    - Should close the scanner object.

**Do the following in the main method of StringFinder class**

Call the functions in the required sequence.  

## Example
    Sample Input:
    abcd
    ab
    cd 
    
    Expected Output:
    Found as expected
--------------------------------------------------------
    Sample Input:
    String finder
    finder
    value  
    
    Expected Output:
    Not found
--------------------------------------------------------
    Sample Input:
    Search value
    first
    
    
    Expected Output:
    Empty string or null

## Instructions
- Avoid printing unnecessary values other than expected output as given in sample
- Take care of whitespace/trailing whitespace
- Do not change the provided class/method names unless instructed
- Follow best practices while coding
