## Problem Statement: Sort an String List using Lambda Expression Comparator

**Given a string list and sorting order sort the list using one sort statement with lambda expression comparator**

**This exercise contains a class named StringSort with the following method:**

     +stringSorter(List<String>, String) : String  
         - Should take a String list and a String as input and return a String as result
         - Should validate the input String List and String by checking whether it is null or empty and return an error String when the String list or String is empty or null
         - Should check String list contains more than one value and it is not empty or blank space and return error String when it is present.      
         - Should contain one sort statement and logic inside lambda expression               


## Example
    Sample Input:
    ["Kennedy","Apple","John"], "asc"     
    
    Expected Output:
    "[Kennedy, John, Apple]"
--------------------------------------------------------
    Sample Input:
    ["Kennedy","Apple","John"], "sort"
        
    Expected Output:
    No sorting order present for given string 'sort' , 'asc' for ascending order sort and 'desc' for descending order sort
--------------------------------------------------------
    Sample Input:
    ["Kennedy",""], "Desc"
        
    Expected Output:
    The list contains an empty or blank space value
--------------------------------------------------------
    Sample Input:
    ["Kennedy","Apple","John"], null
        
    Expected Output:
    Given stringList or sortingOrder is empty, null or blank space


## Instructions

- Avoid printing unnecessary values other than expected output as given in sample
- Take care of whitespace/trailing whitespace
- Do not change the provided class/method names unless instructed
- Follow best practices while coding