package Array;
import java.util.*;

public class binarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int num = sc.nextInt();

        int[] arr = new int[num];

        System.out.print("Enter the sorted elements of an array: ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("The elements present in an array are: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println();

        int left = 0;
        int right = arr.length - 1;
        System.out.println("Enter the target element: ");
        int target = sc.nextInt();

        if(num ==0){
            System.out.print("Array is empty");
        }
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (target == arr[mid]) {
                System.out.print("Element found at index: " + mid);
            } else if (target < arr[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        System.out.println("Element not found in array");
        sc.close();
        
    }
}
