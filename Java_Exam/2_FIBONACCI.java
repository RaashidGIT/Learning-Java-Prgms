// AIM: Write a program in Java to print the first 'n' Fibonacci numbers.

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many Fibonacci numbers: ");
        int n = sc.nextInt();

        int a = 0, b = 1;
        System.out.println("First " + n + " Fibonacci numbers:");

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }
}
