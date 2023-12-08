package io.dave.design.factorypattern;

public class SUV extends Car{
    @Override
    public void assemble() {
        System.out.println("SUV car assembled");
    }

    @Override
    public void roadTest() {
        System.out.println("SUV car road testing");
    }

    @Override
    public void drive() {
        System.out.println("SUV car driving");
    }

    @Override
    public void brake() {
        System.out.println("SUV car brake to stop");
    }
}
