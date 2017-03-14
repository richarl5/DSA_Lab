package com.dsa.lab4;

/**
 * Created by Home on 14/03/2017.
 */
public class Main {

    public static void main(String[] args) {
        try {
            Factory.getInstance().getComand("C1").doSomething();
            Factory.getInstance().getComand("C2").doSomething();
            Factory.getInstance().getComand("C3").doSomething();
            Factory.getInstance().getComand("C4").doSomething();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
