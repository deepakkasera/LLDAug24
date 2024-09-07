package org.example.Collections;

public class Student implements Comparable<Student> {
    String name;
    int age;
    int rollNumber;
    String batch;

    public Student(String name, int age, int rollNumber, String batch) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
        this.batch = batch;
    }

    @Override
    public int compareTo(Student other) {
        /*
        this object
        other object

        -ve => this object to come before the other object in the sorted order.
        0 => equal
        +ve => this object to come after the other object in the sorted order.
         */

//        if (this.rollNumber < other.rollNumber) {
//            return -1;
//        } else if (this.rollNumber > other.rollNumber) {
//            return 1;
//        }
//        return 0;

        return other.rollNumber - this.rollNumber;
    }

    @Override
    public String toString() {
        return "[Name= " + this.name + ", Age= " + this.age + ", RollNumber= " + this.rollNumber + ", Batch= " + this.batch + "]";
    }
}
