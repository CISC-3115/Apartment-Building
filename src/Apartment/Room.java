package Apartment;

public class Room {

    private double length;
    private double width;

    public Room(double length, double width) {

        this.length = length;
        this.width = width;

    }

    public double getArea() {

        return length * width;
    }

    public String toString() {

        return length + "x" + width + " room";
    }

}
