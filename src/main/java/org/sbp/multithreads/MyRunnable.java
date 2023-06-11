package org.sbp.multithreads;

import static org.sbp.multithreads.ThreadColor.*;

public class MyRunnable implements Runnable{

    private Thread anyOtherThread;

    @Override
    public void run(){
        System.out.println(ANSI_PURPLE + "MyRunnable: Hello ");

        try
        {
            anyOtherThread.join(3000);
//            anyOtherThread.join();
            System.out.println(ANSI_PURPLE + "MyRunnable: Another thread terminated or timed out. So, I'm running again");
        }
        catch (InterruptedException e)
        {
            System.out.println(ANSI_PURPLE + "MyRunnable: I was interrupted");
        }
        System.out.println(ANSI_PURPLE + "MyRunnable: Hello again");
    }

    public void setAnyOtherThread(Thread t)
    {
        this.anyOtherThread = t;
    }
}
