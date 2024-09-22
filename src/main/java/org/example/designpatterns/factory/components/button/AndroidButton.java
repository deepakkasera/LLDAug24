package org.example.designpatterns.factory.components.button;

public class AndroidButton implements Button {
    @Override
    public void displayButton() {
        System.out.println("Android Button");
    }
}
