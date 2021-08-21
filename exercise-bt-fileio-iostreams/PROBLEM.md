## Problem Statement: Read the content from the given file(input.txt) and write the result to another file(output.txt) without redundant lines ##

**Given a file by name input.txt, read content using FileInputStream and write result to file by name output.txt by using FileOutputStream**

**This exercise contains a class named RemoveDuplicateLines with the following method:**

    +removeDuplicateLines(void) : void
        -Should read content line by line from input.txt 
        -Should write result to output.txt 
        
## Example
    Sample Input:
    
    input.txt
    JVM
    JRE
    JDK
    JRE
    JVM
    
    Expected Output:   
    
    output.txt
    JVM
    JRE
    JDK

## Instructions
- Avoid printing unnecessary values other than expected output as given in sample
- Take care of whitespace/trailing whitespace
- Do not change the provided class/method names unless instructed
- Follow best practices while coding