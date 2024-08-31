package org.example.producerconsumermutex;

import java.util.Queue;

public class Consumer implements Runnable {
    private Queue<Object> store;
    private int maxSize;
    private String name;

    public Consumer(Queue<Object> store, int maxSize, String name) {
        this.store = store;
        this.maxSize = maxSize;
        this.name = name;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (Queue.class) {
                if (store.size() > 0) { // size=1
                    System.out.println(this.name + " is consuming an item, Size = " + store.size());
                    store.remove(); // C1, C2
                }
            }
        }
    }
}
