package oop.labor06.lab6_1;

public class BankAccount {


    private double balance;
    private final String accountNumber;

    public static final String PREFIX = "OTP";
    public static final int ACCOUNT_NUMBER_LENGTH = 10;
    private static int numAccouts = 0;

    public BankAccount(){
        ++numAccouts;
        this.accountNumber = createAccountNumber();
        this.balance = 0;
    }
    public String createAccountNumber(){
        StringBuilder result = new StringBuilder();
        int length = ACCOUNT_NUMBER_LENGTH;
        length-=PREFIX.length();
        length-=Integer.toString(numAccouts).length();
        result.append(PREFIX);
        result.append("0".repeat(Math.max(0, length)));
        result.append(numAccouts);
        return result.toString();
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
