// AIM: To count even, odd, positive, negative numbers, and zeros in an array

import java.util.Scanner;

public class NumberCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        int even = 0, odd = 0, pos = 0, neg = 0, zero = 0;

        for (int num : arr) {
            if (num == 0) zero++;
            else {
                if (num > 0) pos++;
                else neg++;
                if (num % 2 == 0) even++;
                else odd++;
            }
        }

        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);
        System.out.println("Positive numbers: " + pos);
        System.out.println("Negative numbers: " + neg);
        System.out.println("Zeroes: " + zero);
    }
}
