package module10;

public class InterfaceActivityClass {
    public static void main(String[] args) {

        // I need to create an object for each class
        Bike bike = new Bike();
        Car car = new Car();

        // now ill call the methods for both the car and bike class!

        bike.start();
        bike.stop();

        car.start();
        car.stop();
    }
}
