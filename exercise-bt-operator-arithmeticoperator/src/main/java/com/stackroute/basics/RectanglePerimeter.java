package com.stackroute.basics;

import java.util.Scanner;

public class RectanglePerimeter {
    public static void main(String[] args) {
        new RectanglePerimeter().getValues();
    }

    //get user input from console
    public void getValues() {
        //System.out.println("Enter length and breadth of the rectangle:");
        Scanner sc = new Scanner(System.in);
        double len = sc.nextDouble();
        double bre = sc.nextDouble();
        System.out.println(perimeterCalculator(len, bre));
    }

    //write logic to find perimeter of rectangle here
    public double perimeterCalculator(double length, double breadth) {
        //double perimeter = 2*length + 2*breadth;
        return 2 * (length + breadth) ;
    }
}
