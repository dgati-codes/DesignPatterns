package io.dave.test;

import io.dave.design.abstract_factory_pattern.Animal;
import io.dave.design.abstract_factory_pattern.AnimalFactory;
import io.dave.design.abstract_factory_pattern.AnimalFactoryType;
import io.dave.design.abstract_factory_pattern.AnimalType;

public class AbstractFactoryPatternTest {
    public static void main(String[] args) {
        AnimalFactory factory = AnimalFactory.getAnimalFactory(AnimalFactoryType.LAND);
         Animal cat = factory.getAnimal(AnimalType.CAT);
        System.out.println( cat.speak());

    }
}
