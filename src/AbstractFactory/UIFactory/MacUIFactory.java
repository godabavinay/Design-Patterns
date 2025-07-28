package AbstractFactory.UIFactory;

import AbstractFactory.Button.Button;
import AbstractFactory.Button.MacButton;
import AbstractFactory.CheckBox.CheckBox;
import AbstractFactory.CheckBox.MacCheckBox;

public class MacUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacCheckBox();
    }
}
