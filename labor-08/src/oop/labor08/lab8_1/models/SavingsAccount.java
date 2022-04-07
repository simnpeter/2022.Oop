package oop.labor08.lab8_1.models;

import oop.labor08.lab8_1.models.BankAccount;

public class SavingsAccount extends BankAccount {

    private double interestRate;

    public SavingsAccount(double interestRate) {
        //Ha a konstruktortban van valami akkor kell super hivas maskeppen automatikusan meghivodik az ős osztaly
        //super();
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }


    public void addInterest(){
        this.balance+=balance*interestRate;
    }

    @Override
    public String toString(){
        return "BankAccount:" + getAccountNumber() + "\nBalance:" + getBalance();
    }
}
