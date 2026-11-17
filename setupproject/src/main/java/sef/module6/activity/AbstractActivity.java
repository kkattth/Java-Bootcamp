package sef.module6.activity;

public class AbstractActivity {
    public static void main(String args[]) {
        // Create a Rectangle object, set color to "Blue", and print the color

        Rectangle rectangle = new Rectangle();
        rectangle.setColor("Blue");

        System.out.println("Rectangle Color:" + rectangle.getColor());

        // Print the area and perimeter of the rectangle (using length = 2, breadth = 4, radius = 0)
        System.out.println(" Rectangle Area:" + rectangle.calculateArea(2,4,0));
        System.out.println("Rectangle Perimeter:" + rectangle.calculatePerimeter(2,4,0));



         //Create a Circle object, set color to "Pink", and print the color
        Circle circle = new Circle();
        circle.setColor("Pink");

        System.out.println("Circle color:" + circle.getColor());
        //Print the area and perimeter of the circle (using length = 0, breadth = 0, radius = 5)

        System.out.println("Circle area" + circle.calculateArea(0,0,5));
        System.out.println("Circle Peremeter" + circle.calculatePerimeter(0,0,5));


    }
}
