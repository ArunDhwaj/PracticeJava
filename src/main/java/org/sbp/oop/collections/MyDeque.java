package org.sbp.oop.collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class MyDeque {

    public MyDeque( )
    {

    }
    public void demo() {
        Deque<Integer> deque = new ArrayDeque<>();

        deque.offer(1);
        deque.offer(2);
        deque.offer(3);
        deque.offer(4);
        deque.offerLast(5);

        System.out.println(deque);
    }
}
