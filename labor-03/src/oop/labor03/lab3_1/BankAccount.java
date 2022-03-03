package oop.labor03.lab3_1;

public class BankAccount {


    private double balance;
    private String accountNumber;


    public BankAccount(String accountNumber){
        this.accountNumber = accountNumber;
        this.balance = 0;
    }
    public double getBalance(){
        return balance;
    }
    public String getAccountNumber(){
        return accountNumber;
    }
    public void deposit(double amount) {
        if(amount>0)
        {
            balance += amount;
        }

    }
    public boolean withdraw(double amount){
        if(amount <= balance){
            balance-=amount;
            return true;
        }
        return false;
    }
    public String toString(){
        return "BankAccount:" + getAccountNumber() + "\nBalance:" + getBalance();
    }
}
