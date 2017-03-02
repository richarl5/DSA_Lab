package com.dsa.lab2;

public class StackImplTest {

    public static void testIntegerPush() {
        Stack<Integer> st = new StackImpl<>(5);
        try {
            st.push(1);
            st.push(2);
            st.push(3);
            st.push(4);
            st.push(5);
            st.push(6);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void testStringPop() {
        Stack<String> st = new StackImpl<>(3);
        try {
            st.push("1");
            st.push("2");
            st.push("3");
            System.out.println(st.pop());
            System.out.println(st.pop());
            System.out.println(st.pop());
            System.out.println(st.pop());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        testIntegerPush();
        testStringPop();
    }
}