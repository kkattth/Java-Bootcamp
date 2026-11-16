package org.example;

public class NumToWordsUsingMethod {

    static void main(String[] args) {

        int a = 5;

        printword(a);
    }

    // for 8,9 and 10 id write
    //        printword(8);
    //        printword(9);
    //        printword(10)


    static void printword(int a) {

        switch (a) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;
            case 10:
                System.out.println("Ten");
                break;
        }
    }
}
