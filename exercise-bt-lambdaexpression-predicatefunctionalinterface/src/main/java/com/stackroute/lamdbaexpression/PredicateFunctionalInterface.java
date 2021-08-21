package com.stackroute.lamdbaexpression;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateFunctionalInterface {
    //write logic to find the values that starts with letter I in the given list
    public List<String> findPattern(List<String> list) {
        if(list == null || list.isEmpty()){
            return list;
        }
        List<String> res = new ArrayList<String>();
        //using lambda PredicateFunctionalInterface
        List Is = process(list, (String s) -> s.charAt(0) == ('I'));
        /*
        for(String s : list){
            if(s.charAt(0) == 'I'){
                res.add(s);
            }
        }
        return res;
        */
        return Is;
        //return null;
    }
    public static List<String> process(List<String> users,
                                     Predicate<String> predicat)
    {
        List<String> result = new ArrayList<String>();
        for (String user: users)
            if (!result.contains(user) && predicat.test(user))  //to remove duplicate elements
                result.add(user);
        return result;
    }
}
