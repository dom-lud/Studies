package Zadanie4;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
public class ProgramKsiazki {
    public static void main(String[] args) {
        List<Ksiazka> ksiazki = new ArrayList<>();
        ksiazki.add(new Ebook("Harry Potter", "J.K. Rowling", 400, 2000, "PDF"));
        ksiazki.add(new KsiazkaPapierowa("Władca Pierścieni", "J.R.R. Tolkien", 1200, 1954));
        ksiazki.add(new Ebook("Metro 2033", "Dmitry Glukhovsky", 450, 2010, "EPUB"));
        ksiazki.add(new KsiazkaPapierowa("1984", "George Orwell", 328, 1949));

        // Sortowanie listy książek po tytule
        ksiazki.sort(Comparator.comparing(Ksiazka::getTytul));

        // Wypisanie posortowanej listy książek na ekranie
        System.out.println("Posortowana lista książek:");
        for (Ksiazka ksiazka : ksiazki) {
            System.out.println(ksiazka.getTytul());
        }
    }
}
