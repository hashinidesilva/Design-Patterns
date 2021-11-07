package com.example.singleton;

import java.util.HashMap;
import java.util.Map;

public class ConfigManager {

    private static ConfigManager instance;

    private Map<String, String> configMap = new HashMap<String, String>() {{
        put("host", "dev.localhost");
        put("port", "1234");
        put("user", "admin");
        put("password", "password");
    }};

    private ConfigManager() {
    }

    public String get(String key) {
        return configMap.get(key);
    }

    public void update(String key, String value) {
        configMap.put(key, value);
    }

    public static ConfigManager getInstance() {
        if (instance == null) {
            instance = new ConfigManager();
        }
        return instance;
    }

/*
    public synchronized static ConfigManager getInstance() {
        if (instance == null) {
            instance = new ConfigManager();
        }
        return instance;
    }
*/

    /*public static ConfigManager getInstance() {
        if (instance == null) {
            synchronized (ConfigManager.class) {
                if (instance == null) {
                    instance = new ConfigManager();
                }
            }
        }
        return instance;
    }*/
}