package com.stackroute.collections;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryNumberGenerator {
    //write logic to find binary number from 1 to given input
    public String findBinaryNumbersSequence(int input) {
        if(input<=0){
            return "Give proper input not zero or negative";
        }else if(input>20){
            return "Give proper input not greater than 20";
        }else{
            StringBuilder s = new StringBuilder();
            // Create an empty queue of strings
            Queue<String> q = new LinkedList<String>();

            // Enqueue the first binary number
            q.add("1");

            // This loops is like BFS of a tree with 1 as root
            // 0 as left child and 1 as right child and so on
            while (input-- > 0) {
                // print the front of queue
                String s1 = q.peek();
                q.remove();
                //System.out.println(s1);

                s.append(s1);  //appending s1 and space
                s.append(" ");

                // Store s1 before changing it
                String s2 = s1;

                // Append "0" to s1 and enqueue it
                q.add(s1 + "0");

                // Append "1" to s2 and enqueue it. Note that s2
                // contains the previous front
                q.add(s2 + "1");
            }
            //in the end there was a space " ", we need to remove it
            s.deleteCharAt(s.length()-1);
            return s.toString();
        }
        //return null;
    }
}
