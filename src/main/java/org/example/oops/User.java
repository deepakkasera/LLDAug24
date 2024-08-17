package org.example.oops;

public class User {
    private String name;
    String email;
    String phoneNumber;
    int age;

    public User() {
        System.out.println("User ka constructor.");
    }

    public void doSomething() {
        System.out.println("Doing something in User class");
    }
}
