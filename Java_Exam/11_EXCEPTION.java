// Aim: Demonstrate user-defined exception in Java by checking
// the length of a string and throwing an exception if it exceeds 10 characters.

import java.util.Scanner;

class StringTooLongException extends Exception {
    public StringTooLongException(String message) {
        super(message); 
    }
}

public class StringCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        try {
            if (str.length() > 10) {
                throw new StringTooLongException("String too long!");
            } else {
                System.out.println("Valid string: " + str);
            }
        } catch (StringTooLongException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
