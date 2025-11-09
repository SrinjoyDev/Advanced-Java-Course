

//class laods first and then ur objects gets intantiated..
//the static block always executes first in a constructor.
//in jvm , the class only loads once , then the objects of that class can be instantiated
//


class Mobile {
  String brand; //instance variable
  int price; //instance varialbel
  static String name; //static variable

  //constructor
  public Mobile() {
    brand = "";
    price = 200;
    System.out.println("in constructor");
  }

  //static block that gets called only once
  //becuase , as class loads only once , that means , the static block gets called first
  //and only once.
  static {
    name = "Phone";
    System.out.println("in static block");
  }

  public void show(){
    System.out.println(brand + ":" + price + ":" + name);
  }
}

public class staticBlock {
  public static void main(String a[]) throws ClassNotFoundException {
    Mobile obj1 = new Mobile(); //we are making an object of this class ,calls the class.
    obj1.brand = "Apple";
    obj1.price = 1500;
    obj1.name = "SmartPhone";

    //when below line gets executed calls the class , again , static block already loaded
    Mobile obj2 = new Mobile();

    //one thing here is if we dont make objects of a class , the class wont even get loaded.

    //if we want to load a class without making an object 
    //we can use the class method
    
    //we can just load the class without creating an object of the class.
    Class.forName("Mobile"); //we can just load the claass using the method,by passing the class name like that .

  }
}
