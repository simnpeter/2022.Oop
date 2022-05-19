package oop.labor12.labor12_2;

public class Main {
    public static void main(String[] args){
        long startTime = System.nanoTime();
        Storage storage = new Storage("data1000000.txt");
        storage.update("update1000000.txt");;
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        double durationInSec = (double) duration/1_000_000_000;
        System.out.println("Execution time: " + duration);
        System.out.println("Execution time in seconds: " + durationInSec);
    }
}
