package com.tnsif.five;

public class MethodOverloading {

    // 1. Different type of parameters
    public void display(int a) {
        System.out.println("Method with int parameter: " + a);
    }

    public void display(double a) {
        System.out.println("Method with double parameter: " + a);
    }

    // 2. Different sequence of parameters
    public void display(int a, String b) {
        System.out.println("Method with (int, String): " + a + ", " + b);
    }

    public void display(String b, int a) {
        System.out.println("Method with (String, int): " + b + ", " + a);
    }

    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();

        // Calls based on different types
        obj.display(10);        // int
        obj.display(12.5);      // double

        // Calls based on different sequence
        obj.display(101, "Krishna");
        obj.display("Krishna", 101);
    }
}
