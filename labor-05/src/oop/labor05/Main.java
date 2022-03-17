package oop.labor05;

import oop.labor02.date.MyDate;
import oop.labor05.models.Course;
import oop.labor05.models.Student;
import oop.labor05.models.Training;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Course> courses = readCourses("courses.csv");
        for (int i = 0; i < courses.size(); i++) {
            System.out.println(courses.get(i));
        }
        for (Course cours : courses){
            System.out.println(cours);
        }
        ArrayList<Student> students = readStudents("students.csv");
        for (Student student : students){
            System.out.println(student);

        }
        Training oop = new Training(courses.get(0), new MyDate(2022, 3, 21), new MyDate(2022, 3, 25), 1500);

        oop.printToFile();

        for(Course c : courses){
            // uj trainning letrehozas
            Training training = new Training();
            while(training.numEnrolled()<10){
                //random hozzaadas a traininghez
            }
            training.printToFile();
        }
    }

    private static ArrayList<Course> readCourses(String filename){
        ArrayList<Course> courses = new ArrayList<Course>();
        try(Scanner scanner = new Scanner(new File(filename))){
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] items = line.split(",");
                String name = items[0].trim();
                String description = items[1].trim();
                int numHours = Integer.parseInt(items[2].trim());
                courses.add(new Course(name, description, numHours));
            }
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        }
        return courses;
    }

    private static ArrayList<Student> readStudents(String filename){
        ArrayList<Student> students = new ArrayList<Student>();
        try(Scanner scanner = new Scanner(new File(filename))){
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] items = line.split(",");
                String ID = items[0].trim();
                String FirstName = items[1].trim();
                String LastName = items[2].trim();
                students.add(new Student(ID, FirstName, LastName));
            }
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        }
        return students;
    }
}
