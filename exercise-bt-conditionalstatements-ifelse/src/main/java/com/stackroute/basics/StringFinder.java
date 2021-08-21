package com.stackroute.basics;

import java.io.*;
import java.text.*;
import java.util.Scanner;
import java.util.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class StringFinder {
    //Create Scanner object as instance variable
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //Get three strings from the user
        new StringFinder().getInput();

    }

    public String getInput() {
        //Scanner sc = new Scanner(System.in);
        String ss = sc.nextLine();
        String fstring = sc.nextLine();
        String sstring = sc.nextLine();
        findString(ss, fstring, sstring);
        //displayResult(res);
        return null;
    }

    public void displayResult(int result) {
        //displays the result
        if(result==1){
            System.out.println("Empty string or null");
        }
        if(result==2){
            System.out.println("Found as expected");
        }
        if(result==3){
            System.out.println("Not found");
        }
        //after this we can close the scanner
        new StringFinder().closeScanner();
    }

    public static int findString(String searchString, String firstString, String secondString) {
        try {
            int res, out;  //out is the output i am giving for test cases and res is the result to be evaluated for displayResult function

            String str = firstString + secondString;
            if(firstString.length()==0 || secondString.length()==0 || searchString.length() == 0) { //to check if the string is empty or null
                //searchString == null || firstString == null || secondString == null
                res = 1;
                out = -1;
            }else if(searchString.startsWith(firstString) && searchString.endsWith(secondString)) {
                res = 2;
                out = 1;
            }else{
                res = 3;
                out = 0;
            }
            new StringFinder().displayResult(res);
            return out;
        }
        catch(NullPointerException e){
            return -1;
        }
    }

    public void closeScanner() {
        sc.close();
    }
}
