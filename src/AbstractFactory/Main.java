package AbstractFactory;

import AbstractFactory.Button.Button;
import AbstractFactory.CheckBox.CheckBox;
import AbstractFactory.UIFactory.MacUIFactory;
import AbstractFactory.UIFactory.UIFactory;
import AbstractFactory.UIFactory.WindowsUIFactory;

class Application {
    private Button button;
    private CheckBox checkBox;

    public Application (UIFactory factory) {
        button = factory.createButton();
        checkBox = factory.createCheckBox();
    }

    public void renderComponents() {
        button.render();
        checkBox.render();
    }
}

public class Main {
    public static void main(String[] args) {
        UIFactory factory;
        String OS = "windows";

        if (OS.equalsIgnoreCase("mac")) {
            factory = new MacUIFactory();
        } else {
            factory = new WindowsUIFactory();
        }

        Application client = new Application(factory);
        client.renderComponents();
    }
}
