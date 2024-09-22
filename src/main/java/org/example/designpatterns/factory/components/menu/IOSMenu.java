package org.example.designpatterns.factory.components.menu;

public class IOSMenu implements Menu {
    @Override
    public void displayMenu() {
        System.out.println("IOS Menu");
    }
}
