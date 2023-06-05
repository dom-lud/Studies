package Zadanie3;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetOperations {
    public static void main(String[] args) {
        // a. Tworzenie drzewa TreeSet i dodawanie pięciu nazw kolorów
        TreeSet<String> tree1 = new TreeSet<>();
        tree1.add("Red");
        tree1.add("Green");
        tree1.add("Blue");
        tree1.add("Yellow");
        tree1.add("Purple");

        // b. Iterowanie po wszystkich elementach drzewa i wypisywanie ich na ekran
        System.out.println("Elementy drzewa tree1:");
        Iterator<String> iterator = tree1.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // c. Tworzenie drugiego drzewa i dodawanie do niego trzech nazw kolorów
        TreeSet<String> tree2 = new TreeSet<>();
        tree2.add("Orange");
        tree2.add("White");
        tree2.add("Black");

        // Wypisywanie elementów drzewa tree2 na ekran
        System.out.println("\nElementy drzewa tree2:");
        for (String color : tree2) {
            System.out.println(color);
        }

        // Dodawanie elementów z drzewa tree2 do drzewa tree1
        tree1.addAll(tree2);

        // Wypisywanie elementów drzewa tree1 po dodaniu elementów z tree2
        System.out.println("\nElementy drzewa tree1 po dodaniu elementów z tree2:");
        for (String color : tree1) {
            System.out.println(color);
        }

        // d. Wypisywanie elementów z drzewa tree1 w odwrotnej kolejności
        System.out.println("\nElementy drzewa tree1 w odwrotnej kolejności:");
        Iterator<String> descendingIterator = tree1.descendingIterator();
        while (descendingIterator.hasNext()) {
            System.out.println(descendingIterator.next());
        }

        // e. Wypisywanie pierwszego i ostatniego elementu z drzewa tree1
        System.out.println("\nPierwszy element drzewa tree1: " + tree1.first());
        System.out.println("Ostatni element drzewa tree1: " + tree1.last());

        // f. Klonowanie drzewa tree1 do tree3
        TreeSet<String> tree3 = new TreeSet<>(tree1);

        // g. Wypisywanie liczby elementów przechowywanych w drzewie tree1
        System.out.println("\nLiczba elementów w drzewie tree1: " + tree1.size());

        // h. Porównywanie elementów drzewa tree1 i tree2
        System.out.println("\nPorównywanie elementów drzewa tree1 i tree2:");
        System.out.println("Czy drzewa tree1 i tree2 są równe? " + tree1.equals(tree2));
    }
}