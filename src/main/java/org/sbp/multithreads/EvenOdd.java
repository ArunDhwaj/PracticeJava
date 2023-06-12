package org.sbp.multithreads;

public class EvenOdd {
    private static int MAX;
    private boolean odd = true;
    private static int counter =0;
    public EvenOdd(int max)
    {
        MAX = max;
    }

    public synchronized void printEven()
    {
        while (counter < MAX-1)
        {
            while (odd)
            {
                try
                {
                    wait();
                }
                catch (InterruptedException e)
                {
                }
            }

            counter++;
            System.out.println(Thread.currentThread().getName() + " : " + counter);
            odd = true;
            notify();
        }
    }

    public synchronized void printOdd()
    {
        while (counter < MAX-1)
        {
            while (!odd)
            {
                try
                {
                    wait();
                }
                catch (InterruptedException e)
                {
                }
            }

            try {

                Thread.sleep(2000);
                counter++;
                System.out.println(Thread.currentThread().getName() + " : " + counter);
                odd = false;
                notify();
            }
            catch (InterruptedException e)
            {

            }
        }
    }
}
