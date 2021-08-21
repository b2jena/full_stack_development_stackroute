## Problem Statement: Overriding Equals

Complete the class Customer and Address as per the below requirement

**class Address**

Create the following properties.properties should be private:

    -area : String 
    -city : String

- Define default constructor
- Define parameterized constructor to initialize all the properties
- Define Getters and Setters
- Override equals method with proper implementation as per the rules given at the end of the problem statement


**Class Customer**

Create the following properties. properties should be private:

    -customerId : int    
    -name       : String
    -email      : String
    -address    : Address 

- Define default constructor
- Define parameterized constructor to initialize all the properties
- Define Getters and Setters for all properties
- Override equals with proper implementation as per the rules given at the end of the problem statement

## Rules for implementing `equals` method

        It is reflexive: for any non-null reference value x, x.equals(x) should return true.
        It is symmetric: for any non-null reference values x and y, x.equals(y) should return true if and only if y.equals(x) returns true.
        It is transitive: for any non-null reference values x, y, and z, if x.equals(y) returns true and y.equals(z) returns true, then x.equals(z) should return true.
        It is consistent: for any non-null reference values x and y, multiple invocations of x.equals(y) consistently return true or consistently return false, provided no information used in equals comparisons on the objects is modified.
        For any non-null reference value x, x.equals(null) should return false.
        
        Note that it is generally necessary to override the hashCode method whenever this method is overridden, so as to maintain the general contract for the hashCode method, which states that equal objects must have equal hash codes.

## Instructions
- Do not change the provided class/method names unless instructed
- Ensure your code compiles without any errors/warning/deprecations 
- Follow best practices while coding