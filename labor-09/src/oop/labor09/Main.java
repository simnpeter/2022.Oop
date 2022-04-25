package oop.labor09;

import oop.labor09.lab09_2.DictionaryService;
import oop.labor09.lab09_2.DictionaryType;
import oop.labor09.lab9.ArrayListQueue;
import oop.labor09.lab9.CircularQueue;
import oop.labor09.lab9.IQueue;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*DictionaryService service =
                new DictionaryService(DictionaryType.ARRAY_LIST);
        Scanner scanner = new Scanner(System.in);
        while( true ) {
            System.out.print("Word to find ( Enter <end> for exit): ");
            String word = scanner.nextLine();
            if( word.equalsIgnoreCase( "end")){
                break;
            }
            System.out.println(" Find(" + word + "): " + service.findWord(word));
        }
        scanner.close();*/
        DictionaryService service =
                new DictionaryService(DictionaryType.ARRAY_LIST);
        System.out.println("Unknown words from a file: ");
        System.out.println( service.findWordsFile( "C:\\Users\\SP\\IdeaProjects\\2022.Oop\\labor-09\\src\\valami.txt"));
    }
}
