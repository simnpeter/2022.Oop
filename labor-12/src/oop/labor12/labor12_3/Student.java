package oop.labor12.labor12_3;

import java.util.HashSet;
import java.util.Objects;

public class Student {

    private final int id;
    private final String firstName;
    private String lastName;
    private HashSet<Mark> marks;

    public Student(int id, String firstName, String lastName) {
        this.id = id;
        this.marks = new HashSet<>();
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void addMarks(double mark, Subject subject){
        Mark newmark = new Mark(subject, mark);
        for (Mark o: marks) {
            if(o.equals(newmark)){
                return;
            }
        }
        marks.add(newmark);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double average(){
        double sum = 0;
        for (Mark o : marks) {
            sum += o.getMark();
        }
        return sum/marks.size();
    }

    public boolean passed(){
        for (Mark o : marks) {
            if(o.getMark() < 5){
                return false;
            }
        }
        return average() >= 6;
    }

    @Override
    public String toString() {
        return "firstName: " + firstName +
                "\nlastName: " + lastName + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && Objects.equals(firstName, student.firstName) && Objects.equals(lastName, student.lastName) && Objects.equals(marks, student.marks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName);
    }
}
