package oop.labor06.lab6_1;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Customer> Customer = new ArrayList<>();

    public Bank(String name) {
        this.name = name;
    }

    public Customer getCustomer(int i) {
        return Customer.get(i);
    }

    public void addCustomer(Customer customer){
        Customer.add(customer);
    }

    public int numCustomers(){
        return Customer.size();
    }

    private void printCustomers(PrintStream printStream){
        for (Customer cust:Customer) {
            printStream.println(cust);
        }
    }

    public void printCustomersToStdOut(){
        printCustomers(System.out);
    }

    public void printCustomerToFile(String filename){
        try(PrintStream printStream = new PrintStream(filename)){
            printCustomers(printStream);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
