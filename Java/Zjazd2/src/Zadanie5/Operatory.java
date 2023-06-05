package Zadanie5;

public class Operatory {
    public int x;
    public int y;
    public double w;
    public double z;

    public int m;
    public int n;
    public int o;

    public Operatory(int x, int y, double w, double z, int m, int n, int o)
    {
        this.x = x;
        this.y = y;
        this.w = w;
        this.z = z;
        this.m = m;
        this.n = n;
        this.o = o;
    }

    public int Inkrementacja1(){
        return ++x;
    }
    public int Inkrementacja2(){
        return y++;
    }
    public int Dekrementacja1(){
        return --x;
    }
    public int Dekrementacja2(){
        return y--;
    }
    public double Dodawanie(){
        return w+z;
    }
    public double Odejmowanie(){
        return w-z;
    }
    public double Mnozenie(){
        double wynik = w*z;
        double wynikZaokraglony = Math.round(wynik * 1000) / 1000.0;
        return wynikZaokraglony;
    }
    public double Dzielenie(){
        double wynik = w/z;
        double wynikZaokraglony = Math.round(wynik * 10000000.0) / 10000000.0;
        return wynikZaokraglony;
    }
    public double Modulo(){
        return w%z;
    }
    public boolean mniejsze(){
        return m<n;
    }
    public boolean wieksze(){
        return m>n;
    }
    public boolean mniejszerowne(){
        return m<=n;
    }
    public boolean wiekszerowne(){
        return m>=n;
    }
    public boolean rowne(){
        return m==n;
    }
    public boolean nierowne(){
        return m!=n;
    }
    public void Inkrementacja(){
        System.out.println("x = "+x);
        System.out.println("y = "+y);
        System.out.println("++x = "+Inkrementacja1());
        System.out.println("y++ = "+Inkrementacja2());
        System.out.println("x = "+x);
        System.out.println("y = "+y);
        System.out.println("~~~~~~~~~~~~");
    }

    public void Dekrementacja(){
        System.out.println("x = "+x);
        System.out.println("y = "+y);
        System.out.println("--x = "+Dekrementacja1());
        System.out.println("y-- = "+Dekrementacja2());
        System.out.println("x = "+x);
        System.out.println("y = "+y);
        System.out.println("~~~~~~~~~~~~");
    }

    public void Arytmetyczne(){
        System.out.println("w = "+w);
        System.out.println("z = "+z);
        System.out.println("w + z = "+Dodawanie());
        System.out.println("w - z = "+Odejmowanie());
        System.out.println("w * z = "+Mnozenie());
        System.out.println("w / z = "+Dzielenie());
        System.out.println("w % z = "+Modulo());
        System.out.println("~~~~~~~~~~~~");
    }
    public void Relacje(){
        System.out.println("m = "+m);
        System.out.println("n = "+n);
        System.out.println("o = "+o+"\n");
        System.out.println("m < n = "+mniejsze());
        System.out.println("m > n = "+wieksze());
        System.out.println("m ≤ n = "+mniejszerowne());
        System.out.println("m ≥ n = "+wiekszerowne());
        System.out.println("m == n ="+rowne());
        System.out.println("m ≠ n ="+nierowne());
        System.out.println("~~~~~~~~~~~~");
    }
}
