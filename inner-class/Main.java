
class Outer {
  public void show() { // non static method , means if u want to call this method u need to create an
                       // object.
    System.out.println("in show....");
  }

  // inner class inside the outer class
  class Inner { // Inner class belongs to Outer class
    public void config() {
      System.out.println("in config ...");
    }
  }

  // actually we can make a static class also .
  // can otuter class be static ? : no is the answer.
  // for accesing things of a static class u dont need to make an object of it . u
  // can straight away get it from the parent class whch the static class is a
  // part of
  static class InnerAnother {
    public void anotherConfig() {
      System.out.println("in another config");
    }
  }
}

public class Main {

  public static void main(String[] args) {

    Outer A = new Outer();
    A.show();

    // this is how u make an object of a class
    Outer.Inner B = A.new Inner();
    B.config();

    // as InnerAnother class is an inner class of the class Outer and it is statis
    // so we can do this>
    Outer.InnerAnother staticClassObject = new Outer.InnerAnother();
    staticClassObject.anotherConfig();
  }
}
