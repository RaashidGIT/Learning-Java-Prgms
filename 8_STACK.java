// Aim: To create a class Stack and implement basic stack operations in Java

/*
This program demonstrates stack operations using an array:
- A stack is a LIFO (Last In, First Out) structure.
- Elements are pushed onto the top and popped from the top.
- We'll implement push, pop, peek, isEmpty, and display operations.

Example:
--------
Pushing: 10 → 20 → 30  
Stack: [10, 20, 30]  
Popping: removes 30  
Now Stack: [10, 20]
*/

import java.util.Scanner;

class Stack {
    private int maxSize;
    private int[] stackArray;
    private int top;

    // Constructor to initialize the stack
    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1; // Empty stack
    }

    // Push operation
    public void push(int value) {
        if (top == maxSize - 1) {
            System.out.println("Stack Overflow! Cannot push " + value);
        } else {
            stackArray[++top] = value;
            System.out.println(value + " pushed to stack.");
        }
    }

    // Pop operation
    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! Cannot pop.");
        } else {
            System.out.println(stackArray[top--] + " popped from stack.");
        }
    }

    // Peek operation
    public void peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Top element is: " + stackArray[top]);
        }
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Display all elements in the stack
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.print("Stack elements (top to bottom): ");
            for (int i = top; i >= 0; i--) {
                System.out.print(stackArray[i] + " ");
            }
            System.out.println();
        }
    }
}

public class StackDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter stack size: ");
        int size = sc.nextInt();

        Stack stack = new Stack(size);

        int choice;
        do {
            System.out.println("\n--- Stack Operations Menu ---");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Check if Empty");
            System.out.println("5. Display Stack");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    int val = sc.nextInt();
                    stack.push(val);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.peek();
                    break;
                case 4:
                    System.out.println("Is stack empty? " + stack.isEmpty());
                    break;
                case 5:
                    stack.display();
                    break;
                case 6:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 6);

        sc.close();
    }
}

/*

Simulated Output:
-----------------
Enter stack size: 3

--- Stack Operations Menu ---
1. Push
2. Pop
3. Peek
4. Check if Empty
5. Display Stack
6. Exit

Enter your choice: 1
Enter value to push: 10
10 pushed to stack.

Enter your choice: 1
Enter value to push: 20
20 pushed to stack.

Enter your choice: 5
Stack elements (top to bottom): 20 10

Enter your choice: 2
20 popped from stack.

Enter your choice: 5
Stack elements (top to bottom): 10

Enter your choice: 6
Exiting program.

*/
