import java.util.*;
public class Countnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of number: ");
        try {
            int count = 0;
            int num = sc.nextInt();
            if (num == 0) {
                System.out.println("The length of number is 1. ");
                return;
            }
            if (num < 0) {
                num = -num;
            }
            while (num != 0) {
                num = num / 10;
                count = count + 1;
            }
            System.out.println("The length of the numbers is: " + count);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input");
        } finally {
            sc.close();
        }
    }
}
