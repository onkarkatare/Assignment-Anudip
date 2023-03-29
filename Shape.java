package com.cognizant.geometry;
import com.cognizant.shapes.Circle;

public class Shape {
    public static void main(String[] args) {
        // create a Circle object using the default constructor
        Circle circle1 = new Circle();

        // print the details of the circles
        System.out.println("Circle 1: radius=" + circle1.getRadius() + ", pi=" + circle1.getPi());
    }
}
