package com.stackroute.strings;

import java.util.*;
public class Anagram {
    //write logic to check given two phrases are anagrams or not and return result
    public String checkAnagrams(String phraseOne, String phraseTwo) {
        if(phraseOne.length()==0 || phraseTwo.length()==0){
            return "Give proper input not empty phrases";
        }
        if(phraseOne.length() != phraseTwo.length()){
            return "Given phrases are not anagrams";
        }
        //converting String into an array of characters to access all the characters individually
        char st1[] = (phraseOne).toCharArray();
        char st2[] = (phraseTwo).toCharArray();
        
        //sorting
        Arrays.sort(st1);
        Arrays.sort(st2);

        for(int i=0;i<st1.length;i++){
            if(st1[i]!=st2[i]){
                return "Given phrases are not anagrams";
            }
        }
        return "Given phrases are anagrams";
    }
}
