// Aim: To find the GCD (Greatest Common Divisor) of two numbers

/*

GCD of two (or more) integers is the largest positive integer that evenly divides both numbers — meaning it leaves no remainder.

- Let's take two numbers: 36 and 60
- Factors of 36: 1, 2, 3, 4, 6, 9, 12, 18, 36
- Factors of 60: 1, 2, 3, 4, 5, 6, 10, 12, 15, 20, 30, 60
- Common factors: 1, 2, 3, 4, 6, 12
- GCD = 12 (the greatest among the common factors)

*/

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
