// Aim: To print the first 'n' prime numbers as entered by the user

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object to take user input

        // Ask the user how many prime numbers they want
        System.out.print("Enter how many prime numbers you want: ");
        int n = scanner.nextInt(); // Read the number entered by the user

        int count = 0;    // Counter to keep track of how many prime numbers we've found
        int number = 2;   // Starting number to check for primality (smallest prime is 2)

        System.out.println("First " + n + " prime numbers:");
        while (count < n) { // Continue until we find 'n' prime numbers
            if (isPrime(number)) { // Check if the current number is prime
                System.out.print(number + " "); // Print the prime number
                count++; // Increment the prime count
            }
            number++; // Move to the next number
        }
    }

    // Method to check whether a number is prime
    public static boolean isPrime(int num) {
        if (num < 2) return false; // Numbers less than 2 are not prime
        for (int i = 2; i <= Math.sqrt(num); i++) { // Check divisibility up to the square root of the number
            if (num % i == 0) return false; // If divisible, not a prime
        }
        return true; // If no divisors found, it's a prime number
    }
}

/*
Simulated Output:
-----------------
Enter how many prime numbers you want: 10
First 10 prime numbers:
2 3 5 7 11 13 17 19 23 29
*/
