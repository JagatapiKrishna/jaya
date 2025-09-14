package com.tnsif.three;

import java.util.*;

public class Even {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println("It is an even number");
        } else {
            System.out.println("It is an odd number");
        }

        System.out.println("Program executed");
        sc.close(); // Closing the scanner
    }
}
