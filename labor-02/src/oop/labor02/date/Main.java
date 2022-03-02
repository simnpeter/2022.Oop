package oop.labor02.date;

import java.util.Random;

public class Main {
    public static void main(String[] args){
        int hiba=0, year, month, day;
        MyDate date[] = new MyDate[1000];
        Random rand = new Random();
        for (int i = 0; i < 1000 ; i++) {
            year =  1500 + rand.nextInt(2022-1500);
            month = 1 + rand.nextInt(13-1);
            day = 1 + rand.nextInt(28);
            date[i] = new MyDate(year, month, day);
            if(DateUtil.isValidDate(year, month, day)) {
                System.out.println(date[i].getYear());
                System.out.println(date[i].getMonth());
                System.out.println(date[i].getDay());
                System.out.println(date[i].toString() + "\n");
            }
            else{
                ++hiba;
            }
        }
        System.out.println(hiba);
    }
}
