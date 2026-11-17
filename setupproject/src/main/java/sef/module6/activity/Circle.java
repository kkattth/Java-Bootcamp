package sef.module6.activity;

public class Circle extends Shape {

    // Implement calculateArea and calculatePerimeter methods
    public double calculateArea(double length, double breadth, double radius) {
        return Math.PI * radius * radius;
    }

    public double calculatePerimeter(double length, double breadth, double radius) {
        return 2 * Math.PI * radius;
    }
}