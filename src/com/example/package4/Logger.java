package com.example.package4;

public class Logger {
    private static Logger instance;

    private Logger() {}

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("Log: " + message);
    }

    public void log(String message, int level) {
        System.out.println("Log [" + level + "]: " + message);
    }
}
