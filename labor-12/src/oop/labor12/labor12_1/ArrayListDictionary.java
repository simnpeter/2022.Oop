package oop.labor12.labor12_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListDictionary implements IDictionary{

    private ArrayList<String> words;
    private static ArrayListDictionary instance = null;

    private ArrayListDictionary(){
        words = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(DICTIONARY_FILE))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                words.add(line.trim());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static IDictionary newInstance(){
        if (instance == null){
            instance = new ArrayListDictionary();
        }
        return instance;
    }

    @Override
    public boolean add(String o) {
        if(!find(o)){
            words.add(o);
            Collections.sort(words);
            return true;
        }
        return false;
    }

    @Override
    public boolean find(String o){
        return Collections.binarySearch(words, o) >= 0;
    }

    @Override
    public int size() {
        return words.size();
    }
}
