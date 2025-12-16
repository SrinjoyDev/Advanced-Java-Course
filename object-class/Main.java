

//as well all know every class in java extends the object class
class Laptop extends Object {
    public String model;
    public int price;

    public void showLaptop(String model , int price) {
        System.out.printf("model : " , model ,  "price : " , price);
    }
}

public class Main {
    public static void main(String[] args) {
        Laptop obj = new Laptop();
        Laptop obj1 = new Laptop();
        Boolean equals = obj.equals(obj1);
        System.out.println(equals); //this will print false
        //coz object has a uner th hood .toString() method that gives hashbode , 
        //if the hashcode are same then both the objects are same else not .
        //they are looking the same object but their hashes are different.
        //that is why both are different object.
    }
}