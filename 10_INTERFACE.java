// Aim: Demonstrate interface and abstract class usage in shape hierarchy

/*
Structure:
----------
- Shape (interface): declares display() method
- TwoDim (abstract class): implements Shape, defines abstract area()
- ThreeDim (abstract class): implements Shape, defines abstract volume()

- Circle, Square, Triangle: extend TwoDim and implement area()
- Sphere, Cube: extend ThreeDim and implement volume()

This is a menu-driven program.
*/

import java.util.Scanner;

// Interface
interface Shape {
    void display();
}

// Abstract 2D class
abstract class TwoDim implements Shape {
    abstract double area();

}

// Abstract 3D class
abstract class ThreeDim implements Shape {
    abstract double volume();

}

// 2D Shape: Circle
class Circle extends TwoDim {
    double radius;

    Circle(double r) {
        radius = r;
    }

    double area() {
        return Math.PI * radius * radius;
    }

    public void display() {
        System.out.println("2D Shape: Circle");
        System.out.println("Area = " + area());
    }
}

// 2D Shape: Square
class Square extends TwoDim {
    double side;

    Square(double s) {
        side = s;
    }

    double area() {
        return side * side;
    }

    public void display() {
        System.out.println("2D Shape: Square");
        System.out.println("Area = " + area());
    }
}

// 2D Shape: Triangle
class Triangle extends TwoDim {
    double base, height;

    Triangle(double b, double h) {
        base = b;
        height = h;
    }

    double area() {
        return 0.5 * base * height;
    }

    public void display() {
        System.out.println("2D Shape: Triangle");
        System.out.println("Area = " + area());
    }
}

// 3D Shape: Sphere
class Sphere extends ThreeDim {
    double radius;

    Sphere(double r) {
        radius = r;
    }

    double volume() {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }

    public void display() {
        System.out.println("3D Shape: Sphere");
        System.out.println("Volume = " + volume());
    }
}

// 3D Shape: Cube
class Cube extends ThreeDim {
    double side;

    Cube(double s) {
        side = s;
    }

    double volume() {
        return side * side * side;
    }

    public void display() {
        System.out.println("3D Shape: Cube");
        System.out.println("Volume = " + volume());
    }
}

// Main demo class
public class ShapeHierarchyWithInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        Shape shape = null;

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

            if (shape != null && choice >= 1 && choice <= 5) {
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
