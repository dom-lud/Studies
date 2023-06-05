package Zadanie11;

class VehicleProg1 {
    public static void main(String[] args) {
        Vehicle1 miniVan = new Vehicle1(7, 60, 8);
        Vehicle1 sportsCar = new Vehicle1(2, 12, 40);

        System.out.println("Minivan przewozi "+miniVan.passengers+" osób.\nZasięg (km): "+ (miniVan.fuelcap / miniVan.lkm)*100);
        System.out.println("Auto sportowe przewozi "+sportsCar.passengers+" osób.\nZasięg (km): "+ (sportsCar.fuelcap / sportsCar.lkm)*100);
    }
}