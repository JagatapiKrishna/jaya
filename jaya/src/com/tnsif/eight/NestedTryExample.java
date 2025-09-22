package com.tnsif.eight;

public class NestedTryExample {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30};

        try {
            System.out.println("Outer try block starts");

            try {
                int result = numbers[1] / 0; // ArithmeticException
                System.out.println("Result: " + result);
            } 
            catch (ArithmeticException e) {
                System.out.println("Inner catch: Cannot divide by zero");
            }

            // Accessing invalid index (ArrayIndexOutOfBoundsException)
            System.out.println(numbers[5]);
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Outer catch: Invalid array index");
        }

        System.out.println("Program continues after nested try-catch.");
    }
}
