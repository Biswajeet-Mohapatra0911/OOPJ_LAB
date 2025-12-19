package LAB_2;

import java.util.Scanner;

class RectangleArea {
    double length, breadth;

    RectangleArea() {
        length = 0;
        breadth = 0;
    }

    RectangleArea(double l, double b) {
        length = l;
        breadth = b;
    }

    double area() {
        return length * breadth;
    }
}

public class p7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Default constructor
        RectangleArea r1 = new RectangleArea();
        System.out.println("Area with default constructor (0x0): " + r1.area());

        // Parameterized constructor
        System.out.print("Enter length: ");
        double l = sc.nextDouble();
        System.out.print("Enter breadth: ");
        double b = sc.nextDouble();
        RectangleArea r2 = new RectangleArea(l, b);
        System.out.println("Area with parameterized constructor: " + r2.area());

        sc.close();
    }
}
