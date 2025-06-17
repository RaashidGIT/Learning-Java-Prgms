// Aim: To count even, odd, positive, negative numbers, and zeros in an array

import java.util.Scanner;

public class NumberCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for size of array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n]; // Declare array

        // Input array elements
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Initialize counters
        int evenCount = 0, oddCount = 0;
        int positiveCount = 0, negativeCount = 0, zeroCount = 0;

        // Loop to count
        for (int num : arr) {
            if (num == 0) {
                zeroCount++;
            } else {
                if (num > 0) positiveCount++;
                else negativeCount++;

                if (num % 2 == 0) evenCount++;
                else oddCount++;
            }
        }

        // Display results
        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);
        System.out.println("Positive numbers: " + positiveCount);
        System.out.println("Negative numbers: " + negativeCount);
        System.out.println("Zeroes: " + zeroCount);
    }
}

/*
Simulated Output:
-----------------
Enter the number of elements in the array: 8
Enter 8 integers:
2 -3 0 5 0 -1 4 6

Even numbers: 3
Odd numbers: 3
Positive numbers: 4
Negative numbers: 2
Zeroes: 2
*/
