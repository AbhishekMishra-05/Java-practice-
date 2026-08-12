import java.util.*;
public class Voting {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        try{
            int age = sc.nextInt();
            if(age < 0){
                System.out.println("Age cannot be negative");
            }
            else if (age < 18){
                System.out.println("you are not eligible to vote");
            } else {
                System.out.println("you are eligible to vote");
            }
            } catch(InputMismatchException e){
                System.out.println("Please enter a valid age");
            }finally{
                sc.close();
            }
        }
    }
