package Zadanie10;

public class PotegaDwojki {
    private int n;
    private int wynik;

    public PotegaDwojki(int n) {
        this.n = n;
        this.wynik = 1;
    }

    public void wypiszPotegi() {
        for (int i = 0; i <= n; i++) {
            System.out.println("2 do potęgi " + i + " wynosi: " + wynik);
            wynik *= 2;
        }
    }
}