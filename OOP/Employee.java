public class Employee {
    String name;
    int salary;

    Employee(String name, int salary){
        this.name  = name;
        this.salary = salary;
    }

    void displaydetails(){
        System.out.println("Name :"+name+" "+ "salary: "+salary);
    }
    public static void main(String args[]){
        Employee e1 = new Employee("Abhishek", 50000);
        Employee e2 = new Employee("Tudu", 60000);
        e1.displaydetails();
        e2.displaydetails();
    }
    
}
