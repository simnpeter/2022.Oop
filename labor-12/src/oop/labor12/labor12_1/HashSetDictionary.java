package oop.labor12.labor12_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class HashSetDictionary implements IDictionary{

    private HashSet<String> words;
    private static HashSetDictionary instance = null;

    private HashSetDictionary(){
        words = new HashSet<>();
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
            instance = new HashSetDictionary();
        }
        return instance;
    }

    @Override
    public boolean add(String o) {
        if(!find(o)){
            words.add(o);
            return true;
        }
        return false;
    }

    @Override
    public boolean find(String o){
        return words.contains(o);
    }

    @Override
    public int size() {
        return words.size();
    }
}
