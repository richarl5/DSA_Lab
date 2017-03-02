package com.dsa.lab2;

import java.util.Arrays;

public class Main {

    public static double sum(Figure[] e){
        double ret=0;
        for(Figure f:e)
            ret+=f.area();
        return ret;
    }

    public static void main(String[] args) {
        Figure[] figures = new Figure[4];
        figures[0] = new Circle(5);
        figures[1] = new Square(5);
        figures[2] = new Rectangle(4,9);
        figures[3] = new Triangle(5,8);
        System.out.println("Total figures: " + figures.length + " and total area is: " + sum(figures));
        Arrays.sort(figures);
        System.out.println("Sort figures: " + Arrays.toString(figures));
    }
}
