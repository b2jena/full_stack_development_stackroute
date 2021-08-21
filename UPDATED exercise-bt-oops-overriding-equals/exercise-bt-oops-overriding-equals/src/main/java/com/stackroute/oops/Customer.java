package com.stackroute.oops;


public class Customer {

    private int customerId;
    private String name;
    private String email;
    private Address address;
    public Customer() {
        //default Constructor
    }

    public boolean equals(Object customer){
        if(customer == this){
            return true;
        }
        //Check if address is an instance of Address or not
        //"null instanceof [type]" also returns false

        if(!(customer instanceof Customer)) {
            return false;
        }

        // typecast o to Address so that we can compare data members
        Customer c = (Customer) customer;

        if(this.getEmail()==null && c.getEmail()==null){
            return true;
        }
        if(this.getEmail()==null || c.getEmail()==null){
            return false;
        }
        return this.getCustomerId() == c.getCustomerId() && this.getName().equals(c.getName())
                && this.getAddress().equals(c.getAddress()) && this.getEmail().equals(c.getEmail());
    }

    public Customer(int customerId, String name, String email, Address address) {
        this.name = name;
        this.customerId = customerId;
        this.email= email;
        this.address = address;
    }

    public int getCustomerId() {
        return customerId;
        //return -1;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
        //return null;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
        //return null;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress() {
        return address;
        //return null;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
