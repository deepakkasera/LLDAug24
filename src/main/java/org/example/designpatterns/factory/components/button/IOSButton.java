package org.example.designpatterns.factory.components.button;

public class IOSButton implements Button {
    @Override
    public void displayButton() {
        System.out.println("IOS Button");
    }
}
