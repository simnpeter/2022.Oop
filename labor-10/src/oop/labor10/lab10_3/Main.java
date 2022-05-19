package oop.labor10.lab10_3;

public class Main {
    public static void main(String[] args) {
        /*int testCounter = 0;
        long startTime = System.nanoTime();
        testCounter++;
        System.out.println("Test: " + testCounter);
        Storage storage = new Storage("data1000.txt");
        storage.update("update1000.txt");;
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        double durationInSec = (double) duration/1_000_000_000;
        System.out.println("Execution time: " + duration);
        System.out.println("Execution time in seconds: " + durationInSec);

        startTime = System.nanoTime();
        testCounter++;
        System.out.println("Test: " + testCounter);
        Storage storage1 = new Storage("data1000.txt");
        storage1.update("update1000000.txt");
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        durationInSec = (double) duration/1_000_000_000;
        System.out.println("Execution time: " + duration);
        System.out.println("Execution time in seconds: " + durationInSec);

        startTime = System.nanoTime();
        testCounter++;
        System.out.println("Test: " + testCounter);
        Storage storage2 = new Storage("data1000000.txt");
        storage2.update("update1000.txt");
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        durationInSec = (double) duration/1_000_000_000;
        System.out.println("Execution time: " + duration);
        System.out.println("Execution time in seconds: " + durationInSec);
*/
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
