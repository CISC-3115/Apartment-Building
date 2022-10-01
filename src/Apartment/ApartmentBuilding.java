package Apartment;

class ApartmentBuilding {

    private final Apartment[] apartments;
    private int numApartments;

    public ApartmentBuilding(int max) {
        apartments = new Apartment[max];
        numApartments = 0;
    }

    public int getNumApartments() {

        return numApartments;

    }

    public boolean addApartment(Apartment apartment) {

        if (numApartments < apartments.length) {

            apartments[numApartments] = apartment;

            numApartments++;

            return true;

        }

        return false;

    }

    public double getArea() {
        double total = 0;
        int r;

        for (int i = 0; i < numApartments; i++) {

            r = apartments[i].getNumRooms();

            total += apartments[i].getArea();

        }

        return total;

    }

    public String toString() {
        String total = "";
        for (int i = 0; i < apartments.length; i++) {

            if (apartments[i] != null) {

                total += apartments[i] + "\n";
            }

        }

        return total;

    }

    public Apartment findApartmentInRange(double low, double high) {

        for (int i = 0; i < numApartments; i++) {

            if (apartments[i].getArea() >= low && apartments[i].getArea() <= high) {
                return apartments[i];

            }

        }

        return null;

    }

}
