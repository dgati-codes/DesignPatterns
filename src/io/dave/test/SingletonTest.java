package io.dave.test;

import io.dave.design.singleton.ThreadSafeSingletonPrinter;
import io.dave.design.singleton.TicketBookingPrinting;

public class SingletonTest {

    public static void main(String[] args) {
        TicketBookingPrinting print= new TicketBookingPrinting();

        new Thread(print).start();
        new Thread(print).start();
        new Thread(print).start();


    }
}
