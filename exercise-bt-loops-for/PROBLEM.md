## Problem Statement: Phone number validator using for loop ##

**Given a String find whether it is a valid 10 digit phone number **

**This exercise contains a class named PhoneNumberValidator with the following method:**

    getInput():String 
    validatePhoneNumber(String):boolean
    displayResult():void  
  
- A string is scanned for phone number from the getInput() method.
- validatePhoneNumber() should validate the string using the following business rules:
      It should contain only numbers or dashes(-)
      Dashes may appear in any position.
      Should have exactly 10 digits 
- If the input string is empty/null,or if the string is nota valid phone number then false should be returned.

**Do the following in the main method of PhoneNumberValidator class**

call the functions in the required sequence. 

## Example
    Sample Input:
    99-080-99989
    
    Expected Output:
    Valid
--------------------------------------------------------
    Sample Input:
    99-6u-99999
    
    Expected Output:
    Invalid or empty string
--------------------------------------------------------
    Sample Input:
    91-999-99
    
    Expected Output:
    Invalid or empty string

## Instructions
- Avoid printing unnecessary values other than expected output as given in sample
- Take care of whitespace/trailing whitespace
- Do not change the provided class/method names unless instructed
- Follow best practices while coding
