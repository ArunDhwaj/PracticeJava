package org.sbp.multithreads;

public class EvenOddExperiment {

    public void experiment() {

        EvenOdd evenOdd = new EvenOdd(20);

        Thread t1 = new Thread(new EvenOddRunnable("Even", 0, evenOdd));
        Thread t2 = new Thread(new EvenOddRunnable("Odd", 1, evenOdd));

        t2.start();
        t1.start();

        try {

            t1.join();

            t2.join();
        }
        catch (InterruptedException e)
        {
        }
    }
}
