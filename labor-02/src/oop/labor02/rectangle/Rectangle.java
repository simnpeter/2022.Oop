package oop.labor02.rectangle;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    public double getLength(){
        return length;
    }
    public double getWidth() {
        return width;
    }
    public double area(){
        return width*length;
    }
    public double perimeter(){
        return 2*width+2*length;
    }

}
