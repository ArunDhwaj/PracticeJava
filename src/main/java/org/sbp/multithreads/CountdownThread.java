package org.sbp.multithreads;

public class CountdownThread extends Thread{
    private CountDown threadCountdown;

    public CountdownThread(CountDown countDown)
    {
        this.threadCountdown = countDown;
    }

    public void run()
    {
        threadCountdown.doCountdown();
    }
}
