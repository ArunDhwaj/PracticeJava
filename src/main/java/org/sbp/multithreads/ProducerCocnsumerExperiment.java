package org.sbp.multithreads;

public class ProducerCocnsumerExperiment {

    public void experiment()
    {
        Message message = new Message();

        ( new Thread(new Producer(message))).start();
        (new Thread(new Consumer(message))).start();

    }
}
