package org.example.oops.constructorChaining;

public class D extends C {
    public D() {
        //Call the constructor of C at the first line.
        super("Scaler", 2); // It should be the first statement inside the constructor.
        System.out.println("D's Constructor.");
    }

    public void fun() {
        System.out.println("Bye");
    }
}
