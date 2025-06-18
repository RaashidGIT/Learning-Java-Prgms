// Aim: To find the GCD (Greatest Common Divisor) of two numbers

import java.util.Scanner;

public class GCDCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();

        // Compute GCD using Euclidean algorithm
        int gcd = findGCD(a, b);

        // Display result
        System.out.println("GCD of " + a + " and " + b + " is: " + gcd);
    }

    // Method to compute GCD
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a); // Ensure GCD is always non-negative
    }
}

/*
Simulated Output:
-----------------
Enter the first number: 36
Enter the second number: 60
GCD of 36 and 60 is: 12
*/
