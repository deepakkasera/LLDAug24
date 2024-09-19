package org.example.designpatterns.builder;

import java.util.SplittableRandom;

public class Student {
    private String name;
    private int age;
    private double psp;
    private String batch;
    private int gradYear;
    private String univName;
    private int rollNumber;

    Student(Builder builder) {
        this.name = builder.getName();
        this.age = builder.getAge();
        this.psp = builder.getPsp();
    }

    public static Builder getBuilder() {
        return new Builder();
    }
}
