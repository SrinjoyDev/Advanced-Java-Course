
//final is like const in js , or const in c++.
//that is once u declare u cant reuse/inherit from it.

public class Main {

}

final class Calc {
  public int add(int n1, int n2) {
    return n1 + n2;
  }

  public int sub(int n1, int n2) {
    return n1 - n2;
  }
}

// u cannot do the below line it will throw error as it cant be a subclass of
// something constant
// that is what final keyword lets us do

// class AdvCalc extends Calc {

// }
