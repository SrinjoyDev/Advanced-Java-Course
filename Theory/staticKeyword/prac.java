package Theory.staticKeyword;

public class prac {
    public static void main(String[] args) {
        Mobile o1 = new Mobile();
        // o1.brand = "Apple"; we avoid calling likke this , best practice is to call the static instance variable with the class name
        Mobile.brand = "Apple"; //if we do like this , we dont have to make the name again as it iss a static instance variable of the class Mobile.
        //so there is a diff area in the jvm , where we place all the static vars
        //so this way we are saving memory as well , as all objects will not have their own instance variables . we can share the instance variables between the opbjects of a class , as the static variables belong to the class not the object.
        o1.price = 1400;
        o1.name = "11 Pro Max";

        Mobile o2 = new Mobile();
        // o2.brand = "Fake Apple";
        o2.price = 720;
        o2.name = "17 Pro Max";

        o1.show();
        o2.show();
    }
}

class Mobile {
    //instance variable
    String name;
    int price;
    String network;
    static String brand; //if we are making an instance variable static that means any object created for that claass needs to have the same brand.
    //so then if we try to make the name of a object we make , it will make all the other objects.

    //this is a method of a class
    //if we create a variable inside a method then that is a local variable
    public void show() {
        System.out.println(brand + " " + name + " " + price);
    }

    public static void show1() {
        System.out.println("calling the static method" + brand);
    }
}
