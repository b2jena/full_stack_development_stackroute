## Problem Statement: Generate the binary numbers from 1 to N (N>=1 && N<=20)##

**Given a number(N), generate the binary numbers from 1 to N using queue**

**This exercise contains a class named BinaryNumberGenerator with the following method:**


    +findBinaryNumbersSequence(int) : String
        -Should accept number as input
        -Should generate the binary numbers from 1 to N and return as result
        -Should return "Give proper input not zero or negative" if given number is zero or negative
        -Should return "Give proper input not greater than 20" if given number is greater than 20
      
## Example
    Sample Input:
    4
    
    Expected Output:   
    1 10 11 100
--------------------------------------------------------
    Sample Input:
    -5
        
    Expected Output:
    Give proper input not zero or negative
--------------------------------------------------------
    Sample Input:
    44
    
    Expected Output:
    Give proper input not greater than 20
    
## Instructions
- Avoid printing unnecessary values other than expected output as given in sample
- Take care of whitespace/trailing whitespace
- Do not change the provided class/method names unless instructed
- Follow best practices while coding