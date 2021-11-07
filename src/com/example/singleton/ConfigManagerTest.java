package com.example.singleton;

public class ConfigManagerTest {

    public static void main(String[] args) {

        ConfigManager instance1 = ConfigManager.getInstance();
        ConfigManager instance2 = ConfigManager.getInstance();

        System.out.println(instance1.get("password"));
        instance1.update("password", "pstest");
        System.out.println(instance2.get("password"));
    }
}