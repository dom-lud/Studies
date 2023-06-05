package Zadanie12;

public class VehicleProg2 {
    public static void main(String[] args) {
        Vehicle2 miniVan = new Vehicle2(7, 60, 8);
        Vehicle2 sportsCar = new Vehicle2(2, 12, 40);

        System.out.print("Minivan przewozi " + miniVan.getPassengers() + " osób.\n");
        miniVan.range();
        System.out.print("\nAuto sportowe przewozi " + sportsCar.getPassengers() + " osób.\n");
        sportsCar.range();
    }
}