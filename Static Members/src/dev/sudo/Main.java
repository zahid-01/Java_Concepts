package dev.sudo;

import dev.Car;

public class Main {
    public static void main(String[] args) {
        Car co1 = new Car();
        Car co2 = new Car();

        System.out.println(Car.carPrice);
        System.out.println(co1.carPrice);
        System.out.println(co1.getCarPrice("Srinagar"));
        System.out.println(co1.getCarPrice("Baramulla"));
        System.out.println(Car.getCarPrice("Uri"));
    }
}
