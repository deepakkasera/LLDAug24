package org.example.multithreading;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hey Learners!, Printed by : " + Thread.currentThread().getName());
        Helper.doSomething();




        /*
        Print Hello world from a new Thread.

        1. Create a task that you want to execute in a separate thread.
        2. Create a new Thread.
        3. Assign the task to the thread.
        4. Start the thread.
         */
    }
}
