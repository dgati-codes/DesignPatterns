package io.dave.design.singleton;

public enum EnumPrinter {
    INSTANCE;

    public static EnumPrinter getInstance(){
        return INSTANCE;
    }

    public String getStatus() {
        return "Enum Printer is operational";
    }
}
