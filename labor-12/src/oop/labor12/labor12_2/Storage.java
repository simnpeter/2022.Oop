package oop.labor12.labor12_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Storage {

    private HashMap<Integer, Product> products;

    public Storage(String fileName) {
        products = new HashMap<>();
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
                products.put(id, new Product(id, name, amount, price));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void update(String fileName){
        int updatenum = 0;
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] items = line.split(" ");
                int id = Integer.parseInt(items[0].trim());
                int amount = Integer.parseInt(items[1].trim());
                if(products.get(id) != null){
                    products.get(id).increaseAmount(amount);
                    ++updatenum;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Number of updated products: "+ updatenum);
    }
}
