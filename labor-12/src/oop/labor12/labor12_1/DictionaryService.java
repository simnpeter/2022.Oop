package oop.labor12.labor12_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Locale;
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
        try(Scanner scanner = new Scanner(new File(filename))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] items = line.split("[,\\ \\:\\;\\.]");
                for (String item: items) {
                    if(!dictionary.find(item.toLowerCase(Locale.ROOT).trim())){
                        noWords.add(item.trim());
                    }
                }

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return noWords;
    }
}
