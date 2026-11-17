package sef.module6.activity;

public class AnimalActivity {

    public static void main(String arg[]) {

        // Use interfaces to declare identifiers instead of the actual classes (create Cat using interface Animal)
        Animal cat = new Cat();

        // Create Dog using interface Animal

        Animal dog = new Dog();


        Mammal mammal = new Mammal("Flexy");

        // For mammal set animal to cat

        mammal.setAnimal(cat);

        // Execute for mammal animalIsSleeping()

        mammal.animalIsSleeping();


        // Execute for mammal animalIsSpeaking()

        mammal.animalIsSpeaking();

        // For mammal set animal to dog

        mammal.setAnimal(dog);

        // Execute for mammal animalIsSleeping()

        mammal.animalIsSleeping();

        //  Execute for mammal animalIsSpeaking()
        mammal.animalIsSpeaking();

    }
}
