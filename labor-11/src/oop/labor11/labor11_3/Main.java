package oop.labor11.labor11_3;

import java.io.IOException;

public class Main {
    public static void main(String[] args){
        try {
            FileUtil.encode("C:\\Users\\SP\\IdeaProjects\\2022.Oop\\labor-11\\src\\oop\\labor11\\labor11_3\\bemenet.txt", "temp1.java");
            FileUtil.decode("temp1.java", "temp2.java");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
