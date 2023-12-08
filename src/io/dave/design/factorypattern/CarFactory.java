package io.dave.design.factorypattern;

public class CarFactory {
    // Factory method to create instances of different car types
    public static Car createCar(CarType type) {
        Car car = null;
        if (type.equals(CarType.SUV)) {
            car = new SUV();
        } else if (type.equals(CarType.SEDAN)) {
            car = new Sedan();
        } else {
            throw new RuntimeException("Invalid Car Type");
        }
        return car;
    }

}
