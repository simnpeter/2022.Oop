package oop.labor03.lab3_1;

public class Customer {

    private final String firstName;
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

    public void setLastName(String lastName1) {
        lastName = lastName1;
    }

    public void closeAccount(){
        account=null;
    }

    public String toString(){
        if(account==null){
            return firstName + " " + lastName + "\n" + "This person do not have an account\n";
        }
        return firstName + " " + lastName + "\n" + account + "\n";
    }

    public void divorce(Customer customer){
        System.out.println(firstName + " divorced " + customer.firstName + "\n");
        customer.closeAccount();
        customer.setLastName("WHITE");
    }

    public void marry(Customer customer){
        System.out.println(firstName + " married " + customer.firstName + "\n");
        setAccount(customer.getAccount());
        setLastName(customer.lastName);
    }
}

