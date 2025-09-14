package com.example.carbuilder;

public class Main {
    public static void main(String[] args) {
        Car tesla = new Car.CarBuilder("Tesla", "Model S")
                .year(2025)
                .color("Red")
                .engineType("Electric")
                .sunroof(true)
                .build();

        Car bmw = new Car.CarBuilder("BMW", "X5")
                .year(2023)
                .color("Blue")
                .build();

        System.out.println(tesla);
        System.out.println(bmw);
    }
}
