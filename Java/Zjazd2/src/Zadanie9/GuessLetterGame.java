package Zadanie9;

import java.io.IOException;

public class GuessLetterGame {
    public char guessedLetter;
    public char randomLetter;

    public GuessLetterGame() {
        int randomAscii = (int) (Math.random() * 41 + 97);
        randomLetter = (char) randomAscii;
    }

    public void play() {
        System.out.print("Pomyślałem literę z przedziału od A do Z.\nOdgadnij ją: ");
        try {
            int input = System.in.read();
            guessedLetter = (char) input;
            if (guessedLetter >= 'A' && guessedLetter <= 'Z') {
                if (guessedLetter == randomLetter) {
                    System.out.println("Dobrze!");
                } else if (randomLetter > input) {
                    System.out.println("Trafiłeś zbyt wysoko!");
                } else if (randomLetter  < input) {
                    System.out.println("Trafiłeś za nisko!");
                }
            } else {
                System.out.print("Pomyślałem literę z przedziału od A do Z.\nOdgadnij ją: ");
            }
        } catch (IOException e) {
            System.out.println("Wystąpił błąd wejścia/wyjścia");
            e.printStackTrace();
        }
    }
}