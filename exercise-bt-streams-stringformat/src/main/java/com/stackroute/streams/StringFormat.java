package com.stackroute.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StringFormat {

    //write logic to find the format for given list and return result
    public String findStringFormat(List<Integer> input) {
        if(input.isEmpty()){
            return "Give proper input not empty list";
        }
        for(Integer it : input){
            if(it < 0){
                return "Give proper input not negative values";
            }
        }
        List<String> stringList = new ArrayList<String>();
        for(Integer it : input){
            if(it%2 == 0){
                stringList.add("even"+it);
            }else{
                stringList.add("odd"+it);
            }
        }
        String joinedList = stringList.stream().map(String::valueOf).collect(Collectors.joining(","));
        //return null;
        return joinedList;
    }
}
