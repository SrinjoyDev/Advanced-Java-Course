
//abstract keyword is a keyword that is used where we want to define it  , but dont want to use it that time.
//wghoever is making reference from the abstract have to override some things that are not implemented in the abstract
//
//an abstract class has as many normal methods and aas many asbstract metjhods
//but it iss necessary to override all the abstract methods on the child class from the abstract class

abstract class Car {
  public abstract void drive(); // so here if u see we have drive method whcih we dont want to implement . but
                                // to keep it like that we need to declare the method as abstract.
                                // then if we hgave an abstract method that should be present in an abstract
                                // class so we made the class abstract.

  public abstract int modelNo();

  public void playMusic() {
    System.out.println("playing music");
  }
}

class Wagon extends Car { // thios class extends the abastract class , this class which extends an
                          // abstract class is normally called an concrete class

  @Override // here in the class which extends the abstract class has to override the
            // asbtract method for that class
  public void drive() {
    System.out.println("driving the car ....");
  }

  public int modelNo() {
    return 2;
  }
}

public class Main {
  public static void main(String[] args) {

    // Car obj = new Car(); // u cant make an object of this abastract class , u
    // have to make a obj of class that is extended from the abvstract class.

    Wagon obj = new Wagon();
    int model_number = obj.modelNo();
    System.out.println("modl no :" + model_number);

    obj.drive();
    obj.playMusic();

  }
}
