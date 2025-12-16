package ass1;

class Employee {
    private String name;
    private double salary;
    
    //constructor to intialise the fields
    public Employee(String name , double salary){
        this.name = name;
        this.salary = salary;
    }
    
    //getter methods
    public String getName(){
        return name;
    }
    
    public double getSalary(){
        return salary;
    }
    
    public String getDetails(){
        return "Name: " + name + ", Salary: " + salary;
    }
}





// - Extends Employee

class Manager extends Employee {
    private String department;
    
    //super to call the parent constructor
    public Manager(String name , double salary , String department){
        super(name,salary); //calls the parent constructor
        this.department = department;
    }
    
    @Override
    public String getDetails() {
         return "Name: " + getName() +
               ", Salary: " + getSalary() +
               ", Department: " + department;
    }
}


public class Main {
    public static void main(String[] args) {

        Employee emp = new Employee("Alice" , 50000.0);
        Employee man = new Manager("Bob" , 80000.0,"IT");
    
        System.out.println(emp.getDetails());
        System.out.println(man.getDetails());
    }
}
