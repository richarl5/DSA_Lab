package com.dsa.lab2;
/**
 * Created by Home on 28/02/2017.
 */
public class EmptyStackException extends Exception {
    public EmptyStackException() {
        super("Stack is empty!");
    }
}
