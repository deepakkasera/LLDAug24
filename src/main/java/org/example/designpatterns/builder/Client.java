package org.example.designpatterns.builder;

public class Client {
    public static void main(String[] args) {
//        Builder builder = new Builder();

//        Builder builder = Student.getBuilder();
//        builder.setName("Rajneesh");
//        builder.setAge(25);
//        builder.setPsp(95.0);
//        builder.setGradYear(2021);
//
//        Student student = builder.build();


        Student student = Student.getBuilder()
                .setName("Rajneesh")
                .setAge(25)
                .setBatch("Aug23 Beginner")
                .setGradYear(2021)
                .setUnivName("Scaler")
                .build();

        System.out.println("DEBUG");
    }
}
