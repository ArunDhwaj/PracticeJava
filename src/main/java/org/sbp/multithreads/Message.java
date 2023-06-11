package org.sbp.multithreads;

public class Message {
    private String msg;
    private boolean empty = true;

    public synchronized String read()
    {
        while (empty)
        {
            try
            {
                wait();
            }
            catch (InterruptedException e)
            {
            }
        }
        empty = true;
        notifyAll();
        return msg;
    }

    public synchronized void write(String msg)
    {
        while (!empty)
        {
            try
            {
                wait();
            }
            catch (InterruptedException e)
            {
            }
        }
        empty = false;
        notifyAll();
        this.msg = msg;
    }
}
