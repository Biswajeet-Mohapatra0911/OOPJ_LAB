package LAB_1;

public class p4 {
    public static void main(String[] args) {
        int num = 121; // change number here
        int temp = num;
        int rev = 0;

        while (temp > 0) {
            rev = rev * 10 + temp % 10;
            temp = temp / 10;
        }

        if (rev == num) {
            System.out.println(num + " is a Palindrome");
        } else {
            System.out.println(num + " is NOT a Palindrome");
        }
    }
}
