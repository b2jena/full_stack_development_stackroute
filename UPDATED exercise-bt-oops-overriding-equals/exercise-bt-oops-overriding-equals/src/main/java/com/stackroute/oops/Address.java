package com.stackroute.oops;

public class Address {
    private String area;
    private String city;
    public Address() {
        //default constructor
    }

    public boolean equals(Object address){
        if(address == this){
            return true;
        }
        /* Check if address is an instance of Address or not
          "null instanceof [type]" also returns false */
        if(!(address instanceof Address)) {
            return false;
        }

        // typecast o to Address so that we can compare data members
        Address c = (Address) address;
        //System.out.println(this.getCity());  //null
        //System.out.println(c.getCity());  //null
        //System.out.println(this.getCity().equals(c.getCity()));
        //System.out.println(this.getCity() == c.getCity());



        if(this.getCity()==null && c.getCity()==null){

            if(this.getArea()==null && c.getArea()==null){
                //all are null
                return true;
            }

            if(this.getArea()==null || c.getArea()==null){
                return false;
            }
            if(this.getArea()==c.getArea()){
                return true;
            }
            //System.out.println(this.getArea().equals(c.getArea()));
            if(this.getArea().equals(c.getArea())){
                return true;
            }

            return false;
        }
        if(this.getCity()==null || c.getCity()==null){
            return false;
        }

        if(this.getArea()==null && c.getArea()==null){

            if(this.getCity()==null || c.getCity()==null){
                return false;
            }
            if(this.getCity()==c.getCity()){
                return true;
            }
            //System.out.println(this.getArea().equals(c.getArea()));
            if(this.getCity().equals(c.getCity())){
                return true;
            }
            return false;
        }

        if(this.getArea()==null || c.getArea()==null){
            return false;
        }
        // Compare the data members and return accordingly
        return this.getArea().equals(c.getArea()) && this.getCity().equals(c.getCity());
    }

    public Address(String area, String city) {
        this.area = area;
        this.city = city;
    }

    public String getArea() {
        return area;
        //return null;
    }

    public void setArea(String area) {
        this.area=area;
    }

    public String getCity() {
        return city;
        //return null;
    }

    public void setCity(String city) {
        this.city = city;
    }
}