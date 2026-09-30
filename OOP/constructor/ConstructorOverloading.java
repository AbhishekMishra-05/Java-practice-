package constructor;

public class ConstructorOverloading {
    String name;
    int age;

     ConstructorOverloading (){
        
    }

    ConstructorOverloading (String name){
        this.name = name;
    }

    ConstructorOverloading (String name, int age){
        this.name = name ;
        this.age = age;
    }

    void displaydetails(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main (String args[]){
        ConstructorOverloading student1 = new ConstructorOverloading();
        ConstructorOverloading student2 = new ConstructorOverloading("Abhishek");
        ConstructorOverloading student3 = new ConstructorOverloading("Tudu", 23);

        student1.displaydetails();
        student2.displaydetails();
        student3.displaydetails();
    }
    
}
