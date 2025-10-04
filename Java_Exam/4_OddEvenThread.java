// AIM: Write a Java program to print even and odd numbers using two separate threads.

import java.util.Scanner;

class EvenThread extends Thread {
    int limit;
    EvenThread(int limit) { this.limit = limit; }

    public void run() {
        System.out.print("Even numbers: ");
        for (int i = 1; i <= limit; i++) {
            if (i % 2 == 0) System.out.print(i + " ");
        }
        System.out.println();
    }
}

class OddThread extends Thread {
    int limit;
    OddThread(int limit) { this.limit = limit; }

    public void run() {
        System.out.print("Odd numbers: ");
        for (int i = 1; i <= limit; i++) {
            if (i % 2 != 0) System.out.print(i + " ");
        }
        System.out.println();
    }
}

public class EvenOddThreads {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit (n): ");
        int n = sc.nextInt();

        Thread t1 = new EvenThread(n);
        Thread t2 = new OddThread(n);

        t1.start();
        t2.start();
    }
}
