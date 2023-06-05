package Services;

import Hero.Archer;
import Hero.Hero;
import Hero.Knight;
import Hero.Mage;

import java.util.Scanner;

public class HeroFactory {
    public Hero createHero(String characterClass) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj imię bohatera: ");
        String name = scanner.next();
        Hero hero = null;
        switch (characterClass) {
            case "Mage":
                hero = new Mage(name, 0, 0, 1, 1, 1, 1, 1, 1, 0, "Mage");
                return hero;
            case "Archer":
                hero = new Archer(name, 0, 0, 1, 1, 1, 1, 1, 1, 0, "Archer");
                return hero;
            case "Knight":
                hero = new Knight(name, 0, 0, 1, 1, 1, 1, 1, 1, 0, "Knight");
                return hero;
        }
        return hero;
    }
}
