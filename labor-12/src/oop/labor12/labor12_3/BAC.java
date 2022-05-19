package oop.labor12.labor12_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class BAC {

    private HashMap<Integer, Student> students;

    public BAC(String fileName) {
        students = new HashMap<>();
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] items = line.split(" ");
                int id = Integer.parseInt(items[0].trim());
                String firstName = items[1].trim();
                String lastName = items[2].trim();
                students.put(id, new Student(id, firstName, lastName));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void addMark(String filename, Subject subject){
        try (Scanner scanner = new Scanner(new File(filename))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] items = line.split(" ");
                int id = Integer.parseInt(items[0].trim());
                double mark = Double.parseDouble(items[1].trim());
                students.get(id).addMarks(mark, subject);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public HashMap<Integer, Student> getStudents() {
        return students;
    }
}
