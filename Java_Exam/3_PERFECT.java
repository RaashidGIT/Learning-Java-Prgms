// AIM: Write a program in Java to check whether a number is Perfect, Abundant, or Deficient.

import java.util.Scanner;

public class NumberTypeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) sum += i;
        }

        if (sum == num)
            System.out.println(num + " is a Perfect number.");
        else if (sum > num)
            System.out.println(num + " is an Abundant number.");
        else
            System.out.println(num + " is a Deficient number.");
    }
}
