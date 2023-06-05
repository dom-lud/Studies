package Zadanie7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Walec walec = new Walec();

        System.out.println("Podaj promień walca:");
        walec.promien = in.nextDouble();
        System.out.println("Podaj wysokość walca:");
        walec.wysokosc = in.nextDouble();
        walec.displayObjetosc();
    }
}