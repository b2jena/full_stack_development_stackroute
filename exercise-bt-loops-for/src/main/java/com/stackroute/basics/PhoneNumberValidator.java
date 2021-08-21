package com.stackroute.basics;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.lang.*;
import java.util.regex.*;

public class PhoneNumberValidator {
    //Create Scanner object as instance variable
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        PhoneNumberValidator object = new PhoneNumberValidator();
        String input = object.getInput();
        boolean result = object.validatePhoneNumber(input);
        object.displayResult(result);
    }

    public String getInput() {
        String s = sc.nextLine();
        //validatePhoneNumber(s);
        return s;
        //return null;
    }

    public void displayResult(boolean result) {
        //System.out.println(result);
        if(result){
            System.out.println("Valid");
        }else{
            System.out.println("Invalid or empty string");
        }
    }

    public boolean validatePhoneNumber(String s) {
        try {
            //System.out.println(s);
            //digit count should be 10
            int cnt = 0;
            s = s.replaceAll("-", "");
            if (s.isEmpty()) {
                //System.out.println(s);
                return false;
            }
            //String str = s.trim();
            //System.out.println(s);
            //System.out.println(s.length());
            for (int i = 0; i < s.length(); i++) {
                //int j = (int)s.charAt(i);
                //System.out.println(j);
                if (Character.isDigit(s.charAt(i))) {
                    ++cnt;
                }
            }
            //System.out.println(cnt);
            if (cnt != 10) {
                //System.out.println(cnt);
                return false;
            }
            //s must contain -(s) and [0,9] numbers
            for (int i = 0; i < s.length(); i++) {
                if (!Character.isDigit(s.charAt(i))) {
                    //System.out.println("here : " + s.charAt(i));
                    return false;
                }
            }
            return true;
        }
        catch(NullPointerException e){
            return false;
        }
       //return false;
    }
}
