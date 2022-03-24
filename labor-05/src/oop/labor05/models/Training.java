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
    private ArrayList<Student> enrolledStudents = new ArrayList<>();

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
            printStream.println("\nCourse name: "+course.getName()+"\nStart Date: "+startDate+"\nEnd Date: "+endDate+
                    "\nPrice: "+pricePerStudent+"\nStudents: ");
            for (Student stud: enrolledStudents){
                printStream.println(stud);
            }
            printStream.println();
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("Training{\n").append("\t\tcourse= ").append(course.getName()).append(", description= " )
                .append(course.getDescription()).append(", numHours= ").append(course.getNumHours())
                .append("\n\t\tstartDate= ").append(startDate).append("\n\t\tendDate= ").append(endDate).append("\n");
        for (Student item : enrolledStudents) {
            result.append("\t\t\t\tID= ").append(item.getID()).append(", firstName= ").append(item.getFirstName()).append(", lastName= ").append(item.getLastName()).append("\n");
        }
        result.append("}");
        return result.toString();
    }

    public void unEnroll(String ID){
        enrolledStudents.removeIf(student -> student.getID().equals(ID));
    }
}
