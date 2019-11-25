package Car;

import Transport.Transport;

public class Car extends Transport implements CarInterface {
    private String brand;
    private int numberOfDoors;
    private boolean poweredByElectricity;

    public Car(String type, boolean engine, int releaseDate, String brand, int numberOfDoors, boolean poweredByElectricity) {
        super(type, engine, releaseDate);
        this.brand = brand;
        this.numberOfDoors = numberOfDoors;
        this.poweredByElectricity = poweredByElectricity;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public boolean getPoweredByElectricity() {
        return poweredByElectricity;
    }

    public void setPoweredByElectricity(boolean poweredByElectricity) {
        this.poweredByElectricity = poweredByElectricity;
    }

    @Override
    public String toString() {
        return brand + " " + numberOfDoors + " " + poweredByElectricity;
    }
}
