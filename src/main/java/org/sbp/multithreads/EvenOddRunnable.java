package org.sbp.multithreads;

public class EvenOddRunnable implements Runnable {

    private String name;
    private int remainder;

    private EvenOdd evenOdd;

    public EvenOddRunnable(String name, int remainder, EvenOdd evenOdd)
    {
        this.name = name;
        this.remainder = remainder;
        this.evenOdd = evenOdd;
    }
    public void run()
    {
        Thread.currentThread().setName(name);

        if(remainder == 0)
        {
            evenOdd.printEven();
        }
        else if(remainder == 1)
        {
            evenOdd.printOdd();
        }
    }
}
