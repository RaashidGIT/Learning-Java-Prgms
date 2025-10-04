// AIM: To create a class Time with hour, minute, and second. 
//      Create two objects and find the sum of the two times.

import java.util.Scanner;

class Time {
    int hour, minute, second;

    void readTime(Scanner sc) {
        System.out.print("Enter hours: "); hour = sc.nextInt();
        System.out.print("Enter minutes: "); minute = sc.nextInt();
        System.out.print("Enter seconds: "); second = sc.nextInt();
    }

    void displayTime() {
        System.out.println(hour + " hours " + minute + " minutes " + second + " seconds");
    }

    static Time addTime(Time t1, Time t2) {
        Time sum = new Time();
        sum.second = t1.second + t2.second;
        sum.minute = t1.minute + t2.minute + sum.second / 60;
        sum.second %= 60;
        sum.hour = t1.hour + t2.hour + sum.minute / 60;
        sum.minute %= 60;
        return sum;
    }
}

public class TimeAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Time t1 = new Time();
        Time t2 = new Time();

        System.out.println("Enter first time:");
        t1.readTime(sc);
        System.out.println("Enter second time:");
        t2.readTime(sc);

        Time sum = Time.addTime(t1, t2);
        System.out.println("Sum of two times:");
        sum.displayTime();

        sc.close();
    }
}
