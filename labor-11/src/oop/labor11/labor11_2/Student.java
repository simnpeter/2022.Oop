package oop.labor11.labor11_2;

public class Student {
    private final String neptunId;
    private final String firstName;
    private String lastName;
    private int credits;
    private final MyDate birthDate;

    public Student(String neptunId, String firstName, String lastName, int credits, int birthYear, int birthMonth, int birthDay) throws InvalidDateException {
        this.birthDate = new MyDate(birthYear, birthMonth, birthDay);
        this.neptunId = neptunId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.credits = credits;
    }

    @Override
    public String toString() {
        return "NeptunId: " + neptunId +
                "\nFirstName: " + firstName +
                "\nLastName: " + lastName +
                "\nCredits: " + credits +
                "\nBirthDate: " + birthDate;
    }
}
