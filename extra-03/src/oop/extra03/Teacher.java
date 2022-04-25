package oop.extra03;

public class Teacher {

    public static int currentNumberOfTeachers = 0;

    private String lastName;
    private final String firstName;
    private Degree degree;
    private final int teacherID;
    private Department department;

    public Teacher(String lastName, String firstName, Degree degree, Department department) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.degree = degree;
        this.department = department;
        this.teacherID = ++currentNumberOfTeachers;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public Degree getDegree() {
        return degree;
    }

    public int getTeacherID() {
        return teacherID;
    }

    public Department getDepartment() {
        return department;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDegree(Degree degree) {
        this.degree = degree;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", degree=" + degree +
                ", teacherID=" + teacherID +
                ", department=" + department +
                '}';
    }
}
