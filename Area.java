public class Area {
    float length = 10.5f;
    float breadth = 20.5f;
    float pie=3.14f;
    float r= 4f;

    void rectangle() {
        float area = length * breadth;
        System.out.println("The area of reactangle is " + area);
    }

    void circumference(){
        float circum = 2 * (pie*r);
        System.out.println("The circumference of reactangle is " + circum);
    }

    public static void main(String[] args) {
        Area obj = new Area();
        obj.rectangle();
        obj.circumference();
    }

}
