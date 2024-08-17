package org.example.oops.constructorChaining;

public class C extends B {
    public C() {
        System.out.println("C's Constructor.");
    }

    public C(String str) {
        System.out.println("C's Constructor with a param");
    }

    public C(String str, int x) {
        System.out.println("C's Constructor with 2 params");
    }

    public C(int y, String s) {

    }

    public void fun() {
        System.out.println("Hi");
    }
}
