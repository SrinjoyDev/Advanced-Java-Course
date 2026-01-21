package runnableVsThreads;

class A {

}

// class B extends A implements Runnable { //this Runnable means this class is a thread as well.
//     public void run() {
//         for(int i = 0 ; i <= 5 ; i ++){
//             System.out.println("hi");
//             //tell thge thread to sleep for 10ms , so that we get sequent8ial hi , hello printing.
//             //Note : somewhere u will see u will get 2 hellos at the same time , or 2 hi's at the same time.
//             ///that is becauase the threads are not in sequience , that is how it works . we can optimise it more , by sleeping the hread between exeuction of those in 2 milliseconds , see the main method now .
//             try {
//                 Thread.sleep(10);
//             } catch (Exception e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }

// class C implements Runnable {
//     public void run() {
//         for(int i = 0 ; i <= 5 ; i ++){
//             System.out.println("hello");
//             try {
//                 Thread.sleep(10);
//             } catch (Exception e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // B obj1 = new B();
        // C obj2 = new C();

        // //if we use a runnable method , that will not have a start method , under the hood
        // //it is a thread only , but u cant cal the start method . 
        // //for that u need to declare a thread , and pass a runnable object in that thread and then use it.
        // //to run that thread.

        // Thread t1 = new Thread(obj1);
        // Thread t2 = new Thread(obj2);

        // t1.start();
        // t2.start();


        //THGE COMMENTED OUT CODE IS IMPLEMENTATION OF THREADS , BUT WE WILL
        //IMPLEMENT LAMBDA EXPRESSIONS NOW , TO REDUCE THE NUMBER OF LINES OF CODE.
        //TO LOOK LIKE A PRO , AND SHOW OFF TO OTHER DEVSS.

        //Runnable is also a class right , and we saw , The thread class has a constructor that accepts a object of a ruunnable class
        //to run the thread.

        //if u see Runnable is a functinal interface.
        //so we can do our lamba stuff here..

        // Runnable obj1 = new Runnable() {
        //     public void run() {
        //         for(int i = 0 ; i <= 5 ; i ++) {
        //             System.out.println("hi");
        //         }
        //     }
        // };


        //instead of the above thing , lets use runnable instead of anon inner classes.
        Runnable obj1 = ()  -> {
            for(int i = 0 ; i <= 5 ; i ++){
                System.out.println("hi from kodemaster AI");
                try {
                    Thread.sleep(10);    
                } catch (Exception e) {
                    e.printStackTrace();
                }
                
            }
        };

        Runnable obj2 = () -> {
            for(int i = 0  ; i <= 5 ; i ++){
                System.out.println("hello from Kodemaster AI");
                try {
                    Thread.sleep(10);    
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        
        t1.start();
        // Thread.sleep(2);
        t2.start();
    }
}