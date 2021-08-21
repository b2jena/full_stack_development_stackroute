## Problem Statement: Product Analysis - Class and Objects

This exercise is based on the data present in the below class provided in the boilerplate. Refer and analyze this class. Do not edit it
-  `ProductRepository` 
    - Contains an in memory list of products as an array  

Complete the class Product and ProductService as per the below requirement

**Class Product**
    
 - Create the following properties. properties should be private:
        
          -productCode : int
          -name        : String
          -price       : double
          -category    : String 

 - Complete the parameterized constructor to initialize all properties
 - Complete the getters and setters for all properties

**Class ProductService**

Define the below methods

	+ findNameByCode(int): String
	    - Should take product code as parameter and return the name of the product from the list of products present in ProductRepository
        - If no product is found for the given product code, return null
 
	+ findMaxPriceProduct(String): Product
	    - Should take product category as a parameter and return the product object having the maximum price in the category provided
        - If no product is found for the given category, return null
 
	+ getProductsByCategory(String) : Product[] 
	    - Should take product category as parameter and return the array of products in the category provided 
        - If no product are found for the given category, return null

	
## Instructions
- Take care of whitespace/trailing whitespace
- Do not change the provided class/method names unless instructed
- Ensure your code compiles without any errors/warning/deprecations 
- Follow best practices while coding