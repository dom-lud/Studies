package Zadanie7;

public class Walec {
    public double promien;
    public double wysokosc;

    public double Objetosc(){
        double wynik = Math.PI * (promien*promien) * wysokosc;
        wynik = Math.round(wynik *100.0)/100.0;
        return wynik;
    }
    public void displayObjetosc(){
        System.out.print("Pojemność walca wynosi "+Objetosc());
    }
}