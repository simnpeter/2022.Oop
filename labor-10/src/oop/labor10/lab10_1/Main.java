package oop.labor10.lab10_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {
    public static void main(String[] args){
        int year = 2022, month, day;
        ArrayList<MyDate> date = new ArrayList<>();
        Random rand = new Random();
        while(date.size()<=10) {
            month = rand.nextInt(12)+1;
            day = rand.nextInt(31)+1;
            if(DateUtil.isValidDate(year, month, day)) {
                date.add(new MyDate(year, month, day));
            }
        }
        for (MyDate dat: date) {
            System.out.println(dat);
        }

        Collections.sort(date);

        System.out.println("new menet");
        for (MyDate dat: date) {
            System.out.println(dat);
        }
    }
}
