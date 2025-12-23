
class Outer {
  public void show() {
    System.out.println("in show....");
  }

  // inner class inside the outer class
  class Inner {
    public void config() {
      System.out.println("in config ...");
    }
  }
}

public class Main {

  public static void main(String[] args) {

    Outer A = new Outer();
    A.show();

    // this is how u capture inner class.
    Outer.Inner B = A.new Inner();
    B.config();

  }
}
