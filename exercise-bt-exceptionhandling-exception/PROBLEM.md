## Problem Statement: Find character at specified location in a string

**Given a string find the character in particular location in the string**

**This exercise contains a class named CharacterFinder with the following method:**

     +characterLocator(String, String) : character  
         - Should take two String values as input and return a character as result
         - Should also handle exception thrown by logic using try and catch


## Example
    Sample Input:
    This is a demo sentence, 8    
    
    Expected Output:
    a
--------------------------------------------------------
    Sample Input:
    This is a demo sentence, xyz
        
    Expected Output:
    NumberFormatException
--------------------------------------------------------
    Sample Input:
    This is a demo sentence, 40
        
    Expected Output:
    StringIndexOutOfBoundsException

## Instructions

- Avoid printing unnecessary values other than expected output as given in sample
- Take care of whitespace/trailing whitespace
- Do not change the provided class/method names unless instructed
- Follow best practices while coding