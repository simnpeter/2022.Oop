package oop.labor10.lab10_2;

import oop.labor10.lab10_1.MyDate;
import oop.labor10.lab10_2.Company;
import oop.labor10.lab10_2.Employee;
import oop.labor10.lab10_2.Manager;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        Company company = new Company("Microsoft");

        company.hire(new Manager("Patricia", "Schifler", 6000, new MyDate(2002, 3, 5), "frontend"));
        company.hire(new Employee("Robert", "Ambarus", 4000, new MyDate(2002, 4, 11)));
        company.hire(new Employee("Kinga", "Olah", 4000, new MyDate(1999, 6, 21)));
        company.hire(new Employee("Johanna", "Rigmanyi", 4000, new MyDate(200, 12, 22)));

        System.out.println("Employees");

        company.hireAll("C:\\Users\\SP\\IdeaProjects\\2022.Oop\\labor-10\\src\\oop\\labor10\\lab10_2\\employees.csv");

        company.printManager(System.out);

        company.sortByComparator(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                //return o1.getBirthDate().compareTo(o2.getBirthDate());
                //return o1.getFirstName().compareTo(o2.getFirstName());
                //return Double.compare(o2.getSalary(),o1.getSalary());
                if(o1.getClass() == o2.getClass())
                    return o1.getFirstName().compareTo(o2.getFirstName());
                else if( o1.getClass() == Manager.class)
                    return -1;
                else
                    return 1;
            }
        });
        System.out.println("Sorted");
        company.printAll(System.out);
    }
}
