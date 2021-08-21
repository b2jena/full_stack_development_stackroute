package com.stackroute.strings;

public class LongestSubString {

    //write logic to find the longest substring that appears at both ends of a given string and return result
    public StringBuilder findLongestSubString(StringBuilder input) {

        //for reference purpose : https://docs.oracle.com/javase/7/docs/api/java/lang/StringBuilder.html

        StringBuilder output = new StringBuilder();  //initial value of output - null

        if(input.toString().isEmpty())
        {
            output.append("Give proper input");
            return output;
        }
        else if(input.toString().length()==1)
        {  //this is for the corner case where input = J
            return input;
        }
        String out = "";  //for using substring function

        int n = input.length();
        //if input length is even then longest substring length here cannot exceed n/2  --> 8 (<=4)
        //we need to iterate from 0 to n/2 like for 8 -> 0 to 4
        //else if input length is odd then longest substring length here cannot exceed floor(n/2)  --> 7 (<=3)
        //we need to iterate from 0 to ceil(n/2) like for 7 -> 0 to 4

        int i = n/2;

        if(n%2==0){  //even
            n = i;
        }else{  //odd
            n = i + 1;
        }

        while(i>0)
        {
            System.out.println("for "+ i + " value of out = " + out);
            out = input.substring(0,i);
            if(out.equals(input.substring(n))){
                output.append(out);
                System.out.println(output);
                return output;
            }
            i--;
            n++;
        }
        System.out.println(output);

        output.append("Longest substring is not present in the given StringBuilder");

        return output;
    }
}
