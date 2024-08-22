package org.example.multithreading.HelloWorldPrinter;

public class HelloWorldPrinter implements Runnable {
    @Override
    public void run() {
        //Write the code that you want to execute via a separate thread.
        System.out.println("Hello World, Printed by: " + Thread.currentThread().getName());
    }
}
