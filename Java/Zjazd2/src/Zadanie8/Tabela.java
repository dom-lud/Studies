package Zadanie8;

public class Tabela {
    public boolean p;
    public boolean q;
    public boolean and;
    public boolean or;
    public boolean xor;
    public boolean notP;
    public boolean notQ;

    public Tabela(boolean p, boolean q) {
        this.p = p;
        this.q = q;
        this.and = p && q;
        this.or = p || q;
        this.xor = p ^ q;
        this.notP = !p;
        this.notQ = !q;
    }

    public void WypiszWiersz() {
        System.out.printf("%-8s %-8s %-8s %-8s %-8s %-8s %-8s%n", p, q, and, or, xor, notP, notQ);
    }
}
