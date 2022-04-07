package oop.labor08.lab8_1.bank;

import oop.labor08.lab8_1.customer.Customer;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<oop.labor08.lab8_1.customer.Customer> Customer = new ArrayList<>();

    public Bank(String name) {
        this.name = name;
    }

    public Customer getCustomer(int id) {
        for(Customer cus: Customer){
            if(cus.getId() == id){
                return cus;
            }
        }
        System.out.println("bajvan haver");
        return null;
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
