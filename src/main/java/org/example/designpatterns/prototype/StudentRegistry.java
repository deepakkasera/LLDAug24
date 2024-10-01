package org.example.designpatterns.prototype;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {
    private Map<String, Student> studentMap = new HashMap<>();

    public void register(String key, Student student) {
        studentMap.put(key, student);
    }

    public Student get(String key) {
        return studentMap.get(key);
    }

    void fill(){
        fillRegistry f = new fillRegistry(this); // please refer the fillregistry class added as a new file in same package 
    }
}
