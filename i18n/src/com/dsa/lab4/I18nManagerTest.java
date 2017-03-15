package com.dsa.lab4;

import static org.junit.Assert.assertEquals;
/**
 * Created by Home on 15/03/2017.
 */
public class I18nManagerTest {

    @org.junit.Test (expected = java.util.MissingResourceException.class)
    public void testFR() throws Exception {
        String value = I18nManager.getInstance().getData("T1","fr");
    }

    @org.junit.Test
    public void tryES() throws Exception {
        assertEquals("Hola",I18nManager.getInstance().getData("T1","es"));
    }

    @org.junit.Test
    public void tryEN() throws Exception {
        assertEquals("Hello",I18nManager.getInstance().getData("T1","en"));
    }
}
