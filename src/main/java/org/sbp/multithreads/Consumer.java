package org.sbp.multithreads;

import java.util.Random;

import static org.sbp.multithreads.ThreadColor.*;

public class Consumer implements Runnable{
    private Message message;

    public Consumer(Message message) {
        this.message = message;
    }

    public void run()
    {
        Random random = new Random();

        for(String latestMessage= message.read(); !latestMessage.equals("Finished"); latestMessage=message.read())
        {
            System.out.println(ANSI_BLUE + latestMessage);

            try
            {
                Thread.sleep(random.nextInt(2000));
            }
            catch (InterruptedException e)
            {
            }
        }
    }
}
