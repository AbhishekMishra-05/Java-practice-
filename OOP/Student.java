class Student{

    String name;
    int age;
    String course;

    void displaydetails(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }
    

    public static void main(String args[]){

        Student student1 = new Student();
        student1. name = "Abhishek";
        student1.age = 22;
        student1.course = "java";

        Student student2 = new Student();
        student2.name = "Tudu";
        student2.age = 23;
        student2.course = "springboot";

        student1.displaydetails();
        student2.displaydetails();
    }
}