package org.example.oops;

public class Instructor extends User {
    String company;
    double avgRating;

    public Instructor() {
        System.out.println("Instructor ka constructor.");
    }

    public void doSomething() {
        System.out.println("Doing something in Instructor class.");
    }
}
