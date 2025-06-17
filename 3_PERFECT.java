// Aim: To check whether a given number is Perfect, Abundant, or Deficient

/*

Perfect (sum of proper divisors equals the number)

Abundant (sum of proper divisors is greater than the number)

Deficient (sum of proper divisors is less than the number)

*/

import java.util.Scanner;

public class NumberTypeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner object to take user input

        // Ask the user to enter a number
        System.out.print("Enter a number: ");
        int num = scanner.nextInt(); // Read the number

        int sum = 0; // To store the sum of proper divisors

        // Loop to find all proper divisors (excluding the number itself)
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i; // Add the divisor to the sum
            }
        }

        // Check the type of the number
        if (sum == num) {
            System.out.println(num + " is a Perfect number.");
        } else if (sum > num) {
            System.out.println(num + " is an Abundant number.");
        } else {
            System.out.println(num + " is a Deficient number.");
        }
    }
}

/*

Perfect: Sum of proper divisors = number (e.g., 6, 28)

Abundant: Sum of proper divisors > number (e.g., 12)

Deficient: Sum of proper divisors < number (e.g., 9)

-----------------
Simulated Output:
-----------------
Example 1:
Enter a number: 28
28 is a Perfect number.

Example 2:
Enter a number: 12
12 is an Abundant number.

Example 3:
Enter a number: 9
9 is a Deficient number.

*/
