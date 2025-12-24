
enum Status {
  Running, Pending, Success, Failed;
}

public class Main {
  public static void main(String[] args) {
    Status s = Status.Pending;

    // use of enum in swith case
    switch (s) {
      case Running:
        System.out.println("running almost done");
        break;
      case Pending:
        System.out.println("please wait request in queue");
        break;
      case Success:
        System.out.println("all good");
      default:
        System.out.println("gg u r cooked");
    }

    // use of enum in if statement
    if (s == Status.Pending) {
      System.out.println("please wait!");
    } else if (s == Status.Running) {
      System.out.println("almost done");
    } else if (s == Status.Success) {
      System.out.println("All done");
    }
    System.out.println("gg u r cooked!");
  }
}
