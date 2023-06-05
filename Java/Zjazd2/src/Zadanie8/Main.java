package Zadanie8;

public class Main {
    public static void main(String[] args) {
        System.out.printf("%-8s %-8s %-8s %-8s %-8s %-8s %-8s%n", "P", "Q", "AND", "OR", "XOR", "NOT P", "NOT Q");
        Tabela tabela1 = new Tabela(true, true);
        Tabela tabela2 = new Tabela(true, false);
        Tabela tabela3 = new Tabela(false, true);
        Tabela tabela4 = new Tabela(false, false);
        tabela1.WypiszWiersz();
        tabela2.WypiszWiersz();
        tabela3.WypiszWiersz();
        tabela4.WypiszWiersz();
    }
}
