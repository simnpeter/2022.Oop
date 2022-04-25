package oop.extra02;

public class Car {

    private final String carType;
    private int numberOfKilometres;
    private final int yearOfManufacture;
    private final String carBrand;
    private final int maxPassengers;
    private int speed;
    private Color color;
    private final FuelType fuelType;

    public Car(String carBrand, String carType, Color color, FuelType fuelType, int numberOdKilometres, int maxPassengers, int yearOfManufacture){
        this.carType = carType;
        this.carBrand = carBrand;
        this.color = color;
        this.fuelType = fuelType;
        this.numberOfKilometres = numberOdKilometres;
        this.maxPassengers = maxPassengers;
        this.yearOfManufacture = yearOfManufacture;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Car(String carBrand, String carType, int type, boolean family, int year){
        this.carBrand = carBrand;
        this.carType = carType;
        switch (type){
            case 0:
                this.fuelType = FuelType.DIESEL;
                break;
            case 1:
                this.fuelType = FuelType.PETROL;
                break;
            case 2:
                this.fuelType =  FuelType.GAS;
                break;
            case 3:
                this.fuelType = FuelType.ELECTRIC;
                break;
            default:
                this.fuelType = FuelType.HYBRID;
                break;
        }
        if(family){
            this.maxPassengers = 5;
        }
        else {
            this.maxPassengers = 2;
        }
        this.yearOfManufacture = year;
        this.numberOfKilometres = 0;
        this.speed = 0;
        switch (carBrand.charAt(0)){
            case 'R':
                this.color = Color.RED;
                break;
            case 'G':
                this.color = Color.GREEN;
                break;
            case 'B':
                this.color = Color.BLUE;
                break;
            case 'W':
                this.color = Color.WHITE;
                break;
            default:
                this.color = Color.BLACK;
                break;
        }

    }

    public void changeSpeed(int speedIndicator){
        if(this.speed + speedIndicator >= 0){
            this.speed += speedIndicator;
        }
    }

    public void moveCar(int km){
        if(km >= 0){
            this.numberOfKilometres += km;
            if(this.numberOfKilometres >=200){
                resetMileage();
            }
        }
    }

    public void resetMileage(){
        this.numberOfKilometres = 0;
    }

    public String getCarType() {
        return carType;
    }

    public int getNumberOdKilometres() {
        return numberOfKilometres;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public int getSpeed() {
        return speed;
    }

    public Color getColor() {
        return color;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        string.append(carBrand + " " + carType);
        if(maxPassengers == 5){
            string.append(" family car, manufactured in " + yearOfManufacture + ".");
        }
        else {
            string.append(" two-seater, manufactured in " + yearOfManufacture + ".");
        }
        string.append("\n\tProperties:\n\t\t-COLOR: " + color + "\n\t\t-FUEL: " + fuelType + "\n\t\t-KMs traveled: " + numberOfKilometres);
        return string.toString();
    }
}
