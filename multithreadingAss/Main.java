package multithreadingAss;

class PrinterTask implements Runnable {
    public void run() {
        String threadName = Thread.currentThread().getName();
        for(int i = 1 ; i <= 5 ; i ++){
            System.out.println( threadName + " Running task" +  i);
        }
    }
}

public class Main {
    public static void main(String[] args)  {
        PrinterTask pt = new PrinterTask();

        Thread worker1 = new Thread(pt , "worker-1");
        Thread worker2 = new Thread(pt , "worker-2");

        worker1.start();
        worker2.start();

        try {
            worker1.join();
            worker2.join();    
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
