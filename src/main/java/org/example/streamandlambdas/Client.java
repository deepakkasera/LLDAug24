package org.example.streamandlambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Callable;

public class Client {
    public static void main(String[] args) {

        //We can't create an object of Interface, because interfaces are incomplete.
        // 1. Create a class that implements the interface and provide the method body to all the methods.


        // 2. Anonymous Clas.
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello World, Printed by: " + Thread.currentThread().getName());
            }
        };

        //3. Lambdas
        // () : Method input params
        // {} : Method body / implementation.
        Runnable r = () -> {
            System.out.println("Hello World, Printed by: " + Thread.currentThread().getName());
        };

        Thread thread = new Thread(r);
        thread.start();

        Thread thread1 = new Thread(() -> {
            System.out.println("Scaler");
        });
        thread1.start();

        List<Student> students = new ArrayList<>();


        students.add(new Student("Rajneesh", 23, 5, "LLD Evening Batch"));
        students.add(new Student("Deepak", 28, 10, "Non DSA Batch"));
        students.add(new Student("Sandhya", 24, 2, "Project Evening Batch"));
        students.add(new Student("Irfan", 20, 15, "Scaler"));
        students.add(new Student("Apurv", 25, 1, "LLD"));

        Comparator<Student> ageComparator = (st1, st2) -> {
            if (st1.age < st2.age) return -1;
            else if (st1.age > st2.age) return 1;
            return 0;
        };

        Collections.sort(students, (o1, o2) -> o1.age - o2.age);

        System.out.println(students);
    }
}
