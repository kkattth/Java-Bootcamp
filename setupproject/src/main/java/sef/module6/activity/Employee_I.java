package sef.module6.activity;


    // Extend Employee_I to Person_I
    public class Employee_I extends Person_I {


        // Attributes
        private double salary;
        private String title;

        // Behavior

        // Write default constructor. Print "I'm an Employee_I Constructor"

        public Employee_I() {
            System.out.println("I'm an Employee_I Constructor");
        }

        // Write getter for double salary

        public double getSalary() {
            return salary;
        }

        //Write setter for double salary

        public void setSalary(double salary) {
            this.salary = salary;
        }


        // Write getter for String title

        public String getTitle() {
            return title;
        }


        //  Write setter for String title

        public void setTitle(String title) {
            this.title = title;
        }

    }
