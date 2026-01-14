package interfaces;

//if u know other languages , it is quite simple
//interfaces are types

//if u dont know that is completely fine , 
//interfaces are an abstract holder that is implemented in a class
//interfaces is somethin other classes follow structure of

//we define an interface like this
interface Student {

  // int age;
  // String name;

  // u cant do the above thing u cant just declare vars in an interface coz
  // interface dosent consume memory , it is a definition.
  // they do consume memory , but not in the heap as objects do . their metadata
  // and constantss are stored by the JVM.
  // u can decleare a variable.
  // by default vars in interfaces are final and static.
  // if something dosent consume memory in heap ,then how can it be non final and
  // non static

  int age = 22;
  String name = "Kodemaster AI";

  // methods in interfaces are by default abstracts , u cant define methods of an
  // interface.
  public void show();

  public void config();
}

// so if u want to go deep , if u want to understand where does interfaces store
// this final data.
// there are 4 memorys in java.
// 1. Heap (for objects new)
// 2. stack (for method calls , local variables)
// 3. method area / metaspace (class and interface metadata)
// 4. string constant pool (string literals)
//
// interfaces uses 3 and 4.

// for the above interface whtat the compiler silently do is:

/*
 * interface Student {
 * public static final int age = 22;
 * public static final String name = "Kodemaster AI";
 * 
 * public abstract void show();
 * 
 * public abstract void config();
 * }
 */

interface AnotherInterface {
  public void run();
}

interface X {
  void sprint();
}

// yes we can extends interfaces also just like classes
interface Y extends X {
  void walk();
}

// we can have a class that implements this interface
// so we saw in normal classes that anothere clas can extend some classes

class StudentClass implements Student, AnotherInterface, Y { // as u can show a class can also implement multiple
  // interfaces as well , just that we have to define all the
  // abstract methods the interface has
  // here u definitely have to inherit the abstract methods of the student
  // interface otherwise the class becomes by default as abstract

  public void show() {
    System.out.println("in show!1");
  }

  public void config() {
    System.out.println("in config!");
  }

  public void run() {
    System.out.println("in run!");
  }

  public void sprint() {
    System.out.println("in sprint");
  }

  public void walk() {
    System.out.println("in walk");
  }
}

public class Main {
  public static void main(String[] args) {
    Student obj; // obnject is of type Student interface
    obj = new StudentClass(); // object is of class that implements that interface , u cant define an object
                              // of an interface.

    obj.show();
    obj.config();
    // obj.run();
    // we cant do obj.run here , can u guess what is the reason ?
    // coz obj is of type Student interace , student interface dont have any idea
    // what is that run sprint walk methods

    Y obj1;
    obj1 = new StudentClass();
    obj1.walk();
    obj1.sprint();

    int age = Student.age;
    String name = Student.name;

    System.out.println("name : " + name);
    System.out.println("age : " + age);
  }
}
