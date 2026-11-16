package org.example;

public class MultiplicationTable {
    static void main() {

        for (int i = 11; i <= 20; i++) {

            for (int j = 1; j <= 10; j++) {
                System.out.println(i * j);
            }

            // or this         for (int i = 1; i <= 20; i++) {
            //            System.out.println("11 * " + i + " = " + (11 * i)); im not sure if its meant only for 11 or not
            System.out.println();
        }

    }
}
