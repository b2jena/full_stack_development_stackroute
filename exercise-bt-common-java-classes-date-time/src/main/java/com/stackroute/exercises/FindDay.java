package com.stackroute.exercises;

import java.time.LocalDate;  //for localDate
import java.time.DayOfWeek;  //for dayOfWeek
public class FindDay {

    //write logic to find day of the date and return result
    public String findDay(int month, int day, int year) {
        StringBuilder output = new StringBuilder();
        if(month<1 || month>12){
            output.append("Give month in range");
        }
        if(day<1 || day>31){
            output.append("Give day in range");
        }
        if(year<2000 || year>3000){
            output.append("Give year in range");
        }
        if(output.length()>0) {
            return output.toString();
        }else{
            LocalDate localDate = LocalDate.of(year, month, day);

            DayOfWeek dayOfWeek = localDate.getDayOfWeek();

            //System.out.println(dayOfWeek.toString());
            return dayOfWeek.toString();
        }
    }
}
