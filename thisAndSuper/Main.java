class A {

  public A() {
    System.out.println("in a");
  }

  public A(int n) {
    System.out.println("in a int");
  }
}

class B extends A {

  public B(int n) {
    System.out.println("in b int");
  }

  public B() {
    System.out.println("in b");
  }
}

public class Main {

  public static void main(String[] args) {

    B obj = new B();
  }

}
