package org.example.addersubtractorsyncmethod;

public class Count {
    private int value;

    public Count(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public synchronized void incrementValue(int i) {
        this.value += i;
    }
}
