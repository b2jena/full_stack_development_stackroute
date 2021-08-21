package com.stackroute.commonjavaclasses;

public class WrapperClassConvert {
    /*
    Primitive type	Wrapper class
    boolean	        Boolean
    byte	        Byte
    char	        Character
    float	        Float
    int	            Integer
    long	        Long
    short	        Short
    double	        Double
     */
    //write logic to determine and convert given primitive type to its wrapper class and return result
    /*
     *One test case failing :
     *org.opentest4j.AssertionFailedError: Check the logic of your method convertToWrapper ==>
     *Expected :Give proper primitive type as input
     *Actual   :Java
     */
    public Object convertToWrapper(Object input) {
        // Attempt 02
        // there are only 8 primitive types & if input is any one of them then it's ok else it's not.
        if(input instanceof Boolean){
            return input;
        }else if(input instanceof Byte){
            return input;
        }else if(input instanceof Character){
            return input;
        }else if(input instanceof Float){
            return input;
        }else if(input instanceof Integer){
            return input;
        }else if(input instanceof Long){
            return input;
        }else if(input instanceof Short){
            return input;
        }else if(input instanceof Double){
            return input;
        }else{
            return "Give proper primitive type as input";
        }
        /* Hobbes Verdict : 83 % Attempt 01
        //An object is an instance of a class. A class is a template or blueprint from which objects are created. So, an object is the instance(result) of a class.
        try {
            if (input.toString().isBlank()) { //Returns true if the provided reference is null otherwise returns false
                //isNull(input) will always be false here
                //System.out.println("We are in try part ");
                return "Give proper primitive type as input";
            }
            return input;
        }
        //to avoid NullPointerException
        catch(NullPointerException e){
            //System.out.println("We are in catch part ");
            return "Give proper primitive type as input";
        }
        */
    }
}

