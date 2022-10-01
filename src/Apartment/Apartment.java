package Apartment;

import java.util.Arrays;

public class Apartment {

    String apartmentNumber;
    private Room[] rooms;
    private int numRooms = 0;

    public Apartment(String aparNum, int max) {

        apartmentNumber = aparNum;

        rooms = new Room[max];

    }

    public boolean addRoom(Room room) {
        int x = rooms.length;

        if (numRooms < x) {

            rooms[numRooms] = room;

            numRooms++;
            return true;
        }

        return false;

    }

    public int getNumRooms() {

        return numRooms;
    }

    public double getArea() {

        double total = 0;

        for (int i = 0; i < numRooms; i++) {
            total += rooms[i].getArea();

        }

        return total;
    }

    public String toString() {
        Room arr[] = new Room[numRooms];

        if (numRooms == 0) {

            return apartmentNumber + "\n" + "[]";
        }

        for (int i = 0; i < numRooms; i++) {

            arr[i] = rooms[i];

        }
        return apartmentNumber + "\n" + Arrays.toString(arr);

    }
}

//    public String toString() {
//        String x = "";
//
//        for (int i = 0; i < numRooms; i++) {
//            x += rooms[i] + ",";
//
//        }
//
//        return "[" + x + "]";
//
//    }
//}
