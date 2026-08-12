import java.util.*;
public class SumOfdigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers to find sum: ");
        try {
            int num = sc.nextInt();
            int sum = 0;
            if(num < 0){
                num = -num;
            }
            while (num != 0) {
                int last = num % 10;
                sum = sum + last;
                num = num / 10;
            }
            System.out.println("The sum of the nuumbers are: " + sum);
        } catch (InputMismatchException e) {
            System.out.println("please enter valid input");
        } finally {
            sc.close();
        }
    }
}
