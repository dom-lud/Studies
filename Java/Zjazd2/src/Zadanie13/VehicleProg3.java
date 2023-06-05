package Zadanie13;

public class VehicleProg3 {
    public static void main(String[] args) {
        Vehicle3 miniVan = new Vehicle3(7, 60, 8);
        Vehicle3 sportsCar = new Vehicle3(2, 12, 40);

        System.out.println("Minivan przewozi " + miniVan.getPassengers() + " osób na odległość do " + miniVan.range()+" kilometrów");
        System.out.println("Auto sportowe przewozi " + sportsCar.getPassengers() + " osób na odległość do " + sportsCar.range()+" kilometrów");
    }
}
