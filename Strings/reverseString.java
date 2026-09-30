package Strings;

import java.util.*;

public class reverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String word = sc.nextLine();

        System.out.println("The entered string is: " + word);

        char[] reverse = new char[word.length()];

        for (int i = word.length() - 1; i >= 0; i--) {

            for (int j = i; j < reverse.length; j++) {
                reverse[j] = word.charAt(i);
            }
        }
        sc.close();
    }
}
