package org.example.Collections;

import java.util.Comparator;

public class StudentAgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student other1, Student other2) {
        return other1.age - other2.age;
    }
}
