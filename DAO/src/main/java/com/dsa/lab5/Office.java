package com.dsa.lab5;

/**
 * Created by Home on 15/03/2017.
 */
public class Office extends Dao {
    private String name,address;

    public Office(){}

    public Office(String name, String address){
        this.address=address;
        this.name=name;
    }

    public String getName()
    {
        return name;
    }

    public String getAddress()
    {
        return address;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public String getPrimaryKey() {
        return "name";
    }

    public String getPKMethod() {
        return "getName";
    }
}


