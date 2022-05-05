package oop.labor10.lab10_2;

import oop.labor10.lab10_1.MyDate;

import java.util.Objects;

public class Employee {
    private final int ID;
    private final String firstName;
    private String lastName;
    private double salary;
    private final MyDate birthDate;
    private static int counter = 0;

    public Employee(String firstName, String lastName, double salary, MyDate birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.birthDate = birthDate;
        this.ID = ++counter;
    }

    public int getID() {
        return ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getSalary() {
        return salary;
    }

    public MyDate getBirthDate() {
        return birthDate;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return ID == employee.ID;
    }

    @Override
    public String toString() {
        return "ID:" + ID +
                "\nfirstName:" + firstName +
                "\nlastName:" + lastName +
                "\nsalary:" + salary +
                "\nbirthDate:" + birthDate;
    }
}
