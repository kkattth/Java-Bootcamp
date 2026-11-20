package module10;

public class Students extends Person {
    private String schoolName;

    //now a constructor!
    public Students(int age, String name, String schoolName){
        super(name,age); //again adding the super to initialize the attributes from person.java easier
        this.schoolName = schoolName;
    }
    //getter and setter

    public void setSchoolName(String schoolName){
        this.schoolName = schoolName;
    }

    public String getSchoolName() {
        return schoolName;
    }
    //Now overriding the introduce method from person!


    @Override
    public void introduce() {
        System.out.println("I am study in university " + getSchoolName());
    }
}
