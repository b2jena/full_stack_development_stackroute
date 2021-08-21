## Problem Statement: Find the maximum count of unique numbers in sub array of given length ##

**Given an array of numbers, find the maximum count of unique numbers in sub array of given length using Dequeue**

**This exercise contains a class named UniqueNumbersCounter with the following method:**


    +findUniqueNumbersCount(int[],int) : String
        -Should accept int array of numbers, length of sub array as input
        -Should find the maximum count of unique numbers in sub array of given length
        -Should return "Give proper input not empty array" if given array is empty
        -Should return "Give proper input not null array" if given array is null
        -Should return "Give proper input, sub array length exceeds array length" if length of sub array is greater than length of array
        -Should return "Give proper input, sub array length can not be negative or zero" if given sub array length is zero or negative
        -Should return "Count of Unique Numbers is 2" if count of unique numbers in sub array of given length is 2
      
## Example
    Sample Input:
    array = {4,5,2,1,2}
    sub array length = 3
    
    Expected Output:   
    Count of Unique Numbers is 3
--------------------------------------------------------
    Sample Input:
    array = {6,10,4,5,2,1,2}
    sub array length = 7
    
    Expected Output:
    Count of Unique Numbers is 6
--------------------------------------------------------
    Sample Input:
    array = {6,10,4,5,2,1,2}
    sub array length = 10
    
    Expected Output:
    Give proper input, sub array length exceeds array length
--------------------------------------------------------
    Sample Input:
    array = {7,10,2,1,2}
    sub array length = -4
    
    Expected Output:
    Give proper input, sub array length can not be negative or zero
    
## Instructions
- Avoid printing unnecessary values other than expected output as given in sample
- Take care of whitespace/trailing whitespace
- Do not change the provided class/method names unless instructed
- Follow best practices while coding