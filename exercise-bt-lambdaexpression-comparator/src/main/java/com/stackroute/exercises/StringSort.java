package com.stackroute.exercises;


import java.util.List;

public class StringSort {

    //write here logic to sort a string List
    public String stringSorter(List<String> stringList, String sortingOrder) {
        int stringCount = 0;
        if(stringList == null || sortingOrder == null){
            return "Given stringList or sortingOrder is empty, null or blank space";
        }
        for(String s : stringList){
            ++stringCount;
            if(s == null || s.isEmpty() || s.isBlank()){
                return "The list contains an empty or blank space value";
            }
        }
        if(stringCount == 1){
            return "The list contains only one value";
        }
        if(stringList.isEmpty() || stringList.toString().isBlank()){
            return "Given stringList or sortingOrder is empty, null or blank space";
        }
        if(sortingOrder.isBlank() || sortingOrder.isEmpty()){
            return "Given stringList or sortingOrder is empty, null or blank space";
        }

        sortingOrder.toLowerCase();
        if(sortingOrder.equals("asc") || sortingOrder.equals("ASC")){
            //sort in ascending order
            //Lambda expression for sorting the list stringList
            stringList.sort((String s1, String s2)->s1.compareTo(s2));
            return stringList.toString();
        }else if(sortingOrder.equals("desc") || sortingOrder.equals("DESC")){
            //sort in descending order
            //Lambda expression for sorting the list in reverse order
            stringList.sort((String s1, String s2)->s2.compareTo(s1));
            return stringList.toString();
        }else{
            return "No sorting order present for given string '" + sortingOrder + "' , 'asc' for ascending order sort and 'desc' for descending order sort";
        }
        //return null;
    }
}
