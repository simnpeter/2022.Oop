package oop.labor05.models;

public class Student {

    private final String ID;
    private final String FirstName;
    private final String LastName;

    public Student(String ID, String firstName, String lastName) {
        this.ID = ID;
        FirstName = firstName;
        LastName = lastName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getID() {
        return ID;
    }

    public String getLastName() {
        return LastName;
    }

    @Override
    public String toString() {
        return  "ID: " + ID + '\n' +
                "FirstName: " + FirstName + '\n' +
                "LastName: " + LastName + '\n';
    }
}
