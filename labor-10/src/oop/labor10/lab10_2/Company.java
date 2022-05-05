package oop.labor10.lab10_2;

import oop.labor10.lab10_1.MyDate;

import java.awt.geom.AffineTransform;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.*;

public class Company {

    private String name;
    private ArrayList<Employee> employees;

    public Company(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void hire(Employee employ){
        if(!employees.contains(employ))
            employees.add(employ);
    }

    public void hireAll(String filename){
        try (Scanner scanner = new Scanner(new File(filename))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] items = line.split(",");
                String firstName = items[0].trim();
                String lastName = items[1].trim();
                double salary = Double.parseDouble(items[2].trim());
                int year = Integer.parseInt(items[3].trim());
                int month = Integer.parseInt(items[4].trim());
                int day = Integer.parseInt(items[5].trim());
                if(items.length == 7){
                    hire(new Manager(firstName, lastName, salary, new MyDate(year, month, day), items[6].trim()));
                }
                else{
                    hire(new Employee(firstName, lastName, salary, new MyDate(year, month, day)));
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void fire(int id){
        for (int i = 0; i < employees.size(); i++) {
            if(employees.get(i).getID() == id){
                employees.remove(i);
                return;
            }
        }
        System.out.println("No employee with id");
    }

    public void printAll(PrintStream printStream){
        for (Employee emp: employees) {
            printStream.println(emp+"\n");
        }
    }

    public void printManager(PrintStream printStream){
        for (Employee emp : employees) {
            if(emp.getClass() == Manager.class){
                printStream.println(emp+"\n");
            }
        }
    }

    public void sortByComparator(Comparator<Employee> employeeComparator){
        //Collections.sort(employees, employeeComparator);
        employees.sort(employeeComparator);
    }
}
