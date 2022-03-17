package oop.labor05.models;

import oop.labor02.date.MyDate;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;

public class Training {

    private final Course course;
    private final MyDate startDate;
    private final MyDate endDate;
    private final double pricePerStudent;
    private ArrayList<Student> enrolledStudents;

    public Training(Course course, MyDate startDate, MyDate endDate, double pricePerStudent) {
        this.course = course;
        this.startDate = startDate;
        this.endDate = endDate;
        this.pricePerStudent = pricePerStudent;
    }

    public boolean enroll(Student student){
        if(enrolledStudents.contains(student)){
            return false;
        }
        enrolledStudents.add(student);
        return true;
    }

    public Student findStudentById(String ID){
        for (Student student: this.enrolledStudents ){
            if(student.getID().equals(ID)){
                return student;
            }
        }
        return null;
    }

    public Course getCourse() {
        return course;
    }

    public int numEnrolled(){
        return enrolledStudents.size();
    }


    public void printToFile(){
        String fileName = String.format("%s_%s_%s.csv", course.getName(), startDate, endDate);
        try(PrintStream printStream = new PrintStream(fileName)) {
            printStream.println(this);
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public String toString() {
        return "course: " + course +
                "startDate: " + startDate +
                "endDate: " + endDate +
                "pricePerStudent: " + pricePerStudent +
                "enrolledStudents: " + enrolledStudents;
    }

    public void unEnroll(String ID){
        enrolledStudents.removeIf(student -> student.getID().equals(ID));
    }
}
