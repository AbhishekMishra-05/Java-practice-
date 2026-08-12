package Array;
import java.util.*;

public class linearsearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter elements to insert in an array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("The elements present in an array are: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println();
        System.out.print("Enter element to search: ");
        int target = sc.nextInt();

        boolean found = false;
        for (int k = 0; k < arr.length; k++) {
            if (arr[k] == target) {
                System.out.println("Target found at index: " + k);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Element no found ");
        }
        sc.close();
    }
}
