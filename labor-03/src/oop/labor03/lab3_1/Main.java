package oop.labor03.lab3_1;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Customer customer1 = new Customer("John", "BLACK");
        customer1.setAccount(new BankAccount("OTP00001"));

        customer1.getAccount().deposit(1500+ rand.nextInt(3000));
        System.out.println(customer1);

        Customer customer2 = new Customer("Mary", "WHITE");
        customer2.setAccount(new BankAccount("OTP00002"));

        customer2.getAccount().deposit(1+ rand.nextInt(500));
        System.out.println(customer2);
        customer2.closeAccount();
        System.out.println(customer2);
        customer2.marry(customer1);
        System.out.println(customer2);
        System.out.println(customer1);
        customer2.getAccount().withdraw(1700);
        customer1.getAccount().deposit(1+ rand.nextInt(360));
        customer2.getAccount().withdraw(1000);
        //for financial purposes John wants to divorce Mary.
        customer1.divorce(customer2);
        System.out.println(customer2);
        System.out.println(customer1);
    }
}
