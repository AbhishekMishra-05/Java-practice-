import java.util.Scanner;
public class NumberCheck {
    public static void main(String[]args){
        float num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        try{
            num= sc.nextFloat();
            if(num == 0){
                System.out.println("The number is zero");
            }else if(num > 0){
                System.out.println("The number is positive");
            }else if(num < 0){
                System.out.println("The number is negative");
            }
            } catch (Exception e){
            System.out.println("Please enter a valid number");
        }finally{
            sc.close();

        }

    }
}
