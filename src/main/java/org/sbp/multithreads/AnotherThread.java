package org.sbp.multithreads;

import java.sql.SQLOutput;

import static org.sbp.multithreads.ThreadColor.ANSI_RED;

public class AnotherThread extends Thread{

    @Override
    public void run() {
        System.out.println( ANSI_RED + "AnotherThread: Hello");

        try
        {
            Thread.sleep(8000);
        }
        catch (InterruptedException e)
        {
            System.out.println( ANSI_RED + "AnotherThread: Other thread has woke me up");
//            return;
        }

        System.out.println( ANSI_RED + "AnotherThread: 8 seconds has passed and I'm awake");
    }
}
