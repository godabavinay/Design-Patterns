package AbstractFactory.Button;

public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendered windows Button");
    }
}
