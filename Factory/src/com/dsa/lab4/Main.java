package com.dsa.lab4;

import org.apache.log4j.Logger;

/**
 * Created by Home on 14/03/2017.
 */
public class Main {

    private static Logger log = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        try {
            Factory.getInstance().getComand("C1").doSomething();
            Factory.getInstance().getComand("C1").doSomething();
            Factory.getInstance().getComand("C2").doSomething();
            Factory.getInstance().getComand("C3").doSomething();
            Factory.getInstance().getComand("C4").doSomething();
        } catch (Exception e) {
            log.fatal("Exception found:",e);
        }
    }
}
