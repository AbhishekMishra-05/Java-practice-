package constructor;

public class Teacher {
    String name;
    int age;

    Teacher() {
        this("Unknown", 0);

    }

    Teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displaydetails() {
        System.out.println("Name :" + name + " " + "Age: " + age);
    }

    public static void main(String agrs[]) {
        Teacher t1 = new Teacher();
        Teacher t2 = new Teacher("Abhishek", 22);
        t1.displaydetails();
        t2.displaydetails();
      
    }
}
