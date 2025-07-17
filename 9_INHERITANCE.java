// Aim: Demonstrate inheritance hierarchy using Shape as base class,
// TwoDim and ThreeDim as subclasses, with Circle, Square, Triangle (2D) and Sphere, Cube (3D)

/*
This program uses inheritance to model different shapes.
- Shape: Base class (abstract)
- TwoDim, ThreeDim: Intermediate abstract classes
- Circle, Square, Triangle (2D shapes)
- Sphere, Cube (3D shapes)

Operations are menu-driven:
- User selects shape and inputs dimensions
- Area or Volume is computed and displayed
*/

import java.util.Scanner;

abstract class Shape {
    abstract void display();
}

abstract class TwoDim extends Shape {
    abstract double area();
}

abstract class ThreeDim extends Shape {
    abstract double volume();
}

// 2D Shapes
class Circle extends TwoDim {
    double radius;

    Circle(double r) {
        radius = r;
    }

    double area() {
        return Math.PI * radius * radius;
    }

    void display() {
        System.out.println("2D Shape: Circle");
        System.out.println("Area = " + area());
    }
}

class Square extends TwoDim {
    double side;

    Square(double s) {
        side = s;
    }

    double area() {
        return side * side;
    }

    void display() {
        System.out.println("2D Shape: Square");
        System.out.println("Area = " + area());
    }
}

class Triangle extends TwoDim {
    double base, height;

    Triangle(double b, double h) {
        base = b;
        height = h;
    }

    double area() {
        return 0.5 * base * height;
    }

    void display() {
        System.out.println("2D Shape: Triangle");
        System.out.println("Area = " + area());
    }
}

// 3D Shapes
class Sphere extends ThreeDim {
    double radius;

    Sphere(double r) {
        radius = r;
    }

    double volume() {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }

    void display() {
        System.out.println("3D Shape: Sphere");
        System.out.println("Volume = " + volume());
    }
}

class Cube extends ThreeDim {
    double side;

    Cube(double s) {
        side = s;
    }

    double volume() {
        return side * side * side;
    }

    void display() {
        System.out.println("3D Shape: Cube");
        System.out.println("Volume = " + volume());
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Shape Menu ---");
            System.out.println("1. Circle (2D)");
            System.out.println("2. Square (2D)");
            System.out.println("3. Triangle (2D)");
            System.out.println("4. Sphere (3D)");
            System.out.println("5. Cube (3D)");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            Shape shape = null;

            switch (choice) {
                case 1:
                    System.out.print("Enter radius: ");
                    double r1 = sc.nextDouble();
                    shape = new Circle(r1);
                    break;
                case 2:
                    System.out.print("Enter side: ");
                    double s1 = sc.nextDouble();
                    shape = new Square(s1);
                    break;
                case 3:
                    System.out.print("Enter base: ");
                    double b = sc.nextDouble();
                    System.out.print("Enter height: ");
                    double h = sc.nextDouble();
                    shape = new Triangle(b, h);
                    break;
                case 4:
                    System.out.print("Enter radius: ");
                    double r2 = sc.nextDouble();
                    shape = new Sphere(r2);
                    break;
                case 5:
                    System.out.print("Enter side: ");
                    double s2 = sc.nextDouble();
                    shape = new Cube(s2);
                    break;
                case 6:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

            if (shape != null) {
                shape.display();
            }

        } while (choice != 6);

        sc.close();
    }
}

/*

--- Shape Menu ---
1. Circle (2D)
2. Square (2D)
3. Triangle (2D)
4. Sphere (3D)
5. Cube (3D)
6. Exit
Enter your choice: 1
Enter radius: 3
2D Shape: Circle
Area = 28.274333882308138

*/
