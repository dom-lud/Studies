package Zadanie3;
import java.util.ArrayList;
import java.util.List;
public class Coffee {
    public static void main(String[] args) {
        List<String> coffeeList = createCoffeeList();

        System.out.println("Lista nazw kaw:");
        CoffeePrinter.printList(coffeeList);

        System.out.println("\nUżycie iteratora:");
        CoffeePrinter.printWithIterator(coffeeList);

        System.out.println("\nPętla foreach (duże litery):");
        CoffeePrinter.printUppercase(coffeeList);

        System.out.println("\nPierwsze 4 litery:");
        CoffeePrinter.printFirstFourLetters(coffeeList);
    }

    private static List<String> createCoffeeList() {
        List<String> coffeeList = new ArrayList<>();
        coffeeList.add("espresso");
        coffeeList.add("latte");
        coffeeList.add("cappuccino");
        coffeeList.add("mocha");
        coffeeList.add("auLait");
        coffeeList.add("macchiato");
        return coffeeList;
    }
}
