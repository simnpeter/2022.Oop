package oop.labor04.lab4_2;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers = readFromCSVFile("lab4_2_be.csv");
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }
    public static ArrayList<Customer> readFromCSVFile(String fileName) {
        ArrayList<Customer> customers = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] items = line.split(",");
                String type = items[0].trim();
                if(type.equals("Customer")) {
                    // trim: eliminates leading and trailing spaces
                    String firstName = items[1].trim();
                    String lastName = items[2].trim();
                    customers.add(new Customer(firstName, lastName));
                }
                else if(type.equals("Account")){
                    String id = items[1].trim();
                    int money = Integer.parseInt(items[2].trim());
                    customers.get(customers.size()-1).addAccount(new BankAccount(id));
                    customers.get(customers.size()-1).getAccount(id).deposit(money);
                }
                // Convert String → int: Integer.parseInt( String)

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return customers;
    }
}
