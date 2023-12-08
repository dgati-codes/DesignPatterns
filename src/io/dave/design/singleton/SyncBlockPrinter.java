package io.dave.design.singleton;

public class SyncBlockPrinter {

    private static SyncBlockPrinter instance= null;

    private SyncBlockPrinter(){}

    private static SyncBlockPrinter getInstance(){

        synchronized (SyncBlockPrinter.class){
            if(instance==null){
                instance= new SyncBlockPrinter();
            }
        }
        return instance;
    }
}
