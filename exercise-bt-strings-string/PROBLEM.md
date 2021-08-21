## Problem Statement: Find whether two phrases are anagrams of each other. One phrase is said to be anagram of the other if one phrase has same characters as the other ##

**Given two phrases, find whether two phrases are anagrams of each other. One phrase is said to be anagram of the other if one phrase has same characters as the other**

**This exercise contains a class named Anagram with the following method:**


    +checkAnagrams(String,String) : String
        -Should get phrases as input and return result as String like "Given phrases are anagrams" or "Given phrases are not anagrams"
        -Should check given phrases are anagrams to each other or not
        -Should return "Give proper input not empty phrases" if phrases are empty strings
        -Should return "Given phrases are anagrams" if given phrases are anagrams otherwise "Given phrases are anagrams"
        
      
## Example
    Sample Input:
    hello Java,Java Hello
    
    Expected Output:   
    Given phrases are not anagrams
--------------------------------------------------------
    Sample Input:
    coding coding
    
    Expected Output:
    Given phrases are anagrams
--------------------------------------------------------
    Sample Input:
    Java$ $java
    
    Expected Output:
    Given phrases are not anagrams
--------------------------------------------------------
    Sample Input:
    Hello World,Hello    World
    
    Expected Output:
    Given phrases are not anagrams

## Instructions
- Avoid printing unnecessary values other than expected output as given in sample
- Take care of whitespace/trailing whitespace
- Do not change the provided class/method names unless instructed
- Follow best practices while coding