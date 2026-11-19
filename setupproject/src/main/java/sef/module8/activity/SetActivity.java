package sef.module8.activity;

import java.util.HashSet;
import java.util.Set;

public class SetActivity {

    public static void main(String[] args) {

        // Type code to create a set of names using HashSet.
        Set<String> names = new HashSet<>();

        names.add("John");
        names.add("John");
        names.add("John");
        names.add("Harry");
        names.add("Harry");
        names.add("Daniel");
        names.add("Daniel");


        // Add "John", "John", "Harry", and "Daniel" (and try adding a few more duplicate entries).


        //  Call print method to print the set passed as its parameter.

        print(names);

    }

    static void print(Set set) {

        // TODO: 3 - Type code to print this set
        System.out.println(set);

        // Notice the order in which elements get printed and whether duplicates appear.

    }

}

