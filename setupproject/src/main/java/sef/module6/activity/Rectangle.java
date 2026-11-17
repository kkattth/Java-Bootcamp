package sef.module6.activity;

public class Rectangle extends Shape {

    // Implement calculateArea and calculatePerimeter methods
    public double calculateArea(double length,double breadth,double radius){
        return length * breadth;
    }


    public double calculatePerimeter(double length, double breadth, double radius) {
        return 2 * (length + breadth);
    }
}
