// Aim: To create a class Time with data members hour, minute, and second.
//      Create two objects and find the sum of the two times.

/*

This program demonstrates how to represent time using a class in Java.

- Each time object has 3 fields: hour, minute, and second.
- Two time objects are created by taking input from the user.
- These two times are added together.
- If the seconds exceed 60, they are converted into minutes.
- If the minutes exceed 60, they are converted into hours.
- The result is displayed in proper time format.

Example:
----------
Time 1:  2 hours 45 minutes 50 seconds
Time 2:  3 hours 20 minutes 30 seconds

Sum:     6 hours 6 minutes 20 seconds

*/

import java.util.Scanner;

class Time {
    int hour;
    int minute;
    int second;

    // Method to read time from user
    public void readTime(Scanner sc) {
        System.out.print("Enter hours: ");
        hour = sc.nextInt();
        System.out.print("Enter minutes: ");
        minute = sc.nextInt();
        System.out.print("Enter seconds: ");
        second = sc.nextInt();
    }

    // Method to display time
    public void displayTime() {
        System.out.println(hour + " hours " + minute + " minutes " + second + " seconds");
    }

    // Static method to add two Time objects
    public static Time addTime(Time t1, Time t2) {
        Time sum = new Time();
        sum.second = t1.second + t2.second;
        sum.minute = t1.minute + t2.minute + (sum.second / 60);
        sum.second = sum.second % 60;
        sum.hour = t1.hour + t2.hour + (sum.minute / 60);
        sum.minute = sum.minute % 60;
        return sum;
    }
}

public class TimeAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create two Time objects
        Time t1 = new Time();
        Time t2 = new Time();

        System.out.println("Enter first time:");
        t1.readTime(sc);

        System.out.println("Enter second time:");
        t2.readTime(sc);

        // Add the two time objects
        Time sum = Time.addTime(t1, t2);

        // Display the result
        System.out.println("Sum of two times:");
        sum.displayTime();

        sc.close();
    }
}

/*

Simulated Output:
-----------------
Enter first time:
Enter hours: 2
Enter minutes: 45
Enter seconds: 50

Enter second time:
Enter hours: 3
Enter minutes: 20
Enter seconds: 30

Sum of two times:
6 hours 6 minutes 20 seconds

*/
