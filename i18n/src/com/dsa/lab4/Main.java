package com.dsa.lab4;

/**
 * Created by Home on 15/03/2017.
 */
public class Main {

    public static void main(String[] args) {
        try {
            I18nManager.getInstance().getData("T1","es");
            I18nManager.getInstance().getData("T1","en");
            I18nManager.getInstance().getData("T1","fr");
        } catch (Exception e) {
            System.out.println("Resource not found!");
        }
    }
}
