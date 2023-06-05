package Zadanie2;

import java.util.HashSet;

public class HashSetToArray {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        // Dodawanie wartości do zbioru
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Grapes");

        // Wyświetlanie zawartości zbioru
        System.out.println("Zawartość zbioru:");
        for (String value : set) {
            System.out.println(value);
        }

        // Konwersja zbioru na tablicę
        String[] array = set.toArray(new String[0]);

        // Wyświetlanie zawartości tablicy
        System.out.println("\nZawartość tablicy:");
        for (String value : array) {
            System.out.println(value);
        }
    }
}
