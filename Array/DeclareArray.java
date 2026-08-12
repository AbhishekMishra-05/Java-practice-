package Array;

class DeclareArray {
    public static void main(String[] args) {
        int[] NumArray = { 10, 20, 30, 40, 50 };

        System.out.print("The original Array: ");
        for (int i = 0; i < NumArray.length; i++) {
            System.out.print(NumArray[i] + " ");
        }
        System.out.println();
        System.out.println("the element at index 2 is: " + NumArray[2]);

        NumArray[3] = 100;
        System.out.print("The updated Array is: ");
        for (int i = 0; i < NumArray.length; i++) {
            System.out.print(NumArray[i] + " ");
        }
        System.out.println();
        System.out.println("The length of the array is: " + NumArray.length);
    }

}
