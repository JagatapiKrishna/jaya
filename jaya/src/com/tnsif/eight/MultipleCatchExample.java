package com.tnsif.eight;

public class MultipleCatchExample {

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30};
        String str = null;

        try {
            // This may throw ArrayIndexOutOfBoundsException
            System.out.println(numbers[5]);

            // This may throw NullPointerException
            System.out.println(str.length());
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds: " + e);
        }
        catch (NullPointerException e) {
            System.out.println("Null value found: " + e);
        }

        System.out.println("Program continues after multiple catches.");

        // TODO Auto-generated method stub
    }
}
