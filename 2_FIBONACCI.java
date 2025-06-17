// Aim: To print the first 'n' Fibonacci numbers as entered by the user

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object to take user input

        // Ask the user how many Fibonacci numbers they want
        System.out.print("Enter how many Fibonacci numbers you want: ");
        int n = scanner.nextInt(); // Read the number entered by the user

        int first = 0;  // First Fibonacci number
        int second = 1; // Second Fibonacci number

        System.out.println("First " + n + " Fibonacci numbers:");

        // Loop to print Fibonacci numbers
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " "); // Print the current Fibonacci number

            int next = first + second; // Calculate the next number in the series
            first = second;            // Update 'first' to the next number
            second = next;             // Update 'second' to the next number
        }
    }
}

/*

Simulated Output:
-----------------
Enter how many Fibonacci numbers you want: 10
First 10 Fibonacci numbers:
0 1 1 2 3 5 8 13 21 34

*/
