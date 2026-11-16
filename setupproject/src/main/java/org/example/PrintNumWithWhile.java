package org.example;

public class PrintNumWithWhile {

    static void main() {

        int i = 1;

        System.out.println("Odd numbers:");

        while (i < 100) {
            System.out.println(i);
            i = i + 2; // can also use devision :  if (i % 2 == 1) but in that case i have to add another if statement
        }

    }
}
