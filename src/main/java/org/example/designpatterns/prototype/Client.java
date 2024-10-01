package org.example.designpatterns.prototype;

public class Client {
    public static void main(String[] args) {
        StudentRegistry studentRegistry = new StudentRegistry();
        //when fillRegistry is here in same client class, i need to make changes to Client(main) everytime i have a new batch. Violating OCP. Hence i prefer to separate fill registry as a separate class. 
        studentRegistry.fill(); 

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
}
