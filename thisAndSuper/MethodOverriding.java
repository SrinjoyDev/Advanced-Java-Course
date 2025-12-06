
class A {
  public void show() {
    System.out.println("in A show");
  }

  public void config() {
    System.out.println("in config");
  }
}

class B extends A {
  @Override
  public void show() {
    System.out.println("in b show!");
  }
}

public class MethodOverriding {
  public static void main(String[] args) {
    B obj = new B();
    obj.show(); // will call the method in class a , as we know.
    obj.config();

    // so now the issue is that we want the config of a to be used from class A.
    // but i dont want to use the show method of A. i want to use the show method of
    // b.
    //
    // so what we do is if u ssee in class B which extends A we can override the
    // mthjod of the parent
    // if we have the method of same name in class B also that is present in class a
    // , we are overriding it .
  }
}
