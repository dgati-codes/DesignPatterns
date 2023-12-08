package io.dave.design.singleton;

public class SyncMethodPrinter {
    private static SyncMethodPrinter instance = null;
    private SyncMethodPrinter() {
    }
    // Synchronized static factory method for thread-safe instantiation
    public static synchronized SyncMethodPrinter getInstance() {
        if (instance == null) {
            instance = new SyncMethodPrinter();
        }
        return instance;
    }
}
