package com.example.package4;

public final class Utils {
    private static final String version = "1.0";

    private Utils() {}

    public static String getVersion() {
        return version;
    }

    public static void printVersion() {
        System.out.println("Version: " + version);
    }
}
