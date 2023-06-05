package Game;

import Hero.Archer;
import Hero.Hero;
import Hero.Knight;
import Hero.Mage;
import Services.HeroFactory;
import Services.HeroServices;

import java.util.Scanner;

public class Menu {
    HeroServices heroServices = new HeroServices();
    HeroFactory heroFactory = new HeroFactory();
    Scanner scanner = new Scanner(System.in);
    char x = '1';

    public void gra() {
        x = 0;
        Hero hero = heroFactory.createHero(DisplayHero());
        play(hero);
    }

    public String DisplayHero() {
        System.out.println("\n******Start Gry******\n");
        System.out.println("Tworzenie bohatera");
        System.out.println("1 - Mage");
        System.out.println("2 - Archer");
        System.out.println("3 - Knight");
        x = scanner.next().charAt(0);
        switch (x) {
            case '1':
                return "Mage";
            case '2':
                return "Archer";
            case '3':
                return "Knight";
            default:
                return null;
        }
    }
    public void play(Hero hero) {
        while (x != 0) {
            System.out.println("1 - Dodaj level postaci");
            System.out.println("2 - Rozdziel punkty umiejętności");
            System.out.println("3 - Wyświetl punkty umiejętności");
            System.out.println("0 - Koniec gry");
            x = scanner.next().charAt(0);
            switch (x) {
                case '1':
                    heroServices.levelUp(hero);
                    break;
                case '2':
                    heroServices.addSkillPoints(hero);
                    break;
                case '3':
                    hero.getName();
                    System.out.println("\nImię: " + hero.getName());
                    System.out.println("Klasa: " + hero.getCharacterClass());
                    heroServices.calculateModifiers(hero);
                    break;
                case '0':
                    exitGame();
                    break;
            }
        }
    }
    public void exitGame() {
        System.out.println("Koniec gry.");
        System.exit(0);
    }
}
