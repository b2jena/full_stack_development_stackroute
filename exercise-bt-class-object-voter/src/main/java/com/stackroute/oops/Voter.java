package com.stackroute.oops;

/*
 This class is used to store Voter details
 */
public class Voter {

    private String name;
    private int age;

    /* Parameterised constructor */
    public Voter(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /*Getters and Setters*/
    public String getName() {
        return name;
        //return null;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
        //return -1;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /*
       Returns Voter details in a formatted String
    */
    @Override
    public String toString() {
        //return null;
        return "Voter{name='"+getName()+"', age="+getAge()+"}";
    }

    /*
        Returns the age criteria of voter based on the below criteria
            ADULT : >=18
            UNDERAGE : < 18
     */
    public String getAgeCriteria() {
        if(this.age>=18){
            return "ADULT";
        }
        return "UNDERAGE";
        //return null;
    }
}
