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
            //tell thge thread to sleep for 10ms , so that we get sequent8ial hi , hello printing.
            //Note : somewhere u will see u will get 2 hellos at the same time , or 2 hi's at the same time.
            ///that is becauase the threads are not in sequience , that is how it works . we can optimise it more , by sleeping the hread between exeuction of those in 2 milliseconds , see the main method now .
            try {
                Thread.sleep(10);
            } catch (Exception e) {
                e.printStackTrace();
            }
            
        }
    }
}

class Hello extends Thread implements ThreadImplementation {
    public void run() {
        for(int i = 0 ; i < 100 ; i ++){
            System.out.println("hello");
            try {
                Thread.sleep(10);
            } catch (Exception e) {
                e.printStackTrace();
            }
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

        //getting a priority of a thread.
        System.out.println(obj1.getPriority());
        //set priprity
        obj1.setPriority(Thread.MAX_PRIORITY); //suggesting our os scheduler that this thread should get the highest priority.
        obj2.setPriority(Thread.MIN_PRIORITY); //same but opposite analogy here.

        //NOTE: priority dosent mean that , the thread with highest priority will run first.
        //it will only prioritisise when the threads are reaching a stage where they are reachingh to a point at the same time
        //then the scheduler will decide who to give execution first based on the priority set.
        //also scheduler also decides execution based on the execution time  of the thread , lowest executing timed thread gets more priority first.

        obj1.start(); //start the thread , will execure the method
        try {
            Thread.sleep(2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        obj2.start(); //start the thread

    }
}
