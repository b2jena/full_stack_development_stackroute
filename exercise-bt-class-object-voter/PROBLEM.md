## Problem Statement: Voter - Class definition,Object creation and static method

**Complete the class Voter and VoterService as per the below requirement**

**Class Voter**

Create the following properties. Properties should be private:

    -name  : String           
    -age   : int
- Define parameterized constructor to initialize all properties 
- Define Getters and Setters for all properties
- Functionality of methods should be completed, such that all the test cases pass
- Some of the requirements/hints are mentioned below
- In this problem, the voter need to be classified based on the age category as given below
## Classification of Voter:
    Based on age : 
            >= 18 : ADULT,     < 18 : UNDERAGE
     
     
**VoterType is an enumeration, which has constants for various classification of voter**


**class VoterService**
-   Define the below methods:

        +createVoter(String, int) : Voter
            - Should create a voter object using input name and age, and return the object 

        +getVoterDescription(Voter voter) : VoterType
            - This method returns enum VoterType classification based on the age criteria of Voter


        
## Instructions

- Avoid printing unnecessary values other than expected output as given in sample
- Take care of whitespace/trailing whitespace
- Do not change the provided class/method names unless instructed
- Follow best practices while coding