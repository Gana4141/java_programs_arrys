package com.nit.arrays;


public class PrimeCheck {
    public static void main(String[] args) {
        int number = 29; // The number to check
        boolean isPrime = true;

        // 0 and 1 are not prime numbers
        if (number <= 1) {
            isPrime = false;
        } else {
            // Loop from 2 up to the square root of the number
            for (int i = 2; i <= Math.sqrt(number); i++) {
                // If the number is perfectly divisible by i, it's not prime
                if (number % i == 0) {
                    isPrime = false;
                    break; // Exit the loop early
                }
            }
        }

        // Print the final result
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}

