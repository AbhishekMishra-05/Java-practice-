package Strings;
import java.util.Scanner;

public class reverseTraverse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String word = sc.next();
        System.out.println("The entered string is: "+ word);

        for(int i = word.length()-1; i >= 0; i--){
            System.out.print(word.charAt(i));
        }
        sc.close();
    }
}
