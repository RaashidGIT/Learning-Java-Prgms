// Aim: Demonstrate interface and abstract class usage in shape hierarchy

import java.util.Scanner;

interface Shape {
    void calculate(); 
}

abstract class TwoDimension implements Shape {
    int a, r, h;
    Scanner sc = new Scanner(System.in);
}
abstract class ThreeDimension implements Shape {
    int a, r, h;
    Scanner sc = new Scanner(System.in);
}

class Circle extends TwoDimension {
    public void calculate() {
        System.out.print("Enter radius of Circle: ");
        r = sc.nextInt();
        System.out.println("Area of Circle: " + (3.14 * r * r));
    }
}
class Square extends TwoDimension {
    public void calculate() {
        System.out.print("Enter side of Square: ");
        a = sc.nextInt();
        System.out.println("Area of Square: " + (a * a));
    }
}
class Triangle extends TwoDimension {
    public void calculate() {
        int b;
        System.out.print("Enter base of Triangle: ");
        b = sc.nextInt();
        System.out.print("Enter height of Triangle: ");
        h = sc.nextInt();
        System.out.println("Area of Triangle: " + (0.5 * b * h));
    }
}

class Sphere extends ThreeDimension {
    public void calculate() {
        System.out.print("Enter radius of Sphere: ");
        r = sc.nextInt();
        System.out.println("Volume of Sphere: " + (1.333 * 3.14 * r * r * r));
    }
}
class Cube extends ThreeDimension {
    public void calculate() {
        System.out.print("Enter side of Cube: ");
        a = sc.nextInt();
        System.out.println("Volume of Cube: " + (a * a * a));
    }
}

public class StackDemo {
    public static void main(String[] args) {
        Shape shape;
        System.out.println("\n--- 2D Shapes ---");

        shape = new Circle();
        shape.calculate();

        shape = new Square();
        shape.calculate();

        shape = new Triangle();
        shape.calculate();

        System.out.println("\n--- 3D Shapes ---");

        shape = new Sphere();
        shape.calculate();

        shape = new Cube();
        shape.calculate();
    }
}
