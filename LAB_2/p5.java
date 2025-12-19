package LAB_2;

import java.util.Scanner;

class Student {
    int roll;
    String name;
    double cgpa;

    void readStudent(Scanner sc) {
        System.out.print("Enter Roll: ");
        roll = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter CGPA: ");
        cgpa = Double.parseDouble(sc.nextLine().replace(',', '.'));
    }

    void displayStudent() {
        System.out.println("Roll: " + roll + ", Name: " + name + ", CGPA: " + cgpa);
    }
}

public class p5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details of student " + (i + 1));
            students[i] = new Student();
            students[i].readStudent(sc);
        }

        double minCGPA = students[0].cgpa;
        String minName = students[0].name;

        System.out.println("\nStudent Details:");
        for (Student s : students) {
            s.displayStudent();
            if (s.cgpa < minCGPA) {
                minCGPA = s.cgpa;
                minName = s.name;
            }
        }

        System.out.println("Student with lowest CGPA: " + minName);
        sc.close();
    }
}
