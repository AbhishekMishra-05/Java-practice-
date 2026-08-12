public class Temperature {
    float cel = 0;
    float f = 32;

    void celsiusToFarenhiet() {
        f = (cel * 9 / 5) + 32;
        System.out.println("Temperature in Farenhiet is: " + f);
    }

    void farenhietToCelsius(){
        cel = (f -32)*5/9;
        System.out.println("Temperature in Celsius is: " + cel);
    }
public static void main(String[] args) {
        Temperature obj = new Temperature();
        obj.celsiusToFarenhiet();
        obj.farenhietToCelsius();
    }
}
