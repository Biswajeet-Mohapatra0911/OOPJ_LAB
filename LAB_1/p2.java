package LAB_1;

public class p2 {
    public static void main(String[] args) {
        int marks = 85; // change marks here

        if (marks >= 90) {
            System.out.println("Grade: O");
        } else if (marks >= 80) {
            System.out.println("Grade: E");
        } else if (marks >= 70) {
            System.out.println("Grade: A");
        } else if (marks >= 60) {
            System.out.println("Grade: B");
        } else if (marks >= 50) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: Fail");
        }
    }
}
