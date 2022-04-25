package oop.extra03;

public class Student {
    private final String firstName;
    private String lastName;
    private final String neptunCode;
    private Major major;

    public Student(String firstName, String lastName, String neptunCode, Major major) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.neptunCode = neptunCode;
        this.major = major;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getNeptunCode() {
        return neptunCode;
    }

    public Major getMajor() {
        return major;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMajor(Major major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", neptunCode='" + neptunCode + '\'' +
                ", major=" + major +
                '}';
    }
}
