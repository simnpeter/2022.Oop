package oop.labor03.lab3_1;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("John", "BLACK");
        customer1.setAccount(new BankAccount("OTP00001"));
        customer1.getAccount().deposit(1000);
        System.out.println(customer1);
        Customer customer2 = new Customer("Mary", "WHITE");
        customer2.setAccount(new BankAccount("OTP00002"));
        customer2.getAccount().deposit(500);
        System.out.println(customer2);
        customer2.closeAccount();
        System.out.println(customer2);
        customer2.setLastName("BLACK");
        customer2.setAccount(customer1.getAccount());
        System.out.println(customer2);
        System.out.println(customer1);



    }
}
