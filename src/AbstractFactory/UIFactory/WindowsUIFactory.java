package AbstractFactory.UIFactory;

import AbstractFactory.Button.Button;
import AbstractFactory.Button.WindowsButton;
import AbstractFactory.CheckBox.CheckBox;
import AbstractFactory.CheckBox.WindowsCheckBox;

public class WindowsUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WindowsCheckBox();
    }
}
