package com.stackroute.collections;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class UniqueNumbersCounter {
    //write logic to find maximum unique numbers count from given array in the sub array of certain length
    public String findUniqueNumbersCount(int[] inputArray, int subArrayLength) {
       if(inputArray == null){
           return "Give proper input not null array";
       }
       else if(inputArray.length == 0){
           return "Give proper input not empty array";
       }
       else if(inputArray.length < subArrayLength){
           return "Give proper input, sub array length exceeds array length";
       }
       else if(subArrayLength<=0){
           return "Give proper input, sub array length can not be negative or zero";
       }
       else{
           //deque approach
           ArrayDeque<Integer> dq = new ArrayDeque<>();
           for(int i=0;i<subArrayLength;i++){
               dq.add(inputArray[i]);
           }
           int maxUnique = 0;
           List<Integer> list = new ArrayList<>();  //TO COLLECT UNIQUE ELEMENTS
           for(Integer i : dq){
               if(list.contains(i) == false){  //means it's not present in list till now
                   list.add(i);
                   ++maxUnique;
               }
           }
           return "Count of Unique Numbers is "+ maxUnique;

           /* HashMap Approach
           int maxUnique = 0;
           int N = inputArray.length;
           int M = subArrayLength;
           // Generate all subarrays of size M
           for (int i = 0; i <= N - M; i++) {
               int currentUnique = 0;

               HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

               for (int k = i; k < i + M; k++) {

                   // if the key is new to the map,
                   // push the key in map and increment
                   // count for unique number
                   if (!map.containsKey(inputArray[k])) {
                       map.put(inputArray[i], 1);
                       currentUnique++;
                   }
               }

               if (currentUnique > maxUnique)
                   maxUnique = currentUnique;
           }
           return "Count of Unique Numbers is "+ maxUnique;
           */
       }
       //return null;
    }
}
