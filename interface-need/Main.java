
/*
class Computer {
  public void writeCode() {

  }
}
*/

//we can either make a compuer class , as it is not doing anyuthing we can make it abstract .
//but based on what we learned we can just simply use an interface here which will be more efficient here
//coz interface will not take up any memory on the heap

interface Computer {
  void writeCode();
}

class Laptop implements Computer {
  public void writeCode() {
    System.out.println("code -> compile -> run : in laptop");
  }
}

class Desktop implements Computer {
  public void writeCode() {
    System.out.println("code -> compile -> run : in dektop");
  }
}

/*
 * class Developer {
 * public void devApp(Laptop lap) {
 * lap.writeCode();
 * }
 * }
 */

class Developer {
  public void devApp(Computer pc) {
    pc.writeCode();
  }
}

public class Main {
  public static void main(String[] args) {
    Laptop lap = new Laptop();
    Desktop pc = new Desktop();
    Developer kodey = new Developer();
    kodey.devApp(lap); // we can do this , if u see the devApp method of the class Developer accepts
                       // Laptop class object.
                       // but we cant pass the object of Desktop
                       // but the analogy we are trying to build here is that the develpper should be
                       // able to writeCode
                       // code with both laptop and desktop both right ?
                       //

    // write now we are making the developer class dependent on lapto0p
    // but that nots the analogy right , the developer should be dependent on a
    // computer.

    // but what we can do is , we canm create a class as computer as u can see
    // and that other classes the Laptop and the computer class cna extend the
    // parent class computer
    // that means the developer is now dependent on a compiuter
    // it can be a latop and it can be aa desktop as well

    // what we can do then is .

    Computer laptop = new Laptop(); // Computer reference but lapto0p class
    Computer desktop = new Desktop(); // computer reference but dekstop class

    Developer dev = new Developer();
    // now if u see we can use both things lapto0p and dektop as well as we are
    // accepting computer as the accepted object.
    dev.devApp(desktop);
    dev.devApp(laptop);

    // this is how we whould design our applicaitons where it should be loosely
    // coupled
    // so that arguments are nicely acceptable and loosely coupled and not very
    // tightly coupled.
  }
}
