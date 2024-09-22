package org.example.designpatterns.factory.components.button;

public class WindowsButton implements Button {
    @Override
    public void displayButton() {
        System.out.println("Windows Button");
    }
}
