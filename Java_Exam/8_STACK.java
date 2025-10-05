// Aim: To create a class Stack and implement basic stack operations in Java

import java.util.Scanner;

class Stack {
    int maxSize;     
    int[] stack;      
    int top;          

    Stack(int size) {
        maxSize = size;
        stack = new int[maxSize];
        top = -1;
    }
  
    void push(int value) {
        if (top == maxSize - 1)
            System.out.println("Stack Overflow");
        else
            stack[++top] = value;
    }
    void pop() {
        if (top == -1)
            System.out.println("Stack Underflow");
        else
            System.out.println("Popped: " + stack[top--]);
    }
    void peek() {
        if (top == -1)
            System.out.println("Stack is Empty");
        else
            System.out.println("Top element: " + stack[top]);
    }
    void display() {
        if (top == -1)
            System.out.println("Stack is Empty");
        else {
            System.out.print("Stack: ");
            for (int i = top; i >= 0; i--)
                System.out.print(stack[i] + " ");
            System.out.println();
        }
    }
}

public class StackDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter stack size: ");
        int size = sc.nextInt();
        Stack s = new Stack(size);
        int choice, value;
        do {
            System.out.println("\n1.Push 2.Pop 3.Peek 4.Display 5.Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter value: ");
                    value = sc.nextInt();
                    s.push(value);
                    break;
                case 2:
                    s.pop();
                    break;
                case 3:
                    s.peek();
                    break;
                case 4:
                    s.display();
                    break;
                case 5:
                    System.out.println("Exiting...");
            }
        } while (choice != 5);
    }
}
