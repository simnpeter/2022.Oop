package oop.labor09.lab09_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
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
                words.add(line);
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
    public Boolean add(String o) {
        for (String a: words) {
            if(a.equals(o)){
                return false;
            }
        }
        words.add(o);
        return true;
    }

    @Override
    public Boolean find(String o){
        for (String a: words) {
            if(a.equals(o)){
                return true;
            }
        }
        return false;
    }

    @Override
    public int size() {
        return words.size();
    }
}
