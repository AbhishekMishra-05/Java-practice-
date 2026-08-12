import java.util.*;

class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find palindrome: ");
        try {
            int original = sc.nextInt();
            int reverse = 0;

            if (original < 0) {
                original = -original;
            }
            int num = original;
            while (original != 0) {
                int digits = original % 10;
                reverse = reverse * 10 + digits;
                original = original / 10;
            }
            System.out.println("The reversed number is: " + reverse);
            if (num == reverse) {
                System.out.println("The number is plaindrome: " + reverse);
            } else {
                System.out.println("Not a palindrome number.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Enter the valid input");
        } finally {
            sc.close();
        }
    }
}