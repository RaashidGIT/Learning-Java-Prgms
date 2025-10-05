import java.util.Scanner;

class Shape {
    int a, r, h;
    Scanner sc = new Scanner(System.in);
}

class TwoDimension extends Shape {
    void area() { }
}
class ThreeDimension extends Shape {
    void volume() { }
}

class Circle extends TwoDimension {
    void area() {
        System.out.print("Enter radius: ");
        r = sc.nextInt();
        System.out.println("Area of Circle = " + (Math.PI * r * r));
    }
}
class Square extends TwoDimension {
    void area() {
        System.out.print("Enter side: ");
        a = sc.nextInt();
        System.out.println("Area of Square = " + (a * a));
    }
}
class Triangle extends TwoDimension {
    void area() {
        System.out.print("Enter base: ");
        int b = sc.nextInt();
        System.out.print("Enter height: ");
        h = sc.nextInt();
        System.out.println("Area of Triangle = " + (0.5 * b * h));
    }
}

class Sphere extends ThreeDimension {
    void volume() {
        System.out.print("Enter radius: ");
        r = sc.nextInt();
        System.out.println("Volume of Sphere = " + ((4.0/3.0) * Math.PI * r * r * r));
    }
}
class Cube extends ThreeDimension {
    void volume() {
        System.out.print("Enter side: ");
        a = sc.nextInt();
        System.out.println("Volume of Cube = " + (a * a * a));
    }
}

public class StackDemo {
    public static void main(String[] args) {
        Circle cr = new Circle();
        Square sq = new Square();
        Triangle tr = new Triangle();
        Sphere sp = new Sphere();
        Cube cb = new Cube();

        System.out.println("\n--- 2D Shapes ---");
        cr.area();
        sq.area();
        tr.area();
        System.out.println("\n--- 3D Shapes ---");
        sp.volume();
        cb.volume();
    }
}
