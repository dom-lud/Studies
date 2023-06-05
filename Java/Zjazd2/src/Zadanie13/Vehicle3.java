package Zadanie13;

public class Vehicle3 {
    private int passengers;
    private int fuelcap;
    private double lkm;

    public Vehicle3(int p, int f, double l) {
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

    public double range() {
        return (fuelcap / lkm) * 100;
        }
}
