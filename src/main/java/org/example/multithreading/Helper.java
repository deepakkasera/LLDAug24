package org.example.multithreading;

public class Helper {
    public static void doSomething() {
        System.out.println("Hello World, Printed by : " + Thread.currentThread().getName());
    }
}
