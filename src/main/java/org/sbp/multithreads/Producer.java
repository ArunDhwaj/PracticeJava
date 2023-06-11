package org.sbp.multithreads;

import java.util.Random;

import static org.sbp.multithreads.ThreadColor.ANSI_GREEN;
import static org.sbp.multithreads.ThreadColor.ANSI_RED;

public class Producer implements Runnable {

    private Message message;

    public Producer( Message message)
    {
        this.message = message;
    }
    public void run()
    {
        String messages[] = {
                "1. Orage",
                "2. Apple",
                "3. Mango",
                "4. Banana",
                "5. Litchi"
        };

        Random random = new Random();

        for(int i=0; i<messages.length; i++)
        {
            message.write(ANSI_RED + messages[i]);

            try
            {
                Thread.sleep(random.nextInt(2000));
            }
            catch (InterruptedException e)
            {

            }
        }
        message.write("Finished");
    }

}
