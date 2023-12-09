package io.dave.design.builder;
public class House {
    private final int numberOfRooms;
    private final boolean hasSwimmingPool;
    private final boolean hasGarden;

    private House(Builder builder) {
        this.numberOfRooms = builder.numberOfRooms;
        this.hasSwimmingPool = builder.hasSwimmingPool;
        this.hasGarden = builder.hasGarden;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public boolean hasSwimmingPool() {
        return hasSwimmingPool;
    }

    public boolean hasGarden() {
        return hasGarden;
    }

    @Override
    public String toString() {
        return "House{" +
                "numberOfRooms=" + numberOfRooms +
                ", hasSwimmingPool=" + hasSwimmingPool +
                ", hasGarden=" + hasGarden +
                '}';
    }

    public static class Builder {
        private final int numberOfRooms;
        private boolean hasSwimmingPool;
        private boolean hasGarden;

        public Builder(int numberOfRooms) {
            this.numberOfRooms = numberOfRooms;
        }

        public Builder withSwimmingPool(boolean hasSwimmingPool) {
            this.hasSwimmingPool = hasSwimmingPool;
            return this;
        }

        public Builder withGarden(boolean hasGarden) {
            this.hasGarden = hasGarden;
            return this;
        }

        public House build() {
            return new House(this);
        }
    }
}
