package oop.labor06.lab6_1;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        /*ArrayList<BankAccount> accounts = new ArrayList<>();
        for (int i = 0; i < 200; i++) {
            accounts.add(new BankAccount());
            if(i%2==0){
                accounts.get(i).deposit(69);
            }
        }
        for (BankAccount account:accounts) {
            System.out.println(account);
        }*/
        Random rand = new Random();
        ArrayList<Customer> Erroristak = new ArrayList<>();
        Erroristak.add(new Customer("Simo","Robert-Barna"));
        Erroristak.add(new Customer("Szoverfi","Daniel"));
        Erroristak.add(new Customer("Szentgyorgyi","Bernad-Krisztian"));
        Erroristak.add(new Customer("Simon", "Peter"));
        for (Customer Cust: Erroristak) {
            for (int i = 0; i < rand.nextInt(5); i++) {
                Cust.addAccount(new BankAccount());
            }
        }
    }
}
