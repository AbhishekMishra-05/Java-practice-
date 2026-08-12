import java.util.*;;
public class RandomNum {
    public static void main(String[] args) {
        Random ran = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to guess: ");

        try {
            int num1 = sc.nextInt();
            int num2 = ran.nextInt(100) + 1;
            if(num1 < 0 || num1 > 100){
                System.out.println("enter valid number");
                return;
            }
            while (num1 != num2) {
                if (num1 > num2) {
                    System.out.println("Too High. ");
                } else {
                    System.out.println("Too Low ");
                }
                System.out.println("Enter the another number to guess: ");
                num1 = sc.nextInt();
            }
            System.out.println("congratulations");
        } catch (InputMismatchException e) {
            System.out.println("Please enter valid number.");
        } finally {
            sc.close();
        }
    }
}
