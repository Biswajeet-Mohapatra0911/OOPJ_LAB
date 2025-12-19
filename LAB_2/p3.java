package LAB_2;

import java.util.Scanner;

class Box {
    double length, width, height;

    void setDimensions(double l, double w, double h) {
        length = l;
        width = w;
        height = h;
    }

    double volume() {
        return length * width * height;
    }
}

public class p3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Box box = new Box();

        System.out.print("Enter length: ");
        double l = sc.nextDouble();
        System.out.print("Enter width: ");
        double w = sc.nextDouble();
        System.out.print("Enter height: ");
        double h = sc.nextDouble();

        box.setDimensions(l, w, h);
        System.out.println("Volume of Box: " + box.volume());
        sc.close();
    }
}
