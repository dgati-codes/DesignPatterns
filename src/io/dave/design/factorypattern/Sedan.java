package io.dave.design.factorypattern;

public class Sedan extends Car{
    @Override
    public void assemble() {
        System.out.println("Sedan car assembled");
    }

    @Override
    public void roadTest() {
        System.out.println("Sedan car road testing");
    }

    @Override
    public void drive() {
        System.out.println("Sedan car driviing");
    }

    @Override
    public void brake() {
        System.out.println("Sedan car brake to stop");
    }
}
