package dev;

public class Car {
    public static int carPrice = 100;
    int a,b;

    public static double getCarPrice(String city){
        switch (city){
            case "Srinagar" -> {
                return carPrice + carPrice * 0.1;
            }
            case "Baramulla" -> {
                return carPrice + carPrice * 0.12;
            }
        }

        return carPrice;
    }

    public void show(){
        System.out.println(carPrice);
    }
}
