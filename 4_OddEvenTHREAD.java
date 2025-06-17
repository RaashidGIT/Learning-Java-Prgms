// Aim: To create two threads to display even and odd numbers up to a user-input number

import java.util.Scanner;

class EvenThread extends Thread {
    private int limit;

    EvenThread(int limit) {
        this.limit = limit;
    }

    @Override
    public void run() {
        System.out.println("Even numbers:");
        for (int i = 1; i <= limit; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                try {
                    Thread.sleep(100); // Pause for better visual output
                } catch (InterruptedException e) {
                    System.out.println("EvenThread interrupted.");
                }
            }
        }
        System.out.println(); // Line break after printing
    }
}

class OddThread extends Thread {
    private int limit;

    OddThread(int limit) {
        this.limit = limit;
    }

    @Override
    public void run() {
        System.out.println("Odd numbers:");
        for (int i = 1; i <= limit; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
                try {
                    Thread.sleep(100); // Pause for better visual output
                } catch (InterruptedException e) {
                    System.out.println("OddThread interrupted.");
                }
            }
        }
        System.out.println(); // Line break after printing
    }
}

public class EvenOddThreads {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner for user input

        // Prompt the user for the value of n
        System.out.print("Enter the limit (n): ");
        int n = scanner.nextInt(); // Read input value

        // Create thread objects
        EvenThread evenThread = new EvenThread(n);
        OddThread oddThread = new OddThread(n);

        // Start both threads
        evenThread.start();
        oddThread.start();
    }
}

/*
Simulated Output:
-----------------
Enter the limit (n): 10
Odd numbers:
1 3 5 7 9 
Even numbers:
2 4 6 8 10 

(Note: Order may vary due to thread scheduling.)
*/
