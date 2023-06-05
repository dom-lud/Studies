package Zadanie2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Podaj imię: ");
        String imie = in.nextLine();

        System.out.println("Podaj nazwisko: ");
        String nazwisko = in.nextLine();

        System.out.println("Podaj grupę: ");
        int grupa = in.nextInt();

        in.nextLine();

        System.out.println("Podaj kierunek: ");
        String kierunek = in.nextLine();

        Osoba osoba = new Osoba();
        osoba.setImie(imie);
        osoba.setNazwisko(nazwisko);
        osoba.setGrupa(grupa);
        osoba.setKierunek(kierunek);


        System.out.println("imie: " + osoba.getImie());
        System.out.println("nazwisko: " + osoba.getNazwisko());
        System.out.println("grupa: " + osoba.getGrupa());
        System.out.println("kierunek: " + osoba.getKierunek());
    }
}