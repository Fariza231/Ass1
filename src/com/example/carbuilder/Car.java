package com.example.carbuilder;

public final class Car {
    private final String brand;
    private final String model;
    private final int year;
    private final String color;
    private final String engineType;
    private final boolean hasSunroof;

    private Car(CarBuilder builder) {
        this.brand = builder.brand;
        this.model = builder.model;
        this.year = builder.year;
        this.color = builder.color;
        this.engineType = builder.engineType;
        this.hasSunroof = builder.hasSunroof;
    }

    @Override
    public String toString() {
        return String.format("Car [brand=%s, model=%s, year=%d, color=%s, engine=%s, sunroof=%b]",
                brand, model, year, color, engineType, hasSunroof);
    }

    public static class CarBuilder {
        private final String brand;   // required
        private final String model;   // required
        private int year = 2024;
        private String color = "Black";
        private String engineType = "Petrol";
        private boolean hasSunroof = false;

        public CarBuilder(String brand, String model) {
            if (brand == null || brand.isBlank()) throw new IllegalArgumentException("brand required");
            if (model == null || model.isBlank()) throw new IllegalArgumentException("model required");
            this.brand = brand;
            this.model = model;
        }

        public CarBuilder year(int year) {
            this.year = year;
            return this;
        }

        public CarBuilder color(String color) {
            this.color = color;
            return this;
        }

        public CarBuilder engineType(String engineType) {
            this.engineType = engineType;
            return this;
        }

        public CarBuilder sunroof(boolean hasSunroof) {
            this.hasSunroof = hasSunroof;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}
