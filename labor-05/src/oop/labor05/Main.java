package oop.labor05;

import oop.labor02.date.MyDate;
import oop.labor05.models.Course;
import oop.labor05.models.Student;
import oop.labor05.models.Training;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n=4;
        ArrayList<Course> courses = readCourses("courses.csv");
        for (int i = 0; i < courses.size(); i++) {
            //System.out.println(courses.get(i));
        }
        for (Course cours : courses){
            //System.out.println(cours);
        }
        ArrayList<Student> students = readStudents("students.csv");
        for (Student student : students){
            //System.out.println(student);
        }
        /*Training oop = new Training(courses.get(0), new MyDate(2022, 3, 21), new MyDate(2022, 3, 25), 1500);
        //System.out.println(students.get(2));
        for(Student stud : students) {
            oop.enroll(stud);
        }
        System.out.println(oop);
        oop.printToFile();*/
        ArrayList<Training> trainings = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < n ; i++) {
            // uj trainning letrehozas
            trainings.add(new Training(courses.get(i), new MyDate(2022,3,21), new MyDate(2022,6,25), 1000+random.nextInt(2000-1000)));
            while(trainings.get(i).numEnrolled()<10){
                //random hozzaadas a traininghez
                trainings.get(i).enroll(students.get(random.nextInt(students.size())));
            }
            trainings.get(i).printToFile();
            System.out.println(trainings.get(i));
        }
        for (Student student :students){
            System.out.println(student.getLastName()+" "+student.getFirstName());
            for (int i = 0; i < n; i++) {
                if(trainings.get(i).findStudentById(student.getID())!=null){
                    System.out.println("\t"+trainings.get(i).getCourse().getName()+", "+trainings.get(i).getCourse().getDescription());
                }
            }
            System.out.println();
        }
    }

    private static ArrayList<Course> readCourses(String filename){
        ArrayList<Course> courses = new ArrayList<>();
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
        ArrayList<Student> students = new ArrayList<>();
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
