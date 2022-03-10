package oop.labor04.lab4_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        readFilePrintItsLineNumbered("lab4_1_bemenet.txt");
        ArrayList<Person> persons = readFromCSVFile("lab4_1_be2.csv");
        for (int i = 0; i < persons.size(); i++) {
            System.out.println(persons.get(i));
        }
    }

    public static void readFilePrintItsLineNumbered( String fileName ){

        /*File input = new File("input.txt");
        Scanner scanner = new Scanner(input);*/
        //Scanner scanner = new Scanner(System.in);


        try (Scanner scanner = new Scanner( new File(fileName))){
            //read and process the lines
            int i = 1;
            while(scanner.hasNextLine()){
                System.out.println(i + " " + scanner.nextLine());
                ++i;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Person> readFromCSVFile(String fileName) {
        ArrayList<Person> persons = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] items = line.split(",");
                    // trim: eliminates leading and trailing spaces
                String firstName = items[0].trim();
                String lastName = items[1].trim();
                    // Convert String → int: Integer.parseInt( String)
                int birtYear = Integer.parseInt(items[2].trim());
                persons.add(new Person(firstName, lastName, birtYear));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return persons;
    }

}
