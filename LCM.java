import java.util.*;
import java.lang.Math;

class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        try {
            int first = sc.nextInt();
            System.out.println("Enter the second number: ");
            int second = sc.nextInt();
            int larger = Math.max(first, second);
            int current = larger;
            int lcm = 1;

            if (first <= 0 || second <= 0) {
                System.out.println("Undefined lcm.");
                return;
            }
            while (true) {
                if (current % first == 0 && current % second == 0) {
                    lcm = current;
                    break;
                }
                current++;
            }
            System.out.println("The LCM of the given numbers is: " + lcm);

        } catch (InputMismatchException e) {
            System.out.println("please enter the valid input");
        } finally {
            sc.close();
        }
    }
}