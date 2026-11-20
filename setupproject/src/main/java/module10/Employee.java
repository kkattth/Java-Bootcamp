package module10;

import java.util.ArrayList;

public class Employee extends Person {
    //Adding the necessary attributes
    private String jobTitle;
    private String company;
    private double salary;

    //Now a constructor with all the attributes
    public Employee(String name, int age, String jobTitle, String company, double salary){
        super(name, age);  // Im using super so i can initialize the attributes from person.java to employee since employee inherits the persons attributes!
        this.jobTitle = jobTitle;
        this.company = company;
        this.salary = salary;
    }
    //now a setter and getter for all the attributes

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setCompany(String company){
        this.company = company;
    }

    public String getCompany(){
        return company;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public void introduce() {
        System.out.println("My name is " + getName() + " and i am " + getAge() + " years old " + "I am work as " + getJobTitle() + " in " + getCompany() + " and my salary is " + getSalary() );
    }

    // ading a gethighestpaidemp
    public static String getHighestPaidEmp(ArrayList<Employee> empList) {
        Employee highestPaid = empList.get(0);

        for (Employee emp : empList) {
            if (emp.getSalary() > highestPaid.getSalary()) {
                highestPaid = emp;
            }
        }

        return highestPaid.getName();
    }
}
