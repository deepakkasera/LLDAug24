package org.example.designpatterns.prototype;

public class IntelligentStudent extends Student {
    private int iq;

    IntelligentStudent(){}

    IntelligentStudent(IntelligentStudent student) {
        super(student);
        this.iq = student.iq;
    }

    public IntelligentStudent clone() {
        return new IntelligentStudent(this);
    }
}
