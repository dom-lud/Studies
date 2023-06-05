package Zadanie12;

public class Vehicle2 {
    private int passengers;
    private int fuelcap;
    private double lkm;

    public Vehicle2(int p, int f, double l) {
        passengers = p;
        fuelcap = f;
        lkm = l;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public int getFuelcap() {
        return fuelcap;
    }

    public void setFuelcap(int fuelcap) {
        this.fuelcap = fuelcap;
    }

    public double getLkm() {
        return lkm;
    }

    public void setLkm(double lkm) {
        this.lkm = lkm;
    }

    public void range() {
        double range = (fuelcap / lkm) * 100;
        System.out.print("Zasięg (km): " + range);
    }
}