package sef.module8.activity;

import java.util.ArrayList;

import java.util.List;

public class ListActivity {

    public static void main(String[] args) {
        // Type code to create a list of names. Use ArrayList.
        List<String> names = new ArrayList<>();
        // Add "John", "John", "Harry", and "Daniel" to the list.
        names.add("John");
        names.add("John");
        names.add("Harry");
        names.add("Daniel");


        // Call print method to print the list passed as its parameter.

        print(names);

    }

    static void print(List list) {
        // Type code to print this list
        System.out.println(list);
        // Notice the order in which elements get printed.

    }
}