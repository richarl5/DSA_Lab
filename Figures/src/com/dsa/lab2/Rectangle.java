package com.dsa.lab2;

/**
 * Created by Home on 28/02/2017.
 */
public class Rectangle extends Figure {
    private double base,side;

    public Rectangle (double side, double base){
        this.side = side;
        this.base = base;
    }

    @Override
    public double area() {
        return base*side;
    }
}
