package oop.extra02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Random rand = new Random();
        int Diesel = 0, red = 0, first = 0, fkm = 0;
        ArrayList<Car> cars = new ArrayList<>(readCars("C:\\Users\\SP\\IdeaProjects\\2022.Oop\\extra_02\\bemenet.txt"));
        for (Car car : cars){
            System.out.println(car);
        }
        for (int k = 0; k < cars.size(); k++) {
            if(cars.get(k).getColor() == Color.RED){
                ++red;
            }
            if(cars.get(k).getFuelType() == FuelType.DIESEL){
                ++Diesel;
            }
            Scanner scanner = new Scanner(System.in);
            System.out.println("n: ");
            int n = Integer.parseInt(scanner.nextLine());
            for (int i = 0; i < n; i++) {
                int km = cars.get(k).getNumberOdKilometres();
                cars.get(k).moveCar(1 + rand.nextInt(51));
                if(km>cars.get(k).getNumberOdKilometres() && fkm == 0){
                    ++fkm;
                    System.out.println("First reset: "+k);
                }
                if(cars.get(k).getSpeed()<=180) {
                    cars.get(k).changeSpeed(10);
                }
                if(cars.get(k).getSpeed()>180 && first == 0){
                    System.out.println("Car going over 180!!" + cars.get(k).getSpeed());
                    ++first;
                }
            }
            System.out.println(cars.get(k));
        }
        System.out.println("num of red cars:"+red);
        System.out.println("num of diesel cars:" + Diesel);
    }
    private static ArrayList<Car> readCars(String filename){
        Random rand = new Random();
        ArrayList<Car> car = new ArrayList<>();
        try(Scanner scanner = new Scanner(new File(filename))){
            int n = Integer.parseInt(scanner.nextLine());
            for (int i = 0; i < n; i++) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] items = line.split(" ");
                String carType = items[0].trim();
                String carBrand = items[1].trim();
                int year = Integer.parseInt(items[2].trim());
                int fuel = rand.nextInt(4);
                boolean capacity = rand.nextBoolean();
                car.add(new Car(carBrand, carType, fuel, capacity, year));
            }
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        }
        return car;
    }
}
