

class A {
  public void show() {
    System.out.println("method called");
  }

  //constructor
  public A() {
    System.out.println("in class , constructor called");
  }
}


public class AnonymousObject {
  public static void main(String a[]){
    //A obj = new A();
    //obj.show();
    
    //in above we are creating the object referenfce that is the obj and then creating the object.
    //so obj in the stack memeory references to the empty object in the heap memory.

    //to declare an AnonymousObject without declaring a referenfce for it we can simply do this:
    new A(); //problem is not usable.
    
    // if we dont want to create a reference of an object in stack and still want to call a method of the class
    // we can do it by something like this ::
    new A().show();
  }
}
