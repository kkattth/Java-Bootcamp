package module10;

public class AbstractActivity {
    public static void main(String[] args) {
        Employee employee = new Employee("Alice",22,"Artist","Museum of Riga",1200);
        Students students = new Students(18,"Robert","RTU");

        employee.introduce();
        students.introduce();
    }
}
