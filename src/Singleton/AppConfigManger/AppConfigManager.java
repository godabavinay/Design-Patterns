package Singleton.AppConfigManger;

import java.util.HashMap;
import java.util.Map;

public class AppConfigManager {
    private static AppConfigManager instance;
    private final Map<String, String> config;

    private AppConfigManager() {
        config = new HashMap<>();
        loadConfig();
    }

    private void loadConfig() {
        config.put("app.name", "Vinay's App");
        config.put("app.version", "1.0.0");
        config.put("env", "production");
    }

    public static AppConfigManager getInstance() {
        if (instance == null) {
            instance = new AppConfigManager();
        }
        return instance;
    }

    public String get(String key) {
        return config.get(key);
    }
}
