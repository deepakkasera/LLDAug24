package org.example.designpatterns.factory;

public class Flutter {
    //Non factory methods.

    void refreshUI() {
        System.out.println("Refreshing UI from Flutter.");
    }

    void setTheme() {
        System.out.println("Setting theme from Flutter.");
    }

    //Factory method to get the object of corresponding UI factory.
    public UIFactory getUIFactory(Platform platform) {
        return UIFactoryFactory.getUIFactory(platform);
    }
}
