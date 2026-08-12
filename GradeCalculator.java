import java.util.Scanner;

public class GradeCalculator {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks: ");
        try{
            int marks = sc.nextInt();
            if (marks < 0 || marks > 100){
                System.out.println("Enter the valid marks betwn 0 and 100");
            }else if(marks >=90){
                    System.out.println("Your grade is O");
                }else if(marks >=80 && marks < 90){
                    System.out.println("Your grade is E");
                }else if(marks >=70 && marks < 80){
                    System.out.println("Your grade is A");
                }else if (marks >=60 && marks < 70){
                    System.out.println("Your grade is B");
                }else if (marks >=50 && marks < 60){
                    System.out.println("Your grade is C");
                }else if (marks >=40 && marks < 50){
                    System.out.println("Your grade is D");
                }else{
                System.out.println("Your grade is F");
            }
            }catch (Exception e){
            System.out.println("Please enter a valid marks");
        }finally{
            sc.close();
        }
    }

}
