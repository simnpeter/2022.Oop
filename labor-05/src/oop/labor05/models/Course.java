package oop.labor05.models;

public class Course {

    private final String name;
    private final String description;
    private final int numHours;

    public Course(String name, String description, int hours){
        this.description=description;
        this.name=name;
        this.numHours=hours;

    }

    public int getNumHours() {
        return numHours;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "name: " + name + '\n' +
                "description: " + description + '\n' +
                "numHours: " + numHours + '\n';
    }
}
