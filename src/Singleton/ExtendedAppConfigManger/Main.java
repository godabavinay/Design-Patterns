package Singleton.ExtendedAppConfigManger;

public class Main {
    public static void main(String[] args) {
        AppConfigManager config = AppConfigManager.getInstance();

        System.out.println("App Name: " + config.get("app.name"));
        System.out.println("Version : " + config.get("app.version"));

        // Assume config file was modified externally at this point...
        // Reload config
        config.reload();
        System.out.println("Reloaded App Name: " + config.get("app.name"));
    }
}
