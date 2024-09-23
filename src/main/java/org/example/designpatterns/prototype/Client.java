package org.example.designpatterns.prototype;

public class Client {
    public static void main(String[] args) {
        StudentRegistry studentRegistry = new StudentRegistry();
        fillRegistry(studentRegistry);

        Student rajneesh = studentRegistry.get("Aug23Evening").clone();
        rajneesh.setName("Rajneesh");
        rajneesh.setPsp(89.0);

        Student umair = studentRegistry.get("Aug23Evening").clone();
        umair.setName("Umair");
        umair.setAge(26);
        umair.setPsp(91.0);

        Student ningappa = studentRegistry.get("Aug23EveningIntelligent").clone();

        System.out.println("DEBUG");

    }

    private static void fillRegistry(StudentRegistry studentRegistry) {
        Student aug23EveningBatch = new Student();
        aug23EveningBatch.setBatch("Aug23 Evening Batch");
        aug23EveningBatch.setAvgBatchPsp(75.0);

        studentRegistry.register("Aug23Evening", aug23EveningBatch);

        Student aug23EveningBatchIntelligent = new IntelligentStudent();
        aug23EveningBatchIntelligent.setBatch("Aug23 Evening Batch");
        aug23EveningBatchIntelligent.setAvgBatchPsp(90.0);

        studentRegistry.register("Aug23EveningIntelligent", aug23EveningBatchIntelligent);
    }
}
