package com;

public class Square {
    double side;

    public Square(double side) {
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }

    public double getPerimeter() {
        return 4 * side;
    }

    public static double getArea(double side) {
        return side * side;
    }

    public static double getPerimeter(double side) {
        return 4 * side;
    }

    public static void main(String[] args) {
        Square square1 = new Square(5.0);

        double area1 = square1.getArea();
        double perimeter1 = square1.getPerimeter();

        System.out.println("Non-static area: " + area1 + ", perimeter: " + perimeter1);

        double area2 = Square.getArea(5.0);
        double perimeter2 = Square.getPerimeter(5.0);

        System.out.println("Static area: " + area2 + ", perimeter: " + perimeter2);
    }
}
