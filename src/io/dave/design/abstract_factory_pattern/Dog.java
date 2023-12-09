package io.dave.design.abstract_factory_pattern;

public class Dog implements Animal{
    @Override
    public String speak() {
        return "bark bark";
    }
}
