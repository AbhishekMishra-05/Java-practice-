public class averageofnumbers {

    int a = 10;
    int b = 20;
    int c = 30;
    int principle = 1000;
    int rate = 5;
    int time = 2;

    void average() {
        int avg = (a + b + c) / 3;
        System.out.println("The average of the numbers is: " + avg);
    }

    void simpleinterest() {
        int si = (principle * rate * time) / 100;
        System.out.println("The simple intereset of the number is : " + si);
    }

    public static void main(String[] args) {
        averageofnumbers obj = new averageofnumbers();
        obj.average();
        obj.simpleinterest();

    }
}