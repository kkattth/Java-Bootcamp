package module10;
class InvalidInputException extends Exception {
}

public class Calculator {
    // creating 2 add methods and overloading by changing the variables type since the parameter types are different
    public int add(int a, int b){
        return a + b;
    }

    public double add(double a, double b){
        return a + b;
    }
    // a substract method now

    public int sub(int a, int b){
        return a - b;
    }
    // now a devide method with java exception handlings and try and catching

    public double div(int a, int b) {
        try {                             //so im checking weather b is a 0 if b is not 0 the division goes on normally but if it is 0 it throws an exception
            if (b == 0) {
                throw new IllegalArgumentException();
            }
            return (double) a / b;

        } catch (IllegalArgumentException e) {
            System.out.println("You cant divide by 0! Enter valid inputs.");
            return 0;
        }
    }

        //now for multiplication, same concept but ill check weather both the variables are equal to 0 with an ||(or) operator
        public int mult(int a , int b){
            try{
                if (a == 0 || b == 0){
                    throw new InvalidInputException();
                }
                return a * b;
            } catch (InvalidInputException e) {
                System.out.println("You cant multiply by 0! Enter a valid input");
                return 0;
            }
        }

    }

