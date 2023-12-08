package io.dave.design.singleton;

import java.util.Objects;

/**
 * Thread-safe singleton class for Printer instantiation.
 * <p>
 * This class implements a thread-safe singleton pattern using double-checked locking.
 * The instance is created lazily to improve performance, and a volatile variable is used
 * to ensure visibility of changes to the instance variable across threads.
 * </p>
 */
public class ThreadSafeSingletonPrinter {

    // Ensure visibility of changes to the instance variable across threads.
    private static volatile ThreadSafeSingletonPrinter instance;

    // Flag to track whether the object is already instantiated.
    private static boolean isInstantiated = false;

    // Private constructor to prevent external instantiation.
    private ThreadSafeSingletonPrinter() {
        // Check if the object is already instantiated to avoid multiple instantiations.
        if (isInstantiated) {
            throw new RuntimeException("Object is already created");
        } else {
            isInstantiated = true;
        }
    }

    /**
     * Gets the singleton instance of the ThreadSafeSingletonPrinter class.
     *
     * @return The singleton instance of ThreadSafeSingletonPrinter.
     */
    public static ThreadSafeSingletonPrinter getInstance() {
        // First check without locking for performance improvement
        if (instance == null) {
            // Synchronize only when the instance is null
            synchronized (ThreadSafeSingletonPrinter.class) {
                // Double check to ensure thread safety
                if (instance == null) {
                    instance = new ThreadSafeSingletonPrinter();
                }
            }
        }
        return instance;
    }

    /**
     * Throws an exception to prevent cloning of the singleton instance.
     *
     * @return Nothing, as an exception is always thrown.
     * @throws CloneNotSupportedException Thrown to indicate that cloning is not allowed for this class.
     */
    @Override
    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Singleton class is restricted");
    }

    /**
     * Ensures that the singleton instance is returned during deserialization.
     *
     * @return The singleton instance.
     */
    public Object readResolve() {
        return instance;
    }
}
