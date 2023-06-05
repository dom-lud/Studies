package Zadanie3;
import java.util.Iterator;
import java.util.List;
public class CoffeePrinter {
    public static void printList(List<String> coffeeList) {
        for (String coffee : coffeeList) {
            System.out.println(coffee);
        }
    }

    public static void printWithIterator(List<String> coffeeList) {
        Iterator<String> iterator = coffeeList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void printUppercase(List<String> coffeeList) {
        for (String coffee : coffeeList) {
            System.out.println(coffee.toUpperCase());
        }
    }

    public static void printFirstFourLetters(List<String> coffeeList) {
        for (String coffee : coffeeList) {
            if (coffee.length() >= 4) {
                System.out.println(coffee.substring(0, 4));
            } else {
                System.out.println(coffee);
            }
        }
    }
}
