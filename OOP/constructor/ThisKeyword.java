package constructor;

public class ThisKeyword {
    String brand;
    String modal;
    double price;

    ThisKeyword(String brand, String modal,double price){
        this.brand = brand;
        this.modal= modal;
        this.price = price;
    }
    void display(){
        System.out.print("Brand:"+brand+ " "+"modal:"+modal+ " " + "price:"+price+"\n");
    }

    public static void main(String args[]){
        ThisKeyword key1 = new ThisKeyword("BMW","M5",500000);
        ThisKeyword key2 = new ThisKeyword("mercedes","c200",600000);
        key1.display();
        key2.display();
    }
}
