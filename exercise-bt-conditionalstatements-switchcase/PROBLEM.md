## Problem Statement: Develop a calculator using switch case ##

**Get two numbers of type of integer or double from the user and perform the operation(Add,Multiply,Divide,Subtract)
selected by the user using switchcase, if-else statement,break and looping switchcase using recursion**

**This exercise contains a class named Calculator with the following methods:**

    +calculate(int, int, int) : String  
         - Should take three integers(firstValue,secondValue,operator) as input and return a String of format "firstValue operation secondValue = result"
         - Switch case should be used to provide user operations as option to select
         - The number of switch cases should be similar to number of operation options provided in menu 
         - Operator value that is not present as a case should be dealt by default case
-------------------------------------------------------
    +getValues(Scanner) : String  
         - Should get three integers from user as input from console using scanner
         - After receiving the operands the operation menu should be shown to the user to choose from
         - All the three values should be send to calculate method and return value should be printed out to user

## Example
    Expected Output:
    Enter the first number:
    45
    Enter the second number:
    22
    Enter number beside the operation to perform: 
     1. Add 
     2. Subtract
     3. Multiply
     4. Divide
    1
    45 + 22 = 67
    Do you want to try again(y/n)
    n 
--------------------------------------------------------
    Expected Output:
    Enter the first number:
    65
    Enter the second number:
    34
    Enter number beside the operation to perform: 
     1. Add 
     2. Subtract
     3. Multiply
     4. Divide
    2
    65 - 34 = 31
    Do you want to try again(y/n)
    y
    Enter the first number:
    45
    Enter the second number:
    22
    Enter number beside the operation to perform: 
     1. Add 
     2. Subtract
     3. Multiply
     4. Divide
    1
    45 + 22 = 67
    Do you want to try again(y/n)
    n  
--------------------------------------------------------
    Expected Output:
    Enter the first number:
    45
    Enter the second number:
    22
    Enter number beside the operation to perform: 
     1. Add 
     2. Subtract
     3. Multiply
     4. Divide
    7
    Entered wrong option 7
--------------------------------------------------------
    Expected Output:
    Enter the first number:
    90
    Enter the second number:
    0
    Enter number beside the operation to perform: 
     1. Add 
     2. Subtract
     3. Multiply
     4. Divide
    4
    The divider (secondValue) cannot be zero 
## Instructions

- Avoid printing unnecessary values other than expected output as given in sample
- Take care of whitespace/trailing whitespace
- Do not change the provided class/method names unless instructed
- Follow best practices while coding