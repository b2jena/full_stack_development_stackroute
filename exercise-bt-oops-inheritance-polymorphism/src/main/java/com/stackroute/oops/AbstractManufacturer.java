package com.stackroute.oops;

/*
Class is having 3 fields name, modelName and type.
Type varies for different vehicles.
eg. Car is of type sedan, sports...
Bike is of type cruiser, sports...
 */
public abstract class AbstractManufacturer {
    private String name;
    private String modelName;
    private String type;

    public AbstractManufacturer(String name, String modelName, String type){
        this.name = name;
        this.modelName = modelName;
        this.type = type;
    }

    public String getModelName() {
        return modelName;
        //return null;
    }

    public String getType() {
        return type;
        //return null;
    }

    public String getName() {
        return name;
        //return null;
    }

    public abstract String getManufacturerInformation();
}
