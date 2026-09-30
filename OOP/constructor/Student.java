package constructor;

public class Student {
    String name;
    int age;

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    void displaydetails(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String args[]){
        Student student1 = new Student("Abhishek", 22);
        Student student2 = new Student("Tudu", 23);

        student1.displaydetails();
        student2.displaydetails();
    }
}
