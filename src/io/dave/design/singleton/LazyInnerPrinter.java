package io.dave.design.singleton;
/**
 * Singleton class using inner class for lazy instantiation.
 * <p>
 * This implementation leverages an inner class ({@code SingletonHelper}) to achieve lazy instantiation
 * of the singleton instance. The singleton instance is created only when the {@code getInstance} method is called,
 * promoting efficiency and avoiding unnecessary resource consumption.
 * </p>
 */
public class LazyInnerPrinter {

    private static boolean isInstantiated=false;

    // Private constructor to prevent external instantiation.
    private LazyInnerPrinter(){
        // Check if the object is already instantiated to avoid multiple instantiations.
        if(isInstantiated)
            throw new RuntimeException("Object already Created");
        else
            isInstantiated=true;
    }

    // Inner class to hold the singleton instance
    private static class SingletonHelper{
        private static LazyInnerPrinter INSTANCE = new LazyInnerPrinter();
    }

    private static LazyInnerPrinter getInstance(){
        return SingletonHelper.INSTANCE;
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
        return SingletonHelper.INSTANCE;
    }

}
