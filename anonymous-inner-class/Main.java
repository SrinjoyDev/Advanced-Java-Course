
class A {
  public void show() {
    System.out.println("in A show!");
  }
}

class B extends A {
  public void show() {
    System.out.println("in B show!");
  }
}

class C {
  public void show() {
    System.out.println("in C show!");
  }
}

public class Main {
  public static void main(String[] args) {

    // now we are doing method overrideing here right , as we know already
    // what we are doing here , there is a A class defined which has a method show()
    // , and we have a B class that extends the A class
    // and also has a method show() that is basically overriding the class A method
    // of show().
    // so we get it that , only use of class B is to make a new method.

    // so we would do this
    A obj = new B(); // we are crating class of B but method of A.

    obj.show(); // in B show.

    // now the problem of this approach is that only use of the class B is to
    // override show() mmethod of A and thats it.
    // for that we can create an inner class
    // we can either create an inner class directly on that class.
    // but the better aproach is to create the inner class while u r declaring
    // object of that class.
    // yes that is possible

    // that inner class dosent have a name or anything , it is called anonymous
    // inner classes.
    // shown below:

    C obj1 = new C() {
      // override the show method for C class.

      // here an anonymous inner class is getting created>
      public void show() {
        System.out.println("in inner C class new!");
      }
    };

    obj1.show(); // will print the method of the inner class
  }
}
