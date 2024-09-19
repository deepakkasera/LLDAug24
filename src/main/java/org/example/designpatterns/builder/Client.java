package org.example.designpatterns.builder;

public class Client {
    public static void main(String[] args) {
//        Builder builder = new Builder();
        Builder builder = Student.getBuilder();
        builder.setName("Rajneesh");
        builder.setAge(25);
        builder.setPsp(95.0);
        builder.setGradYear(2021);

        Student student = builder.build();
    }
}
