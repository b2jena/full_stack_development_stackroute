## Problem Statement: Find the list of strings which start with letter I in the given list of strings ##

**Given a list of strings, find the list of strings which start with letter I in the given strings using Predicate Functional Interface**

**This exercise contains a class named PredicateFunctionalInterface with the following method:**


    +findPattern(List<String>) : List<String>
        -Should accept list of strings as input  
        -Should find the list of strings which start with letter I in the given strings 
        -Should return list of strings which start with letter I in the given strings as output
        -Should return empty list if no such string is found which start with letter I
        -Should avoid the redundancy among the strings in output
        
      
## Example
    Sample Input:
    [Icecream,Water,Ice,Gas,Ice]
    
    Expected Output:   
    [Icecream,Ice]
--------------------------------------------------------
    Sample Input:
    [Java,C,C++,Java,C]
    
    Expected Output:
    []
--------------------------------------------------------
    Sample Input:
    []
    
    Expected Output:
    []

## Instructions
- Avoid printing unnecessary values other than expected output as given in sample
- Take care of whitespace/trailing whitespace
- Do not change the provided class/method names unless instructed
- Follow best practices while coding