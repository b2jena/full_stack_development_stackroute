package com.stackroute.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.LongStream;


/**
 * Utility class for analyzing numbers in a List
 */
public class NumberUtility {

    /**
     * Returns count of even numbers in the given list of integers
     * Returns 0 if there are no even numbers or if the passed list is null
     */
    public long getEvenNumberCount(List<Integer> numbers) {
        if(numbers == null || numbers.isEmpty()){
            return 0;
        }
        long countEven = 0L;
        for(Integer num : numbers){
            if(num%2 == 0){
                ++countEven;
            }
        }
        //long counte = LongStream.of(numbers.stream().count())
                //.filter(i -> i%2 == 0)
                //.count();
        return countEven;
        //return counte;
        //return -1;
    }

    /**
     * Returns a list of even multiples of three from the given list of integers
     * Returns empty List, is the given list is null or empty
     */
    public List<Integer> getEvenMultiplesOfThree(List<Integer> numbers) {
        List<Integer> ans = new ArrayList<Integer>();
        if(numbers == null || numbers.isEmpty()){
            return ans;
        }
        for(Integer num : numbers){
            if(num%6 == 0){
                ans.add(num);
            }
        }
        return ans;
        //return null;
    }

    /**
     * Returns maximum of odd numbers
     * Returns 0 if there are no odd numbers or if the passed list is null
     */
    public Integer getMaximumOfOddNumbers(List<Integer> numbers) {
        if(numbers == null || numbers.isEmpty()){
            return 0;
        }
        Integer maxOdd = 0;
        for(Integer num : numbers){
            if(num%2 == 1 && num > maxOdd){
                maxOdd = num;
            }
        }
        return maxOdd;
        //return Integer.MIN_VALUE;
    }
}
