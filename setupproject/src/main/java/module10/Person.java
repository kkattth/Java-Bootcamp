package module10;

public abstract class Person {
    //Ill create attributes for name and age
    private int age;
    private String name;

    //Now im creating a constructor to initialize the attributes

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    //Now a setter and getter for the name attribute

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    //Now the same concept for age

    public void setAge(int age){
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    // Now ill introduce the method so I can print out the persons name and age
    public void introduce(){
        System.out.println("The name: " + name + "The age: " + age);
    }
}
