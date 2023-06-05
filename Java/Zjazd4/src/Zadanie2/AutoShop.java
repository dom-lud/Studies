package Zadanie2;

public class AutoShop {
    public static void main(String[] args) {
        Sedan sedan = new Sedan(200, 20000, "red", 25);
        System.out.println(sedan.getPurchaseInfo() + sedan.getSalePrice());

        Ford ford1 = new Ford(180, 30000, "blue", 2018, 2000);
        System.out.println(ford1.getPurchaseInfo() + ford1.getSalePrice());

        Ford ford2 = new Ford(200, 35000, "black", 2021, 5000);
        System.out.println(ford2.getPurchaseInfo() + ford2.getSalePrice());

        Truck truck = new Truck(120, 40000, "green", 2500);
        System.out.println(truck.getPurchaseInfo() + truck.getSalePrice());
    }
}