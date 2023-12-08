package io.dave.design.singleton;

public class TicketBookingPrinting implements  Runnable{
    @Override
    public void run() {
        System.out.println(" Printing operaiton");
        ThreadSafeSingletonPrinter printer = ThreadSafeSingletonPrinter.getInstance();
        System.out.println(printer.hashCode());
    }
}
