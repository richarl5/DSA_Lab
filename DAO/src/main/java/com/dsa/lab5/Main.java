package com.dsa.lab5;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by Home on 15/03/2017.
 */
public class Main {

    public static void main(String[] args) throws Exception {
        User u = new User(1,"Juan");
        Office c = new Office("Falsa","C/Falsa123");

        u.delete();
        c.delete();
        c.insert();
        u.insert();
        List<User> users = u.findAll();
        /*

        User u2 = new User(2,"T0000ni");
        u2.insert();

        //
        u2.setName("TONI");
        u2.update();          // "UPDATE User SET name='TONI' WHERE id = 2

        ///
        User u3 = new User(2,null);
        u3.select();
        System.out.println(u3.getName());   // out: "TONI"


        List<User> users = User.findAll();

        for (User aux: users) {
            System.out.println(aux.getName());
        }

        List<Office> offices = Office.findAll();

        for (Office office: offices) {
            System.out.println(office.getName());
        }
*/



    }
}
