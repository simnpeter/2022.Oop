package oop.labor02.rectangle;

import java.util.Random;

public class Main {
    public static void main(String[] args){
        double totalarea=0;
        for (int i = 0; i < 10 ; i++) {
            Rectangle[] rectangles = new Rectangle[10];
            Random rand = new Random();
            double length = 1 + rand.nextInt(10);
            double width = 1 + rand.nextInt(10);
            rectangles[i] = new Rectangle(length, width);
            System.out.println(rectangles[i].getLength());
            System.out.println(rectangles[i].getWidth());
            System.out.println(rectangles[i].area());
            System.out.println(rectangles[i].perimeter()+ "\n");
            totalarea+=rectangles[i].area();
        }
        System.out.println(totalarea);
    }
}
