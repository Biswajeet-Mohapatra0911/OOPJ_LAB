package LAB_2;

import java.util.Scanner;

class Rectangle1 {
    double length, breadth;

    Rectangle1(double l, double b) {
        length = l;
        breadth = b;
    }

    void displayArea() {
        System.out.println("Area: " + (length * breadth));
    }

    void displayPerimeter() {
        System.out.println("Perimeter: " + 2 * (length + breadth));
    }
}

public class p4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        double l = sc.nextDouble();
        System.out.print("Enter breadth: ");
        double b = sc.nextDouble();

        Rectangle1 rect = new Rectangle1(l, b);
        rect.displayArea();
        rect.displayPerimeter();
        sc.close();
    }
}
