package org.example.designpatterns.factory;

import org.example.designpatterns.factory.UIFactory;
import org.example.designpatterns.factory.components.button.Button;
import org.example.designpatterns.factory.components.button.MacButton;
import org.example.designpatterns.factory.components.menu.MacMenu;
import org.example.designpatterns.factory.components.menu.Menu;

public class MacUiFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Menu createMenu() {
        return new MacMenu();
    }
}
