package LAB_2;

import java.util.Scanner;

class Calculator {
    int subtract(int a, int b) {
        return a - b;
    }

    double subtract(double a, double b) {
        return a - b;
    }

    int subtract(int a, int b, int c) {
        return a - b - c;
    }
}

public class p6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.println("Choose operation type:");
        System.out.println("1. Subtract 2 integers");
        System.out.println("2. Subtract 2 doubles");
        System.out.println("3. Subtract 3 integers");
        System.out.print("Enter choice (1-3): ");
        int choice = sc.nextInt();
        sc.nextLine(); // consume newline

        switch (choice) {
            case 1 -> {
                System.out.print("Enter two integers separated by '-' (e.g., 20-5): ");
                String input = sc.nextLine();
                String[] parts = input.split("-");
                int a = Integer.parseInt(parts[0].trim());
                int b = Integer.parseInt(parts[1].trim());
                System.out.println("Result: " + calc.subtract(a, b));
            }
            case 2 -> {
                System.out.print("Enter two doubles separated by '-' (e.g., 10.5-4.5): ");
                String input = sc.nextLine();
                String[] parts = input.split("-");
                double a = Double.parseDouble(parts[0].trim().replace(',', '.'));
                double b = Double.parseDouble(parts[1].trim().replace(',', '.'));
                System.out.println("Result: " + calc.subtract(a, b));
            }
            case 3 -> {
                System.out.print("Enter three integers separated by '-' (e.g., 20-5-3): ");
                String input = sc.nextLine();
                String[] parts = input.split("-");
                int a = Integer.parseInt(parts[0].trim());
                int b = Integer.parseInt(parts[1].trim());
                int c = Integer.parseInt(parts[2].trim());
                System.out.println("Result: " + calc.subtract(a, b, c));
            }
            default -> System.out.println("Invalid choice!");
        }

        sc.close();
    }
}
