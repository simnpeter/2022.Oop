package oop.labor04.lab4_1;

public class Person {

    private final String firstName;
    private String lastName;
    private final int birthYear;

    public Person(String firstname, String lastname, int birthyear){
        this.firstName = firstname;
        this.lastName = lastname;
        this.birthYear = birthyear;
    }
    public String getLastName() {
        return lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setLastName(String lasname){
        lastName=lasname;
    }
    public String toString(){
        return "\nName: " + getFirstName() + " " + getLastName() + "\nBirth date: " + getBirthYear();
    }
}
