package module10;

public class Bike implements Vehicle{

    // now i can implement the methods i defined in vehicle since each class will have its own implementation!


    @Override
    public void start() {
        System.out.println("The bike is starting!!!");
    }

    @Override
    public void stop() {
        System.out.println("Oh no! The bike stopped!");
    }
}
