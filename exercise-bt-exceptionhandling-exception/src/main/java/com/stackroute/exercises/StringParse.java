package com.stackroute.exercises;


public class StringParse {
    //Write logic to find the character from the sentence at specified location
    public char characterLocator(String sentence, String location) {
        int loc = Integer.parseInt(location);
        try{
            System.out.println(sentence.charAt(loc));
        }
        catch(Exception e){
            //e.printStackTrace();
            System.out.println(e);

        }
        return sentence.charAt(loc);
    }
}
