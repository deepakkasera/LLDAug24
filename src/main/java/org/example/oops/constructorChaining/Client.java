package org.example.oops.constructorChaining;

public class Client {
    public static void main(String[] args) {
        D d = new D();

        A a = new B();
        a.fun();
    }
}
