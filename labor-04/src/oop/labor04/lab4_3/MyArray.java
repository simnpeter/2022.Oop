package oop.labor04.lab4_3;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MyArray {

    private int length;
    private double[] elements;

    public MyArray(int Length){
        this.length=Length;
        this.elements = new double[length];
    }
    public MyArray(MyArray Array){
        this.length=Array.length;
        this.elements = new double[length];
        System.arraycopy(Array.elements, 0, elements, 0, this.length);
    }
    public MyArray(double[] elements){
        this.length = elements.length;
        this.elements = new double[elements.length];
        System.arraycopy(elements, 0, this.elements, 0, this.length);
    }
    public MyArray(String fileName){
        File file = new File(fileName);
        try{
            Scanner scanner = new Scanner(file);
            length = scanner.nextInt();
            elements = new double[length];
            String string = scanner.nextLine();
            while (scanner.hasNextLine()){
                string = scanner.nextLine();
                String[] seged = string.split(" ");
                for (int i = 0; i < length; i++) {
                    elements[i] = Double.parseDouble(seged[i]);
                }
            }
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
    public void fillRandom(double a, double b){
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            elements[i] = a + random.nextDouble(b-a);
        }

    }
    public double mean(){
        double sum = 0;
        for (int i = 0; i < length; i++) {
            sum += elements[i];
        }
        return sum/length;
    }
    public double stddev(){
        double standardDeviation = 0;
        for (double number : elements) {
            standardDeviation += Math.pow(number - mean(), 2);
        }
        return Math.sqrt(standardDeviation/length);
    }
    public void sort(){
        Arrays.sort(elements);
    }
    public void print(String arrayName){
        System.out.printf("%s: ",arrayName);
        for (Double elem: elements) {
            System.out.printf("%7.2f ", elem);
        }
        System.out.println();
    }
}
