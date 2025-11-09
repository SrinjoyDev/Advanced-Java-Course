

class Mobile {
  String brand; //instance variable
  int price; //instance varialbel
  static String name; //static variable

  public void show(){
    System.out.println(brand + ":" + price + ":" + name);
  }
}

public class StaticBlock() {
  public static void main(String[] a[]) {
    Mobile obj1 = new Mobile();
    obj1.brand = "Apple";
    ob1.price = 1500;
    obj1.name = "SmartPhone";

  }
}
