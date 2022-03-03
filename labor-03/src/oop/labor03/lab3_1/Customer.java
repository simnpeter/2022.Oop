package oop.labor03.lab3_1;

public class Customer {

    private String firstName;
    private String lastName;
    private BankAccount account;

    public Customer(String firstname, String lastname){
        this.firstName=firstname;
        this.lastName=lastname;
    }

    public void setAccount(BankAccount account){
        this.account = account;
    }


    public BankAccount getAccount(){
        return account;
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

    public void closeAccount(){
        this.account=null;
    }

    public String toString(){
        if(account==null){
            return this.firstName + " " + this.lastName + "\n" + "This person do not have an account";
        }
        return this.firstName + " " + this.lastName + "\n" + this.account;
    }

}

