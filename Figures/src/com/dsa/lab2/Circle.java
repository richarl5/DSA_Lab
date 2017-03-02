package com.dsa.lab2;

/**
 * Created by Home on 01/03/2017.
 */
public class Circle extends Figure {
    private double radio;

    public Circle (double radio) {
        this.radio = radio;
    }

    @Override
    public double area() {
        return Math.PI*radio*radio;
    }
}
