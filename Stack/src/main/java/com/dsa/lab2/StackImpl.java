package com.dsa.lab2;

/**
 * Created by Home on 26/02/2017.
 */
public class StackImpl<E> implements Stack<E> {

    private int index=0;
    private E[] data;

    public StackImpl (int size){
        this.data = (E[]) new Object[size];
    }

    @Override
    public int size() {
        return this.index;
    }

    public void push(E e) throws FullStackException {
        if (index < data.length) {
            data[index] = e;
            index++;
            System.out.println("Element "+ e + " added correctly!");
        }
        else {
            throw new FullStackException();
        }
    }

    @Override
    public E pop() throws EmptyStackException {
        if (index > 0){
            E ob = data[index - 1];
            data[index - 1] = null;
            index--;
            return ob;
        }
        throw new EmptyStackException();
    }
}