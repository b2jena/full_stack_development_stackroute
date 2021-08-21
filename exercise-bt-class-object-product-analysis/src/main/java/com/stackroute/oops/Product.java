package com.stackroute.oops;

/*
    Product class stores the information about a single product.
    It contains parameterized constructor and Getters/Setters
 */
/*
     **Class Product**

     - Create the following properties. properties should be private:

              -productCode : int
              -name        : String
              -price       : double
              -category    : String

     - Complete the parameterized constructor to initialize all properties
     - Complete the getters and setters for all properties
 */
public class Product {
    private int productCode;
    private String name;
    private double price;
    private String category;
    public Product(int productCode, String name, double price, String category) {
        //constructor
        this.productCode = productCode;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    //getter
    public int getProductCode() {
        return productCode;
        //return -1;
    }

    //setter
    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }

    //getter
    public String getName() {
        return name;
        //return null;
    }

    //setter
    public void setName(String name) {
        this.name = name;
    }

    //getter
    public double getPrice() {

        return price;
    }

    //setter
    public void setPrice(double price) {
        this.price = price;
    }

    //getter
    public String getCategory() {
        return category;
        //return null;
    }

    //setter
    public void setCategory(String category) {
        this.category = category;
    }
}