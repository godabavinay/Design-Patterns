package Singleton.AppConfigManger;

public class Main {
    public static void main(String[] args) {
        AppConfigManager config1 = AppConfigManager.getInstance();
        AppConfigManager config2 = AppConfigManager.getInstance();

        System.out.println("App name: " + config1.get("app.name"));
        System.out.println("App version: " + config2.get("app.version"));

        System.out.println("Same instance? " + (config1 == config2));
    }
}
