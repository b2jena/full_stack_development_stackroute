## Problem Statement: Search a specific value from a sorted catalog List

**Given a catalog list and search value, sort the list and search for the given value in sorted list**

**This exercise contains a class named CatalogSortedListSearch with the following methods:**

     +catalogListSearcher(String) : String  
         - Should take a String as input and return a string as result
         - Should return error message when the String is null or empty or blank space  
         - Should iterate the sorted list to check String existence and return Found or Not Found 
--------------------------------------------------------
     +catalogListSorter(List<String>) : String
         - Should validate the List and return error message when it is null or empty and contains value like empty or blank space or null 
         - Should sort the List using Collections                 
         - Should return the global class List varaible      


## Example
    Sample Input:
    [Nike, Puma, Adidas, Reebok, UnderArmour, NBalance, SuperDry] AND reebok      
    
    Expected Output:
    Found: Reebok
--------------------------------------------------------
    Sample Input:
    [Nike, Puma, Adidas, Reebok, UnderArmour, NBalance, SuperDry] AND Lee
        
    Expected Output:
    "Not Found"
--------------------------------------------------------
    Sample Input:
    [Nike, Puma, Adidas, Reebok, UnderArmour, null, SuperDry] AND Lee
        
    Expected Output:
    "The catalog List contains empty or null or blank space as a value"
--------------------------------------------------------
    Sample Input:
    null
        
    Expected Output:
    "Input is not accepted"
--------------------------------------------------------
    Sample Input:
    []
        
    Expected Output:
    "The catalog list is empty"
--------------------------------------------------------
    Sample Input:
    [Nike, Puma, Adidas, Reebok, UnderArmour, NBalance, SuperDry]      
    
    Expected Output:
    [Adidas, NBalance, Nike, Puma, Reebok, SuperDry, UnderArmour]

## Instructions

- Avoid printing unnecessary values other than expected output as given in sample
- Take care of whitespace/trailing whitespace
- Do not change the provided class/method names unless instructed
- Follow best practices while coding