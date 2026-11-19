
package sef.module7.activity;

public class CustomExceptionActivityTest {

    public static void main(String[] args) {
        CustomExceptionActivityTest a = new CustomExceptionActivityTest();

        a.validateUser("John");
        a.validateUser("Mike");
        a.validateUser("Shanti");
        a.validateUser("Stacie");
        a.validateUser("Alex");
    }

    void validateUser(String name) {

        String[] validUsers = {"John", "Mike", "Shanti", "Stacie"};

        int flag = 0;

        try {
            for (int i = 0; i < 4; i++) {
                if (validUsers[i].equals(name)) {
                    flag = 1;
                }
            }

            if (flag == 0) {
                throw new CustomExceptionActivity();
            }

            System.out.println("Welcome to Payroll program");

        } catch (CustomExceptionActivity e) {
            System.out.println(e.getMessage());
        }
    }
}
