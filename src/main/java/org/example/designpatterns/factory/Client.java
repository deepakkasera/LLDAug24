package org.example.designpatterns.factory;

import org.example.designpatterns.factory.components.button.Button;
import org.example.designpatterns.factory.components.menu.Menu;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter();

        //From flutter, we should be able to get the object of corresponding factory based on the platform.
        UIFactory uiFactory = flutter.getUIFactory(Platform.Android);

        Button button = uiFactory.createButton();
        button.displayButton();

        Menu menu = uiFactory.createMenu();
        menu.displayMenu();
    }
}
