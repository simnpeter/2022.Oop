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

    public String getFirstName() {return firstName;}

    public String getLastName() {return lastName;}

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getNumAccounts() {
        return numAccounts;
    }

    public void closeAccount(String accountNumber){
        int siker=0;
        for (int i = 0; i < numAccounts; i++) {
            if(accounts[i].getAccountNumber().equals(accountNumber)){
                accounts[i] = null;
                accounts[i] = accounts[numAccounts-1];
                accounts[numAccounts-1] = null;
                --numAccounts;
                ++siker;
                break;
            }
        }
        if (siker == 0){
            System.out.println("ERROR invalid account number:" + accountNumber+ "\n");
        }
    }

    public String toString() {
        if (numAccounts==0){
            return getFirstName() + ' ' + getLastName() + "\n User do not have an account\n";
        }
        StringBuffer result = new StringBuffer();
        result.append(getFirstName() + ' ' + getLastName() + " accounts:\n");
        for (int i = 0; i < numAccounts; ++i) {
            result.append("\t" + accounts[i].toString() + "\n");
        }
        return result.toString();
    }
}

