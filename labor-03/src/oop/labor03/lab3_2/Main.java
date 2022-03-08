package oop.labor03.lab3_2;

import oop.labor03.lab3_1.BankAccount;

import java.util.Random;

public class Main {
    public static void main(String[] args){
        int i, n=5;
        Random rand = new Random();
        Customer customer1 = new Customer("Remek", "Elek");
        Customer customer2 =  new Customer("Nyomo", "Reka");
        for ( i = 1; i <=n ; i++) {
            customer1.addAccount(new BankAccount("OTP0000"+i));
            customer1.getAccount("OTP0000"+i).deposit(1+rand.nextInt(5000));
        }
        n=9;
        for ( int j=i; j<n+i ; j++) {
            if(j<10) {
                customer2.addAccount(new BankAccount("OTP0000" + j));
                customer2.getAccount("OTP0000" + j).deposit(1 + rand.nextInt(5000));
            }
            else{
                customer2.addAccount(new BankAccount("OTP000" + j));
                customer2.getAccount("OTP000" + j).deposit(1 + rand.nextInt(5000));
            }
        }

        System.out.println(customer1);
        System.out.println(customer2);

        customer1.closeAccount("OTP00001");
        customer2.closeAccount("OTP00014");

        System.out.println(customer1);
        System.out.println(customer2);

    }
}
