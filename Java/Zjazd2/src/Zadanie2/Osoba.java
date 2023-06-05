package Zadanie2;

public class Osoba {
    public String imie;
    public String nazwisko;
    public int grupa;
    public String kierunek;

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }
    public void setGrupa(int grupa) {
        this.grupa = grupa;
    }

    public void setKierunek(String kierunek) {
        this.kierunek = kierunek;
    }

    public String getImie() {
        return this.imie;
    }

    public String getNazwisko() {
        return this.nazwisko;
    }
    public int getGrupa() {
        return this.grupa;
    }

    public String getKierunek() {
        return this.kierunek;
    }

}