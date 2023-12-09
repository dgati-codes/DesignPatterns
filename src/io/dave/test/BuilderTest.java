package io.dave.test;

import io.dave.design.builder.House;

public class BuilderTest {
    public static void main(String[] args) {
        // Create a house with 3 rooms, a swimming pool, and a garden
        House house1 = new House.Builder(3)
                .withSwimmingPool(true)
                .withGarden(true)
                .build();

        // Create a house with 2 rooms and no swimming pool or garden
        House house2 = new House.Builder(2)
                .withGarden(true)
                .build();

        // Display information about the houses
        displayHouseInfo("House 1", house1);
        displayHouseInfo("House 2", house2);
    }
    private static void displayHouseInfo(String label, House house) {
        System.out.println(label + ": " + house);
    }
}
