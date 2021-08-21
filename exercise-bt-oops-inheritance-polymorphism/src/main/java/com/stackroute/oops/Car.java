package com.stackroute.oops;

public class Car extends AbstractManufacturer implements Vehicle {
    public Car(String name, String modelName, String carType) {
        super(name, modelName, carType);
    }

    /*
    Method returns maximum speed depending upon their types
    For sports-250kmh
    For sedan-190kmh
     */
    @Override
    public int maxSpeed(String carType) {
        if(carType.equals("sports")){
            return 250;
        }else if(carType.equals("sedan")){
            return 190;
        }
        return 0;
    }

    /*
    should return in the format : Car{Manufacturer name:'name',Model Name:'modelName',Type:'type'}
     */
    @Override
    public String getManufacturerInformation() {

        return "Car{Manufacturer name:"+getName()+",Model Name:"+getModelName()+",Type:"+getType()+"}";
    }
}
