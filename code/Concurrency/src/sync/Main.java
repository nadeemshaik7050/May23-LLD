package sync;

import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;

public class Main {

    public static void main(String[] args) throws Exception {
        Counter counter = new Counter();
        Adder adder = new Adder(counter);
        Subtractor subtractor = new Subtractor(counter);

        Thread t1 = new Thread(adder);
        Thread t2 = new Thread(subtractor);

        // Creating the threads.
        t1.start();
        t2.start();

        // Wait for both the threads to complete.
        t1.join();
        t2.join();

        System.out.println("The count value is: " + counter.getCount());

    }

}
