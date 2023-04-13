package assignment;

class Vehicle {
    String brand;
    String model;
    int year;
    
    public void drive() {
        System.out.println("The vehicle is being driven.");
    }
}

class Car extends Vehicle {
    String color;
    
    public void honk() {
        System.out.println("The car is honking.");
    }
}

public class Toyota {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.brand = "Rolls Roys";
        myCar.model = "Ghost";
        myCar.year = 2023;
        myCar.color = "VantaBlack";
        System.out.println("Car details:");
        System.out.println("\tBrand: " + myCar.brand);
        System.out.println("\tModel: " + myCar.model);
        System.out.println("\tYear: " + myCar.year);
        System.out.println("\tColor: " + myCar.color);

        myCar.drive();
        myCar.honk();
    }
}

