package com.stackroute.basics;

import java.util.Scanner;

public class Calculator {
    private static Scanner scan;

    // define,declare scanner and call getValues with scanner as parameter
    public static void main(String[] args) {
        scan = new Scanner(System.in);
        new Calculator().getValues(scan);
    }

    //Get values and which operator from the menu
    public void getValues(Scanner scan) {
        String out = "abc";
        char ch = 'y';
        while(ch == 'y') {
            //scan = new Scanner(System.in);
            //System.out.println("Enter the first number:");
            int fv = scan.nextInt();
            //System.out.println("Enter the second number:");
            int sv = scan.nextInt();
            //System.out.println("Enter number beside the operation to perform: \n" + " 1. Add \n" + " 2. Subtract\n" + " 3. Multiply\n" + " 4. Divide\n");
            int op = scan.nextInt();
            //System.out.println(op);

            out = calculate(fv, sv, op);
            ch = scan.next().charAt(0);
        }
        System.out.println(out);
    }

    //perform operation based on the chosen switch case corresponding to the menu and return string
    public String calculate(int firstValue, int secondValue, int operator) {
        int result = 0;
        char o = '_';
            switch (operator) {
                case 1:
                    result = firstValue + secondValue;
                    o = '+';
                    break;

                case 2:
                    result = firstValue - secondValue;
                        o = '-';
                        break;
                    case 3:
                        result = firstValue * secondValue;
                        o = '*';
                        break;
                    case 4:
                        if (secondValue != 0) {
                            result = firstValue / secondValue;
                            o = '/';
                        } else {
                            return "The divider (secondValue) cannot be zero";
                        }
                        break;
                    default:
                        return "Entered wrong option " + operator;
                }
        String  str = firstValue + " " + o + " " + secondValue + " = " + result;
        return str;
    }
}
