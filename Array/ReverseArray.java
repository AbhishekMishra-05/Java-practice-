package Array;
import java.util.*;

public class ReverseArray {

    void reverse(int[] arr, int size) {

        int start = 0;
        int end = size - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the capacity of an array:");
        int capacity = sc.nextInt();

        if (capacity <= 0) {
            System.out.println("Invalid capacity");
            sc.close();
            return;
        }
        int[] arr = new int[capacity];

        System.out.print("Enter the  size of an array: ");
        int size = sc.nextInt();

        if (size <= 0 || size > capacity) {
            System.out.println("Invalid size");
            sc.close();
            return;
        }
        System.out.print("Enter the elements of an array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Original array: ");
        for (int j = 0; j < size; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println();

        ReverseArray RA = new ReverseArray();
        RA.reverse(arr, size);

        System.out.println("Reversed array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();

    }
}
