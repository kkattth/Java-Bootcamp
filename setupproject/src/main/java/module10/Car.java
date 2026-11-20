package module10;

public class Car implements Vehicle {
    //same thing as in bike, i get to implement the methods!


    @Override
    public void start() {
        System.out.println("Lets go on a road trip!");
    }

    @Override
    public void stop() {
        System.out.println("Aw, why arent we moving anymore");
    }
}
