package org.example.producerconsumermutex;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Producer implements Runnable {
    private Queue<Object> store;
    private int maxSize;
    private String name;
    private Semaphore producerSemaphore;
    private Semaphore consumerSemaphore;

    public Producer(Queue<Object> store, int maxSize, String name,
                    Semaphore producerSemaphore, Semaphore consumerSemaphore) {
        this.store = store;
        this.maxSize = maxSize;
        this.name = name;
        this.producerSemaphore = producerSemaphore;
        this.consumerSemaphore = consumerSemaphore;
    }

    @Override
    public void run() {
//        while (true) {
//            synchronized (Queue.class) {
//                if (store.size() < maxSize) {
//                    System.out.println(this.name + " is producing an item, Size = " + store.size());
//                    store.add(new Object());
//                }
//            }
//        }

        while (true) {
            try {
                producerSemaphore.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
//            if (store.size() < maxSize) {
            System.out.println(this.name + " is producing an item, Size = " + store.size());
            store.add(new Object());
//            }
            consumerSemaphore.release(); // Notification mechanism.
        }
    }
}
