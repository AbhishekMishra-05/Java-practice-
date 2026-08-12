package Array;
import java.util.*;

public class largestsmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.print("The elements of an arry are: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int largest = arr[0];
        int smallest = arr[0];

        // largest smallest
        for (int j = 1; j < size; j++) {
            if(arr[j]> largest){
                largest = arr[j];
            }if(arr[j]< smallest){
                smallest = arr[j];
            }
        }
        System.out.println("The largest number present in an array is: "+largest);
        System.out.println("The smallest number present in an array is: "+smallest);
        sc.close();
    }
}
