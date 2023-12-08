package io.dave.design.singleton;

public class EagerPrinter {

    private static EagerPrinter instance=new EagerPrinter();

    private EagerPrinter(){}

    private static EagerPrinter getInstance(){
        return instance;
    }
}
