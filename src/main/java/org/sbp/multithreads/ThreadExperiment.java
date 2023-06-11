package org.sbp.multithreads;

import static org.sbp.multithreads.ThreadColor.*;

public class ThreadExperiment {

    public void experiment() {

        System.out.println("Hello from main thread");

        Thread anotherThread = new AnotherThread();
        anotherThread.start();

        new Thread() {
            public void run() {
                System.out.println(ANSI_BLUE + "From anonymous thread");
            }
        }.start();

        MyRunnable myRunnable = new MyRunnable();
        myRunnable.setAnyOtherThread(anotherThread);

        Thread myRunnableT = new Thread( myRunnable );
        myRunnableT.start();

        anotherThread.interrupt();

        System.out.println(ANSI_PURPLE + "Hello again from main thread");

    }
}
