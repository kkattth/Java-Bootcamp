package module10;

import java.util.ArrayList;

public class EmployeeList {

    public static void main(String[] args) {

        // Making the 5 employee objects
        Employee emp1 = new Employee("Katrina", 22, "tester", "accenture", 1200);
        Employee emp2 = new Employee("Anna", 46, "Cashier", "Rimi", 900);
        Employee emp3 = new Employee("Caitlyn", 19, "Banker", "Seb bank", 3200);
        Employee emp4 = new Employee("Lois", 57, "Architect", "Firm of Architects", 8000);
        Employee emp5 = new Employee("John", 29, "Pilot", "AirBaltic", 6000);

        // making an array that stores the employee objects
        ArrayList<Employee> empList = new ArrayList<Employee>();

        // Adding all employees to the list
        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);
        empList.add(emp4);
        empList.add(emp5);

        // Printing the employee with the highest salary
        // Calling the getHighestPaidEmp method from the Employee class
        System.out.println("The employee whose salary is the highest is "
                + Employee.getHighestPaidEmp(empList));
    }
}