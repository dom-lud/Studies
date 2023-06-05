package Zadanie14;

public class VehicleProg4 {
    public static void main(String[] args) {
        double distance = 100;

        Vehicle4 miniVan = new Vehicle4(7, 60, 8);
        Vehicle4 sportsCar = new Vehicle4(2, 12, 40);

        System.out.println("Minivan potrzebuje " + miniVan.fuelNeeded(distance) + " litrów paliwa.");
        System.out.println("Auto sportowe potrzebuje " + sportsCar.fuelNeeded(distance) + " litrów paliwa.");
    }
}
