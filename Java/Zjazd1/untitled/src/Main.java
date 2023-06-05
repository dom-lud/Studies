import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Zadanie 1

        System.out.println("Zadanie 1");
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        double wynik = a * b;
        System.out.println(wynik);

        //Zadanie 2

        System.out.println("Zadanie 2");
        double pi = Math.PI;
        double pierwiastek = Math.sqrt(pi);
        DecimalFormat df1 = new DecimalFormat("#.##");

        String number1Formatted = df1.format(pierwiastek);
        System.out.println("Pierwiastek kwadratowy z liczby pi wynosi "+ number1Formatted);

        //Zadanie 3

        System.out.println("Zadanie 3");
        String napis1 = in.next();
        String napis2 = in.next();

        System.out.println("\"%"+napis2+" "+napis1+"%\"");

        //Zadanie 4

        System.out.println("Zadanie 4");
        int bok_a=in.nextInt();
        int bok_b= in.nextInt();
        int bok_c= in.nextInt();
        if(bok_a>=0 && bok_b >=0 && bok_c >=0) {
            if (bok_a + bok_b > bok_c) {
                if (bok_a + bok_c > bok_b) {
                    if (bok_c + bok_b > bok_a) {
                        System.out.println("TAK");
                    }
                }
            }
            else System.out.println("NIE");
        }
        else System.out.println("BŁĄD");

        //Zadanie 5

        System.out.println("Zadanie 5");

        int miesiac = in.nextInt();
        switch (miesiac) {
            case 1:
                System.out.println("Styczen: 31 dni");
                break;
            case 2:
                System.out.println("Luty: 28 dni");
                break;
            case 3:
                System.out.println("Marzec: 31 dni");
                break;
            case 4:
                System.out.println("Kwiecien: 30 dni");
                break;
            case 5:
                System.out.println("Maj: 31 dni");
                break;
            case 6:
                System.out.println("Czerwiec: 30 dni");
                break;
            case 7:
                System.out.println("Lipiec: 31 dni");
                break;
            case 8:
                System.out.println("Sierpień: 30 dni");
                break;
            case 9:
                System.out.println("Wrzesień: 31 dni");
                break;
            case 10:
                System.out.println("Październik: 30 dni");
                break;
            case 11:
                System.out.println("Listopad: 30 dni");
                break;
            case 12:
                System.out.println("Grudzien: 31 dni");
                break;
            default:
                System.out.println("BŁĄD");
        }

        //Zadanie 6

        System.out.println("Zadanie 6");

        double liczba_1 = in.nextDouble();
        double liczba_2 = in.nextDouble();
        double liczba_3 = in.nextDouble();

        if (liczba_1 > liczba_2) {
            double cnt = liczba_1;
            liczba_1 = liczba_2;
            liczba_2 = cnt;
        }
        if (liczba_2 > liczba_3) {
            double cnt = liczba_2;
            liczba_2 = liczba_3;
            liczba_3 = cnt;
        }
        if (liczba_1 > liczba_2) {
            double cnt = liczba_1;
            liczba_1 = liczba_2;
            liczba_2 = cnt;
        }

        System.out.printf("%.6f %.6f %.6f\n", liczba_3, liczba_2, liczba_1);
        System.out.printf("%.6f %.6f %.6f\n", liczba_1, liczba_2, liczba_3);

        //Zadanie 7

        System.out.println("Zadanie 7");

        int n = in.nextInt();
        int m = in.nextInt();
        int iloczynskalarny = 0;

        int[] A = new int[n];
        int[] B = new int[m];

        for(int i =0; i<n;i++)
        {
            A[i] = in.nextInt();
        }

        for (int i=0; i<m;i++)
        {
            B[i] = in.nextInt();
        }

        for(int i=0; i<Math.min(m,n);i++)
        {
            iloczynskalarny+= A[i]*B[i];
        }

        System.out.println("Iloczyn skalarny wynosi: "+iloczynskalarny);
        //Jeśli n jest mniejsze od m, to iloczyn skalarny jest liczony tylko dla pierwszych n elementów drugiej tablicy.
        //Gdy m jest mniejsze od n, to iloczyn skalarny jest liczony tylko dla pierwszych m elementów pierwszej tablicy.

        //Zadanie 8

        System.out.println("Zadanie 8");

        int x = in.nextInt();

        while (x <= 0) {
            System.out.print("Podaj liczbę naturalną n większą od zera: ");
            if (in.hasNextInt()) {
                x = in.nextInt();
            } else {
                in.next();
            }
        }

        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = x; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <= x; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = x; i >= 1; i--) {
            for (int j = i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int j = x; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        //Zadanie 9

        System.out.println("Zadanie 9");

        char[] chars = new char[100];
        int p = 0;
        while (in.hasNextLine() && p < chars.length) {
            String line = in.nextLine();
            char[] lineChars = line.toCharArray();
            for (char c : lineChars) {
                chars[p] = c;
                p++;
                if (p == chars.length) {
                    break;
                }
            }
        }
        if (Palindrom(chars)) {
            System.out.println("TAK");
        } else {
            System.out.println("NIE");
        }

        //Zadanie 10

        System.out.println("Zadanie 10");

        int wiersz = in.nextInt();
        int kolumna = in.nextInt();

        if (wiersz <= 0 || kolumna <= 0) {
            System.out.println("BŁĄD");
            return;
        }

        int[][] ab = new int[wiersz][kolumna];

        for(int i=0; i<wiersz; i++)
        {
            for(int j=0;j<kolumna;j++)
            {
                ab[i][j] = in.nextInt();
            }
        }
        for(int i=0;i<kolumna;i++)
        {
            for(int j=0;j<wiersz; j++)
                System.out.print(ab[j][i]+" ");
            System.out.println();
        }

        //Zadanie 11

        System.out.println("Zadanie 11");

        String wejscie = in.nextLine();
        boolean isPangram = Pangram(wejscie);
        if (isPangram) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        //Zadanie 12

        System.out.println("Zadanie 12");

        long wiek = in.nextInt();
        String planeta = in.next();
        System.out.println(ile_lat(wiek,planeta));

        //Zadanie 13

        System.out.println("Zadanie 13");

        int ilosc = in.nextInt();
        int[] max = new int[ilosc];

        for(int i = 0; i<ilosc;i++)
        {
            max[i] = in.nextInt();
        }
        System.out.println(max(max, max.length - 1 ));

        //Zadanie 14

        //Kompilacja programu -> Javac Main.java, a uruchomienie -> java Main.class

    }
    //Funkcja do zadania 13

    public static int max(int[] max, int index){
        if(index == 0)
        {
            return max[0];
        }
        else
        {
            int aktualnyElement = max[index];
            int poprzedniNajwiekszy = max(max, index - 1);
            return aktualnyElement > poprzedniNajwiekszy ? aktualnyElement : poprzedniNajwiekszy;
        }
    }


    //Funkcja do zadania 9
    public static boolean Palindrom(char[] chars){
        int q = 0, r = chars.length - 1;
        while (q < r) {
            if (chars[q] != chars[r]) {
                return false;
            }
            q++;
            r--;
        }
        return true;
    }

    //Funkcja do zadania 11
    public static boolean Pangram(String str) {
        boolean[] czy_byla_ltiera = new boolean[26];
        int index = 0;
        for (int i = 0; i < str.length(); i++) {
            if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z') {
                index = str.charAt(i) - 'A';
            } else if ('a' <= str.charAt(i) && str.charAt(i) <= 'z') {
                index = str.charAt(i) - 'a';
            } else {
                continue;
            }
            czy_byla_ltiera[index] = true;
        }
        for (int i = 0; i < 26; i++) {
            if (!czy_byla_ltiera[i]) {
                return false;
            }
        }
        return true;
    }

    //Funkcja do zadania 12

    public static String ile_lat(long wiek, String planeta) {
        String[] tab = {"Ziemia", "Merkury", "Wenus", "Mars", "Jowisz", "Saturn", "Uran", "Neptun"};
        long[] sekundy = {31557600, 7602461L, 19417329L, 59371057L, 374335777L, 929864596L, 2654879270L, 5204667110L};
        String wynik1 = "";

        for (int i = 0; i < tab.length; i++) {
            if (planeta.equals(tab[i])) {
                double wynik = (double) wiek / sekundy[i];
                DecimalFormat asd = new DecimalFormat("#.##");
                wynik1 = asd.format(wynik);
            }
        }

        return wynik1;
    }
}