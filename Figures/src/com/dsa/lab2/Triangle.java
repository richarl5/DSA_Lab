package com.dsa.lab2;

/**
 * Created by Home on 01/03/2017.
 */
public class Triangle extends Figure {
    private double base,height;

    public Triangle (double base, double height){
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return (base*height)/2;
    }
}
