package oop.labor08.lab8_1.utils;


import oop.labor08.lab8_1.bank.Bank;
import oop.labor08.lab8_1.customer.Customer;
import oop.labor08.lab8_1.models.CheckingAccount;
import oop.labor08.lab8_1.models.SavingsAccount;

public class Main {
    public static void main(String[] args) {

        Bank OTP = new Bank("OTP");
        OTP.addCustomer(new Customer("Szoverfi", "Daniel"));
        OTP.addCustomer(new Customer("Szentgyorgyi", "Bernad-Krisztian"));
        for (int i = 0; i < OTP.numCustomers(); i++) {
            OTP.getCustomer(i+1).addAccount(new CheckingAccount(300));
            OTP.getCustomer(i+1).addAccount(new SavingsAccount(0.05));
        }
        OTP.getCustomer(1).getAccount("OTP0000001").deposit(1200);
        OTP.getCustomer(1).getAccount("OTP0000002").deposit(600);
        OTP.getCustomer(2).getAccount("OTP0000003").deposit(900);
        OTP.getCustomer(2).getAccount("OTP0000004").deposit(300);
        System.out.println(OTP.getCustomer(1));
        System.out.println(OTP.getCustomer(2));
        ((SavingsAccount)OTP.getCustomer(1).getAccount("OTP0000002")).addInterest();
        ((SavingsAccount)OTP.getCustomer(2).getAccount("OTP0000004")).addInterest();
        OTP.getCustomer(1).getAccount("OTP0000001").withdraw(301);
        OTP.getCustomer(2).getAccount("OTP0000003").withdraw(12001);
        System.out.println(OTP.getCustomer(1));
        System.out.println(OTP.getCustomer(2));

    }
}
