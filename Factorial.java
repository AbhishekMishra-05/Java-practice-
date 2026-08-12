import java.util.*;
class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find factorial: ");
        try {
            long fact = 1;
            int num = sc.nextInt();
            if(num < 0 ){
                System.out.println("please enter number greater than 0.");
                return;
            }
            for (int i = 1; i <= num; i++) {
                fact = fact * i;
            }
            System.out.println("The factorial of the number is: " + fact);
        } catch (InputMismatchException e) {
            System.out.println("Enter valid Input.");
        } finally {
            sc.close();
        }
    }
}