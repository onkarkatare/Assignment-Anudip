package com.cognizant.shapes;

public class Shapes1 {
    private int numberOfSides;

    public Shapes1(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

    public void calculateShapeArea(int sideLength) {
        switch (numberOfSides) {
            case 1:
                Circle1 circle = new Circle1();
                double circleArea = circle.calculateArea(sideLength);
                System.out.println("The Area of the Circle is " + circleArea);
                break;
            case 3:
                Triangle1 triangle = new Triangle1();
                double triangleArea = triangle.calculateArea(sideLength);
                System.out.println("The Area of the Triangle is " + triangleArea);
                break;
            case 4:
                Square1 square = new Square1();
                double squareArea = square.calculateArea(sideLength);
                System.out.println("The Area of the Square is " + squareArea);
                break;
            default:
                System.out.println("No Shapes Present");
                break;
        }
    }

    public static void main(String[] args) {
        Shapes1 shapes1 = new Shapes1(3);
        shapes1.calculateShapeArea(12);

        shapes1 = new Shapes1(4);
        shapes1.calculateShapeArea(15);

        shapes1 = new Shapes1(5);
        shapes1.calculateShapeArea(15);
    }
}
