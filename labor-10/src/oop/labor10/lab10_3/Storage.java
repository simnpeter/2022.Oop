package oop.labor10.lab10_3;

import oop.labor10.lab10_1.MyDate;
import oop.labor10.lab10_2.Employee;
import oop.labor10.lab10_2.Manager;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Storage {

    private ArrayList<Product> products;

    public Storage(String fileName) {
        products = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] items = line.split(" ");
                int id = Integer.parseInt(items[0].trim());
                String name = items[1].trim();
                int amount = Integer.parseInt(items[2].trim());
                int price = Integer.parseInt(items[3].trim());
                products.add(new Product(id, name, amount, price));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        products.sort(Product::compareTo);
    }

    public void update(String fileName){
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                //Collections.binarySearch()
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] items = line.split(" ");
                int id = Integer.parseInt(items[0].trim());
                int amount = Integer.parseInt(items[2].trim());
                //products;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
