package com.dsa.lab2;

/**
 * Created by Home on 26/02/2017.
 */
public interface Stack <E> {
    void push(E e) throws FullStackException;
    E pop() throws EmptyStackException;
    int size();
}
