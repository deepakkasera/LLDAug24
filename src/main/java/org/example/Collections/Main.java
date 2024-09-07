package org.example.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Rajneesh", 23, 5, "LLD Evening Batch"));
        students.add(new Student("Deepak", 28, 10, "Non DSA Batch"));
        students.add(new Student("Sandhya", 24, 2, "Project Evening Batch"));
        students.add(new Student("Irfan", 20, 15, "Scaler"));
        students.add(new Student("Apurv", 25, 1, "LLD"));

//        Collections.sort(students);

        Collections.sort(students, new StudentAgeComparator());

        for (Student student : students) {
            System.out.println(student.toString());
        }
    }
}
