package Zadanie4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MonthNumber {
    public static void main(String[] args) {
        // Tworzenie mapy numer-miesiąc
        Map<Integer, String> monthMap = new HashMap<>();
        monthMap.put(1, "Styczeń");
        monthMap.put(2, "Luty");
        monthMap.put(3, "Marzec");
        monthMap.put(4, "Kwiecień");
        monthMap.put(5, "Maj");
        monthMap.put(6, "Czerwiec");
        monthMap.put(7, "Lipiec");
        monthMap.put(8, "Sierpień");
        monthMap.put(9, "Wrzesień");
        monthMap.put(10, "Październik");
        monthMap.put(11, "Listopad");
        monthMap.put(12, "Grudzień");

        // Pobieranie liczby od użytkownika
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj numer miesiąca (1-12): ");
        int monthNumber = scanner.nextInt();

        // Sprawdzanie czy numer mieści się w zakresie
        if (monthNumber >= 1 && monthNumber <= 12) {
            // Pobieranie nazwy miesiąca z mapy
            String monthName = monthMap.get(monthNumber);
            System.out.println("Miesiąc o numerze " + monthNumber + " to: " + monthName);
        } else {
            System.out.println("Podano nieprawidłowy numer miesiąca.");
        }
    }
}
