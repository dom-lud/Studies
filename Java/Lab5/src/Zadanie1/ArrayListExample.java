package Zadanie1;
import java.util.ArrayList;
public class ArrayListExample {
    public static void main(String[] args) {
        long startTime = System.nanoTime();

        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 2; numbers.size() < 50; i += 2) {
            numbers.add(i);
        }

        for (int i = 0; i < numbers.size(); i++) {
            int number = numbers.get(i);
            System.out.println("Indeks: " + i + ", Liczba: " + number);
        }

        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        double seconds = (double)duration / 1_000_000_000.0;
        System.out.println("Czas operacji: " + seconds + " sekundy");
    }
}
