import java.util.*;

public class EvenOdd {
public static void main (String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter  your number: ");
    try {
    int num = sc.nextInt();
    if (num < 0){
        System.out.println("Please enter a positive number");
    } else if (num %2 ==0){
        System.out.println("The number is even: "+num);
    }else {
        System.out.println("The number is odd: "+num);
    }
    }catch (Exception e){
        System.out.println("Please enter a valid number");
    } finally{
        sc.close();
    }
}
}