package com.stackroute.oops;
import java.lang.*;
public class VehicleService {
    /*
    create a Car object and return it
     */
    public Car createCar(String name, String modelName, String type) {
        Car car = new Car(name, modelName, type);
        return car;
        //return null;
    }

    /*
    create a bike object and return it
     */
    public Bike createBike(String name, String modelName, String type) {
        Bike bike = new Bike(name, modelName, type);
        return bike;
        //return null;
    }

    /*
    Method should compare the speed only if the vehicle is of "SPORTS" type.
    Method should return 0 when speeds are equal otherwise should return maximum vehicle speed.
    Method returns -1 if the type is not "SPORTS"
    */
    public int compareMaxSpeed(Vehicle first, Vehicle second) {
        /*
        Vehicle objects should be downcasted to their respective concrete types
        */
        Car c1, c2;
        Bike b1, b2;
        String s = "sports";  //for maxSpeed()
        //4 scenarios
        //1->car car
        if(first instanceof Car && second instanceof Car){
            c1 = (Car) first;  //downcasting
            c2 = (Car) second;
            if(c1.maxSpeed(s) == c2.maxSpeed(s) && c1.getType().equals(s) && c2.getType().equals(s)){
                return 0;
            }
            else if(c1.getType().equals(s) && c2.getType().equals(s)){
                return Math.max(c1.maxSpeed(s), c2.maxSpeed(s));
            }
        }
        //2->bike car
        if(first instanceof Bike && second instanceof Car){
            b1 = (Bike) first;  //downcasting
            c2 = (Car) second;
            if(b1.maxSpeed(s) == c2.maxSpeed(s) && b1.getType().equals(s) && c2.getType().equals(s)){
                return 0;
            }
            else if(b1.getType().equals(s) && c2.getType().equals(s)){
                return Math.max(b1.maxSpeed(s), c2.maxSpeed(s));
            }
        }
        //3->bike bike
        if(first instanceof Bike && second instanceof Bike){
            b1 = (Bike) first;  //downcasting
            b2 = (Bike) second;
            if(b1.maxSpeed(s) == b2.maxSpeed(s) && b1.getType().equals(s) && b2.getType().equals(s)){
                return 0;
            }
            else if(b1.getType().equals(s) && b2.getType().equals(s)){
                return Math.max(b1.maxSpeed(s), b2.maxSpeed(s));
            }
        }
        //4->car bike
        if(first instanceof Car && second instanceof Bike){
            c1 = (Car) first;  //downcasting
            b2 = (Bike) second;
            if(c1.maxSpeed(s) == b2.maxSpeed(s) && c1.getType().equals(s) && b2.getType().equals(s)){
                return 0;
            }
            else if(c1.getType().equals(s) && b2.getType().equals(s)){
                return Math.max(c1.maxSpeed(s), b2.maxSpeed(s));
            }
        }
        //return 0; //when the speed are equal otherwise should return maximum vehicle speed.
        return -1;  //Method returns -1 if the type is not "SPORTS"
    }
}
