package io.dave.design.singleton;

/**
 * Note: Relying solely on constructor execution to determine whether an object is
 * created is not always conclusive due to specific executional scenarios.
 * <p>
 * Scenario 1: When an object is created for a subclass of an abstract class, the abstract class constructor
 * is invoked along with the subclass constructor. However, this does not imply that an object is created
 * for the abstract class.
 * <p>
 * Scenario 2: If an object is instantiated through cloning or deserialization processes,
 * the constructor will not be executed. Absence of constructor execution in this case does not
 * imply that an object is not created.
 */
public class Printer {
    private static Printer INSTANCE = null;
    private Printer() {
    }
    public static Printer getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Printer();
        }
        return INSTANCE;
    }
}
