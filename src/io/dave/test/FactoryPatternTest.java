package io.dave.test;

import io.dave.design.factorypattern.Car;
import io.dave.design.factorypattern.CarFactory;
import io.dave.design.factorypattern.CarType;

public class FactoryPatternTest {
    public static void main(String[] args) {
         Car car = CarFactory.createCar(CarType.SEDAN);
         car.assemble();
         car.roadTest();
         car.brake();
    }
}
