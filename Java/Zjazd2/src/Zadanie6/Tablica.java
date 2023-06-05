package Zadanie6;

public class Tablica {
    public int[][] tablica = new int[3][3];

    public void wypelnij() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablica[i][j] = i * 3 + j + 1;
            }
        }
    }

    public void wyswietl() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tablica[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void zamienWiersze() {
        int[] tmp = tablica[0];
        tablica[0] = tablica[2];
        tablica[2] = tmp;
    }
}
