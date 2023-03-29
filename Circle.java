package com.cognizant.shapes;

public class Circle {
    private float radius;
    private float pi;

    // Constructor 1: Default constructor
    public Circle() {
        this.radius = 1.5f;
        this.pi = 3.1415f;
    }

    // Constructor 2: Overloaded constructor with package level access
    Circle(float radius) {
        this.radius = radius;
        this.pi = 3.1415f; // set default value for pi
    }

    // Constructor 3: Overloaded constructor
    public Circle(float radius, float pi) {
        this.radius = radius;
        this.pi = pi;
    }

    public float getRadius() {
        return radius;
    }

    public float getPi() {
        return pi;
    }

    // Method to calculate the area of the circle
    public float calculateCircleArea(float radius) {
        return pi * radius * radius;
    }

    // Method to calculate the circumference of the circle
    public float calculateCircumference(float radius) {
        return 2 * pi * radius;
    }

    public static void main(String[] args) {
        Circle circle = new Circle(2.5f);

        float radius = circle.getRadius();
        float area = circle.calculateCircleArea(radius);
        float circumference = circle.calculateCircumference(radius);

        System.out.println("Area of circle with radius " + radius + " is: " + area);
        System.out.println("Circumference of circle with radius " + radius + " is: " + circumference);
    }
}
