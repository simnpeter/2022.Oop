package oop.labor04.lab4_2;

import java.util.ArrayList;

public class Customer {

    private final String firstName;
    private String lastName;

    private ArrayList<BankAccount> accounts = new ArrayList<>();

    public Customer(String firstname, String lastname){
        this.firstName=firstname;
        this.lastName=lastname;
    }

    public void addAccount(BankAccount account){
            this.accounts.add(account);
    }

    public BankAccount getAccount(String accountNumber){
        for (BankAccount item : accounts) {
            if(item.getAccountNumber().equals(accountNumber)){
                return item;
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
        return accounts.size();
    }

    public void closeAccount(String accountNumber){
        int siker=0;
        for (BankAccount item : accounts) {
            if(item.getAccountNumber().equals(accountNumber)){
                accounts.remove(item);
                ++siker;
                break;
            }
        }
        if (siker == 0){
            System.out.println("ERROR invalid account number:" + accountNumber+ "\n");
        }
    }

    public String toString() {
        if (accounts.size()==0){
            return getFirstName() + ' ' + getLastName() + "\n User do not have an account\n";
        }
        StringBuffer result = new StringBuffer();
        result.append(getFirstName() + ' ' + getLastName() + " accounts:\n");
        for (BankAccount item : accounts) {
            result.append("\t" + item.toString() + "\n");
        }
        return result.toString();
    }
}

