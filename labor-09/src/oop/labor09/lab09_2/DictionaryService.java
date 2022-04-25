package oop.labor09.lab09_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DictionaryService {

    private IDictionary dictionary;

    public DictionaryService(DictionaryType type) {
        dictionary = DictionaryProvider.createDictionary(type);
    }

    public boolean findWord(String o){
        return dictionary.find(o);
    }

    public ArrayList<String> findWordsFile(String filename){
        ArrayList<String> noWords = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(filename))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                if(!dictionary.find(line)){
                    noWords.add(line);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return noWords;
    }
}
