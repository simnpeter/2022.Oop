package oop.labor11.labor11_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Addj meg szamokat szokozokkel elvalasztva");
        String line = scanner.nextLine();
        String[] numbers = line.split(" ");
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            try {
                sum += Double.parseDouble(numbers[i].trim());
            }
            catch (NumberFormatException e){
                System.out.println("Hibas input: '" + numbers[i] + "' nem szam");

            }
        }
        System.out.println("Az osszeg: " + sum);
    }
}
