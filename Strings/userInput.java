package Strings;
import java.util.*;

public class userInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String word = sc.next();
        System.out.println("The entered string is: "+ word);


        System.out.println("The character present in string is: ");
        for(int i = 0; i < word.length(); i++){
            System.out.println(word.charAt(i)+" ");
        }
        sc.close();
    }
}
