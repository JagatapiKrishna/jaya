package com.tnsif.five;

public class StaticExample {

    // static variable
    static int count;

    // static block (runs once when class is loaded)
    static {
        count = 0;
        System.out.println("Static block: count set to 0");
    }

    // constructor
    StaticExample() {
        count++;
    }

    // static method
    static void showCount() {
        System.out.println("Objects created: " + count);
    }

    public static void main(String[] args) {
        // creating objects
        //new StaticExample();
        //new StaticExample();
        new StaticExample();

        // calling static method
        StaticExample.showCount();
    }
}
