package LAB_1;

import java.util.Scanner;

public class p5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Name: ");
        String first = sc.nextLine();

        System.out.print("Enter Second Name: ");
        String last = sc.nextLine();

        System.out.println(last + " " + first);
    }
}
