package oop.labor03.lab3_2;

import oop.labor03.lab3_1.BankAccount;

public class Customer {

    public static final int MAX_ACCOUNT=10;

    private final String firstName;
    private String lastName;
    private int numAccounts = 0;
    private BankAccount accounts[] = new BankAccount[ MAX_ACCOUNT ];

    public Customer(String firstname, String lastname){
        this.firstName=firstname;
        this.lastName=lastname;
    }



    public void addAccount(BankAccount account){
        if(numAccounts<MAX_ACCOUNT){
            this.accounts[numAccounts]=account;
            ++numAccounts;
        }
    }


    public BankAccount getAccount(String accountNumber){
        for (int i = 0; i < numAccounts; i++) {
            if(accounts[i].getAccountNumber().equals(accountNumber)){
                return accounts[i];
            }
        }
        return null;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getNumAccounts() {
        return numAccounts;
    }

    public void closeAccount(String accountNumber){
        for (int i = 0; i < numAccounts; i++) {
            if(accounts[i].getAccountNumber().equals(accountNumber)){
                accounts[i]=null;
                --numAccounts;
                break;
            }
        }
    }

    public String toString(String accountNumber){
        for (int i = 0; i < numAccounts; i++) {
            if(accounts[i].getAccountNumber().equals(accountNumber)){
                return this.firstName + " " + this.lastName + "\n" + this.accounts[i];
            }
        }
        return this.firstName + " " + this.lastName + "\n" + "This person do not have an account";
    }

}

