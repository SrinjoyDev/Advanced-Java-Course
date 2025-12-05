
//another thing to keep in mind , every class in java extends the object class.
// class A is nothhing but , class A extends object
//
class Another extends Object {
  public Another() {
    System.out.println("inside another classs!!");
  }
}

class A {

  // normal constructor
  //
  public A() {
    System.out.println("in a");
  }

  // parameterised constructor
  public A(int n) {
    System.out.println("in a int");
  }
}

class B extends A {

  // parameterised constructor
  public B(int n) {
    // super(n); // calls the param constructor of the parent class whichi is class
    this(); // this method is used to call the constructor of the same class.
            // so when clasnName objName = new ObjectName(param) is called . we aare calling
            // this parameterised constructor here.
            // then we are doing this , so that prints nothing but , in a , int b , in b
    System.out.println("in b int");
  }

  // normal constructor
  public B() {
    // every constructor has super even if it isnot there.
    // super(); // super simnply means calls the constructor of the super class. in
    // this case it
    // is class A.
    // no parameters there in the super that means we are calling the default one.

    // if we want to call the parameterised constructor of the class A.
    // then we can do something like this that is passing the parameters in the
    // super method
    // that meanms calls the param constructor of the parent class.
    // here we cannot do , as we are making anb object of the b class in the main
    // method below.
    // we have to do the super(n) in the param constructor of the b class.
    System.out.println("in b");
  }
}

public class Main {

  public static void main(String[] args) {

    B obj = new B(5); // will call the constructor of the sub class and the super class both
    // coz b is the subclass of a.
    //
    // but it will call only the param constructor of b not a.
    //
    // so we should get it easily that if we are making a constructor without the
    // parameters mentioned in it , we are calling
    // the defeault constructor of the class B that has a super() that will call the
    // default constructor of the parent calss of it .
    // if there are no parent class it will call none , if it is there it will call
    // .,in this case it is class A.
  }

}
