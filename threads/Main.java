package threads;

@FunctionalInterface
interface ThreadImplementation {
    void run();
}

//make both of the classes as threads by extending this class from the Thread class.

class Hi extends Thread implements ThreadImplementation {
    public void run() { //classses that extends a thread , should have a run method that runs when a thread is started
        for(int i = 0 ; i < 100 ; i ++){
            System.out.println("hi");
        }
    }
}

class Hello extends Thread implements ThreadImplementation {
    public void run() {
        for(int i = 0 ; i < 100 ; i ++){
            System.out.println("hello");
        }
    }
}

public class Main {
    public static void main(String[] args) {

        // ThreadImplementation hi = () -> {
        //     for(int i = 0 ; i < 10 ; i++) {System.out.println("hi");};
        // };

        // ThreadImplementation hello = () -> {
        //      for(int i = 0 ; i < 10 ; i++) {System.out.println("hrello");};
        // };

        // //we are doing two high computational tasks one by one , which are not dependednt on each other . it is time taking .
        // hi.print(); //1.
        // hello.print(); //2.

        Hi obj1 = new Hi();
        Hello obj2 = new Hello();

        obj1.start(); //start the thread , will execure the method
        obj2.start(); //start the thread

    }
}
