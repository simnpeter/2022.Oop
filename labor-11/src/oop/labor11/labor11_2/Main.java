package oop.labor11.labor11_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        try (Scanner scanner = new Scanner(new File("student.csv"))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                try {


                    String[] items = line.split(",");
                    String neptunId = items[0].trim();
                    String firstName = items[1].trim();
                    String lastName = items[2].trim();
                    // Convert String → int: Integer.parseInt( String)
                    int credits = Integer.parseInt(items[3].trim());
                    int birtYear = Integer.parseInt(items[4].trim());
                    int birthMonth = Integer.parseInt(items[5].trim());
                    int birtDay = Integer.parseInt(items[6].trim());

                    Student student = new Student(neptunId, firstName, lastName, credits, birtYear, birthMonth, birtDay);
                    System.out.println(student);
                }
                catch (ArrayIndexOutOfBoundsException ex){
                    System.out.println("INCOMPLETE LINE: " + line);
                }
                catch (NumberFormatException ex){
                    System.out.println("NUMBER FORMAT EXCEPTION: "+ line);
                }
                catch (InvalidDateException ex){
                    System.out.println("INVALID DATE: " + line);
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
