package org.example.designpatterns.factory;

import org.example.designpatterns.factory.components.button.Button;
import org.example.designpatterns.factory.components.menu.Menu;

public interface UIFactory {
    //Factory Methods

    Button createButton(); // Return object of corresponding Button.

    Menu createMenu();// Return object of corresponding Menu
}
