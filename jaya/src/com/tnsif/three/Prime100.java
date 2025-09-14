package com.tnsif.three;

public class Prime100 {

	public static void main(String[] args) {
		System.out.println("The prime numbers from 1 to 100 are:");

		for (int num = 2; num <= 100; num++) {
			boolean isPrime = true;

			for (int i = 2; i <= Math.sqrt(num); i++) {
				if (num % i == 0) {
					isPrime = false;
					break;
				}
			}

			if (isPrime) {
				System.out.print(num + " ");
			}
		}
	}
}
