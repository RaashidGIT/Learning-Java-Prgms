/*
Aim of the Program:
-------------------
To implement a user-defined exception (MyExclass) in Java.
The program takes a string as input and throws an exception
if the string length is more than 10 characters.
*/

import java.util.Scanner;

// User-defined exception class
class MyExclass extends Exception {
    public MyExclass(String message) {
        super(message);   // Pass message to parent Exception class
    }
}

public class StringCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Input a string from user
            System.out.print("Enter a string: ");
            String str = sc.nextLine();

            // Check length of string
            if (str.length() > 10) {
                // Throw user-defined exception
                throw new MyExclass("String too large!");
            } else {
                System.out.println("Valid string: " + str);
            }
        }
        catch (MyExclass e) {
            // Handle the user-defined exception
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}

/*
Simulated Output:
-----------------

Case 1:
-------
Enter a string: Hello
Valid string: Hello

Case 2:
-------
Enter a string: Programming
Exception caught: String too large!
*/
