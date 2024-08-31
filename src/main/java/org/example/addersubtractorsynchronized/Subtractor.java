package org.example.addersubtractorsynchronized;

import org.example.addersubtractor.Adder;

public class Subtractor implements Runnable {
    private Count count;

    public Subtractor(Count count) {
        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 100000; i++) {
            synchronized (Count.class) { // lock.lock();
                count.value -= i;
            } // lock.unlock();
        }
    }
}
