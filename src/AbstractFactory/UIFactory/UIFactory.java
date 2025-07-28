package AbstractFactory.UIFactory;

import AbstractFactory.Button.Button;
import AbstractFactory.CheckBox.CheckBox;

public interface UIFactory {
    public Button createButton();
    public CheckBox createCheckBox();
}
