package com.dsa.lab5;

/**
 * Created by Home on 15/03/2017.
 */
public class User extends Dao {
    private Integer id;
    private String name;
    // surname

    public User(){}

    public User(Integer id, String name){
        this.id=id;
        this.name=name;
    }

    public String getName()
    {
        return name;
    }

    public int getId()
    {
        return id;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public String getPrimaryKey() {
        return "id";
    }

    public String getPKMethod() {
        return "getId";
    }
}
