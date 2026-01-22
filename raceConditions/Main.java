package raceConditions;

//threads are good for making the performation of ur sysstem fast.
//but with that also comes some challenges we must tackle.

// as we know strings are immutable  why ? we can get into that low level reason later.
//so we can say a same string variable canty be changed across 2 threads.
//thats y string is thread safe ./ 
//whereas styring builder is not , as string builder is not theread safe and is mutable.
//lets say there is one value , and botht the thread
//if both threads keep updating the same value
//then that creates inconsistencies in ur application right .??

//thread safe means - > only one thread can work with that at one point not more than one at the same point of time.


class Counter {
    int count;
    public synchronized void increment() { //we make this method synchronizedd that means , that we tell the other thread when a thread is already holding the value.
        count++;
    }
}


//some theory for threads states.

//States in Threads.

//new , Runnable , Running . waiting , Dead.

//New -> when a thread is created 
// Thread t1 = new Thread();

//Runnable . > when we start the thread
// t1.start();

//Runniung -> when the thread is actuall getting ran and executed in the cpu that is the runnable state.
//otherwise when the thread is ready to run and waited by the scheduler to run that is the runnable state.

//sleep method -> waiting state for thread (sleep(() , wait()))

//stop method -> thread is dead.
//NOTE: dont use stop method in threads it createss instabilkity in ur applications.

//from waititig to RUnnabvle , u will have to use a notify method to comeback to the runnable state.


public class Main {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
        Runnable obj1 = () -> {
            for(int i =  1 ; i <= 100000 ; i ++){
                c.increment();
            }
        };

        Runnable obj2 = () -> {
            for(int i =  1 ; i <= 100000 ; i ++){
                c.increment();
            }
        };

        Thread t1 = new Thread(obj1); //call increment 1000 times.
        Thread t2 = new Thread(obj2); //call increment 1000 times.

        t1.start();
        t2.start();

        // System.out.println(c.count); //this will give different outputs now , as main method is
        // //in its own thread , the threads t1  and t2 are doing their job.

        //for that we tell the main thread to wait for the t1 and t2 thread.
        //we can use the thread join method.
        //that is telling the main thread , hold on and let thge 2 threads complete their stuff
        //and join at last.

        t1.join();
        t2.join();

        //and then print the count
        System.out.println(c.count); //it should print 2000.
        //but sometimes u will notice that it is not doing that , sometime another number is getting printed.
    
        ///ANALOGY:
        /// 
        //we get 2000 only if the threads are not going to tthe 2000 at the same time .

        //if they go at the count value at the same time , then we know that both threads
        //weill get the same value of count and do an increment that makes a double iteration
        //and that both threads does the same work . 
        //so if we get different valuies sometime , then that meanms sometimes the thread reache dthe count value
        //at the same time.
    

        //what needs to happen is ,
        //so this is a race condition happening here.
        //what we want is that when t1 is working with count then t2 has to wait . 
        //and vice versa.
        //for that we use the synchronized method in methods tat are shareed by threads and variables that are shared by thjreads.
    
    }
}
