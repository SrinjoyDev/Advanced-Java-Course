
//we have seen abstract classes
//we have seen inner classes
//we have seen anonyumous inner classes
//

//lets go back to abstract classes for a bit .
//we know that we cant make objects from an abstract class righht
//so we create a class that extends the abstract class and defines the abstract methods defined in that abstract class and all that.

//so only point of making another class and extending the abstract class is to define the abstract objects so that we can make an object out of it right.
//why to do that
//if u can guess
//wee can make an inner class there.

abstract class Plane {
  abstract public void fly();
}

class FighterPlane extends Plane { // only use of this class is to define the asbtract method so that is usable
  public void fly() {
    System.out.println("figher plane is flying!!");
  }
}

public class Main {
  public static void main(String[] args) {

    // Plane obj = new Plane(); //cant do that coz its an abstract class as we all
    // know

    // what we can do instead is something like this >
    //

    // define the object for that class , and then init an inner class for it to
    // deinf ethe abstract method for it.
    Plane obj = new Plane() {
      // anon inner class
      public void fly() {
        System.out.println("in new flying");
      }
    };

    obj.fly();

  }
}
