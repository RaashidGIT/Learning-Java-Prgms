// AIM: Write a program in Java to print the first 'n' prime numbers.

import java.util.Scanner;

public class PrimeNumbers {
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many prime numbers: ");
        int n = sc.nextInt();

        int count = 0, num = 2;
        while (count < n) {
            if (isPrime(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
    }
}

// AIM: Write a program in Java to print all prime numbers up to 'n'.

import java.util.Scanner;

public class Nprime {
    static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value for n: ");
        int n = sc.nextInt();

        for (int num = 2; num <= n; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
    }
}
