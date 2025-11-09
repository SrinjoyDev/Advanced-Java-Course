import java.util.*;

class Mobile {
  String brand;
  int price;
  static String name;

  public void show() {
    System.out.println(brand + ":" + price + ":" + name);
  }

  public static void show1(Mobile obj) {
    System.out.println("calling the static method here::::;;;;;");
    //System.out.println(brand + ":" + price + ":" + name);
    //the above line will throw error , becuase we can use a static variable inside a static method , but cant use a non static variable inside a static method ,for to use non static variables we have to create our own varabiles inside the static method here.

    //The reason is when we call Mobile.show2() then we dont know which object it is refering to for that class , thats why it will throw the error .
    //The approach is we can pass the object which we want to refer and tell that i want to use the stattic method for that object.

    System.out.println(obj.brand + ":" + obj.price + ":" + name);
    //above line will not throw erros because we are referencing that object.

  }
}

public class staticMethod{
  //why main method is static ???
  //if we dont make main static then that means main becomes a nonsttic method
  //then so if it is non static then we have to create a object of the class staticMethod , and then call the main mehod.
  // but without creating a object of class staticMethod how can we do that . 
  // so that is a deadlock there , so we directly use static in main methods.

  public static void main(String a[]){
    Mobile obj1 = new Mobile();
    obj1.brand = "Apple";
    obj1.price = 1500;
    Mobile.name = "SmartPhone";

    Mobile obj2 = new Mobile();
    obj2.brand = "Samsung";
    obj2.price = 1000;
    //for this also name will be still 'SmartPhone' as SmartPhone is a static variable here so for all instances of the object it will be the same.

    //Mobile.show(); cant do this here ,as that method is not a stattic method
    
    Mobile.show1(obj1); //we can do this by calling the static method with the help of a class . 
  }
}
