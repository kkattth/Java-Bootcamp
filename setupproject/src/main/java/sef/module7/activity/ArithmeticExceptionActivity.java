package sef.module7.activity;

// Needs to be completed
public class ArithmeticExceptionActivity {
    //  - Type main method
    static void main() {


        //  - Create an instance of ArithmeticExceptionActivity and call catchMe with 10 and 0
        ArithmeticExceptionActivity a = new ArithmeticExceptionActivity();


        // - Try to call catchMe with 10 and 2 now and see which messages get printed
        a.catchMe(10,0);

        a.catchMe(10,2);
    }

    void catchMe(int num1, int num2) {
        // The following code results in an Exception.
        try {


            //  - Identify the exception and write code to handle this exception.
            int result = num1 / num2;
            System.out.println("The result is :" + result);
        }
        catch (ArithmeticException e){
            System.out.println("You cant divide by 0!");
        }

        // - After handling the exception, write a finally block which
        finally {
            System.out.println("Thank you for using this program.");
        }
        // prints a message "Thank you for using this program."

    }
}
