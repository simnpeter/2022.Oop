package oop.labor12.labor12_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        long startTime = System.nanoTime();
        DictionaryService service = new DictionaryService(DictionaryType.HASH_SET);
        ArrayList<String> kiir = service.findWordsFile("bible.txt");
        System.out.println("Words find: "+kiir.size());
        /*for (String s: kiir) {
            System.out.print(s+" ");
        }*/
        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;
        System.out.println("\nExecution time in milliseconds: " +
                timeElapsed / 1000000);
    }
}
