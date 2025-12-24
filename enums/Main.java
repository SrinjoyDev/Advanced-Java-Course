//enums -> enumeration
//enums are named constants that we should create.
//let say if u see http status codes like 200 , 404 , 500 ...etc
//they are enums
//and if there are multiple constants u want to use over ur applicaiton
//so instead of crating an object by yourself u can create an enum that is muchh more cleaner method of writting code.

//instead of String status message we can simply return this enums.
enum Status {
  Running, Pending, Success; // named constants
}

// if u r guessing it right Status is a class here,, and Runing , Pending ,
// Success
// are all objects of it .

public class Main {
  public static void main(String[] args) {

    int i = 5;
    Status s = Status.Running;
    System.out.println(s); // running

    System.out.println(s.ordinal()); // u will get the index of the named constant here
                                     //

    Status[] statuses = Status.values(); // will give u all the status that are there.

    for (Status stat : statuses) {
      System.out.println(stat);
    }
  }
}
