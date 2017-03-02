package com.dsa.lab2;

/**
 * Created by Home on 28/02/2017.
 */
abstract class Figure implements Comparable<Figure> {
    abstract double area();

    @Override
    public int compareTo(Figure o) {
        return (int) (this.area() - o.area());
    }
}