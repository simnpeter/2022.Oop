package oop.labor09.lab09_2;

import java.awt.*;

public interface IDictionary {
    public static final String DICTIONARY_FILE = "C:\\Users\\SP\\IdeaProjects\\2022.Oop\\labor-09\\src\\bemenet.txt";
    public boolean add(String o);
    public boolean find(String o);
    public int size();
}
