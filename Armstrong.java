import java.util.*;
import java.lang.Math;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        try {
            int num = sc.nextInt();
            int count = 0;
            int original = num;
            int sum = 0;
            if (num < 0) {
                System.out.println("please enter the number greater than 0.");
                return;
            }
            if (num == 0) {
                count = 1;
            }
            while (num != 0) {
                num = num / 10;
                count = count + 1;
            }
            num = original;
            while (num != 0) {
                int digit = num % 10;
                sum = sum + (int) Math.pow(digit, count);
                num = num / 10;
            }
            if (sum == original) {
                System.out.println("The given number is Armstrong number:" + sum);
            } else {
                System.out.println("Not an armstrong number: " + original);
            }
        } catch (InputMismatchException e) {
            System.out.println("Please enter valid number");
        } finally {
            sc.close();
        }
    }
}
