package Singleton.ExtendedAppConfigManger;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.locks.ReentrantReadWriteLock;

class AppConfigManager {
    private static volatile AppConfigManager instance;
    private final Properties config = new Properties();
    private final ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
    private static final String CONFIG_FILE = "app.properties";

    private AppConfigManager() {
        loadConfig();
    }

    public static AppConfigManager getInstance() {
        if (instance == null) {
            synchronized (AppConfigManager.class) {
                if (instance == null) {
                    instance = new AppConfigManager();
                }
            }
        }
        return instance;
    }

    private void loadConfig() {
        try (FileInputStream fs = new FileInputStream(CONFIG_FILE)) {
            config.load(fs);
        } catch (IOException e) {
            System.err.println("Failed to load config: " + e.getMessage());
        }
    }

    public String get(String key) {
        lock.readLock().lock();
        try {
            return config.getProperty(key);
        } finally {
            lock.readLock().unlock();
        }
    }

    public void reload() {
        lock.writeLock().lock();
        try {
            config.clear();
            loadConfig();
            System.out.println("Config reloaded successfully");
        } finally {
            lock.writeLock().unlock();
        }
    }
}
