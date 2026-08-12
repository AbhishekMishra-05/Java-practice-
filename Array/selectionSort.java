package Array;
import java.util.*;
class selectionSort {

    void selection(int[] arr) {

        System.out.print("sorted array: ");
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[index]) {
                    index=j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        for (int k=0; k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int num = sc.nextInt();

        int[] arr = new int[num];

        System.out.print("Enter elements to insert inside an array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("The elements present in an array are: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println();

        selectionSort sort = new selectionSort();
        sort.selection(arr);
        sc.close();
    }
}