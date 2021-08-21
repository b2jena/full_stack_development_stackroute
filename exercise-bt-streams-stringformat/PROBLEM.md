## Problem Statement: Find a comma separated string format for a given list of integers. String format is each element should be preceded by "even" if the number is even, and preceded by "odd" if the number is odd  ##

**Given a list of integers, find a comma separated string format for a given list of integers using Streams**

**This exercise contains a class named StringFormat with the following method:**

    +findStringFormat(List<Integer>) : String 
        -Should accept list of integers as input and return String
        -Should find the comma separated string format for on a given list of integers
        -Should return "Give proper input not empty list" if list is empty
        -Should return "Give proper input not negative values" if list contains negative values

## Example
    Sample Input:
    [101,44]
    
    Expected Output:   
    odd101,even44
--------------------------------------------------------
    Sample Input:
    [4,24,-4]
    
    Expected Output:
    Give proper input not negative values
--------------------------------------------------------
    Sample Input:
    []
    
    Expected Output:
    Give proper input not empty list
    
## Instructions
- Avoid printing unnecessary values other than expected output as given in sample
- Take care of whitespace/trailing whitespace
- Do not change the provided class/method names unless instructed
- Follow best practices while coding