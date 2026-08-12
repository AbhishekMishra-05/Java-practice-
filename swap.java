public class swap {
    public static void main (String[]args){
        int x=10;
        int y=5;
        System.out.println("Before swapping the numbers are: x = " + x + " and " + "y = " + y);
        // using third variable
         int z = x;
         x=y;
         y=z;
         System.out.println("After swapping the numbers are: x = "+ x + " and "  + "y  = " +y);

        //  using bitwise operator
         x= x^y;
         y=x^y;
         x=x^y;
         System.out.println("After swapping the numbers are: x = "+ x + " and " + "y  = " +y);
    }
}
