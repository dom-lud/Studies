package Services;

import Hero.Archer;
import Hero.Hero;
import Hero.Knight;
import Hero.Mage;
import Modifier.*;

import java.util.Scanner;

public class HeroServices {
    public void addSkillPoints(Hero hero) {
        if (hero.getPoints() == 0) {
            System.out.println("\nNie masz punktów ulepszeń umiejętności.\n");
        } else {
            int remainingPoints = hero.getPoints();
            while (remainingPoints > 0) {
                System.out.println("\nMasz " + remainingPoints + " punktów doświadczenia. Jak chcesz je rozdysponować?");
                System.out.println("1. Siła: " + hero.getStrength());
                System.out.println("2. Obrona: " + hero.getDefence());
                System.out.println("3. Intelignecja: " + hero.getIntelligence());
                System.out.println("4. Zręczność: " + hero.getDexterity());
                System.out.println("5. Zwinność: " + hero.getAgility());
                System.out.println("6. Prędkość: " + hero.getSpeed());
                Scanner scanner = new Scanner(System.in);
                int choice = scanner.nextInt();
                switch (choice) {
                    case (1):
                        hero.setStrength(hero.getStrength() + 1);
                        remainingPoints -= 1;
                        break;
                    case (2):
                        hero.setDefence(hero.getDefence() + 1);
                        remainingPoints -= 1;
                        break;
                    case (3):
                        hero.setIntelligence(hero.getIntelligence() + 1);
                        remainingPoints -= 1;
                        break;
                    case (4):
                        hero.setDexterity(hero.getDexterity() + 1);
                        remainingPoints -= 1;
                        break;
                    case (5):
                        hero.setAgility(hero.getAgility() + 1);
                        remainingPoints -= 1;
                        break;
                    case (6):
                        hero.setSpeed(hero.getSpeed() + 1);
                        remainingPoints -= 1;
                        break;
                    default:
                        System.out.println("Nieprawidłowy wybór. Proszę wybrać numer od 1 do 6.\n");
                        break;
                }
            }
        }
        hero.setPoints(0);
    }
    public void levelUp(Hero hero) {
        if (maxLevel(hero) == false) {
                hero.setLevel(hero.getLevel() + 1);
                hero.setExperience(0);
                hero.setPoints(hero.getPoints() + 10);
                System.out.println("\nTwój level: " + hero.getLevel());
        } else {
            System.out.println("Osiągnąłeś maksymalny level: " + hero.getLevel() + "\n\n");
        }
    }
    public boolean maxLevel(Hero hero) {
        if (hero.getLevel() == 100)
            return true;
        return false;
    }
    public ModifierAbilities setModifier(Hero hero) {
        ModifierAbilities modifierAbilities = hero.getModifierAbilities();
        Modifier modifier;

        if (hero instanceof Mage) {
            modifier = new MageModifier();
        } else if (hero instanceof Archer) {
            modifier = new ArcherModifier();
        } else if (hero instanceof Knight) {
            modifier = new KnightModifier();
        } else {
            return modifierAbilities;
        }
        modifier.setModifiers(modifierAbilities);
        return modifierAbilities;
    }
    public void calculateModifiers(Hero hero) {
        ModifierAbilities modifierAbilities = hero.getModifierAbilities();
        setModifier(hero);

        float resultStrength = hero.getStrength() * modifierAbilities.getStrengthModifier();
        float resultDefence = hero.getDefence() * modifierAbilities.getDefenceModifier();
        float resultIntelligence = hero.getIntelligence() * modifierAbilities.getIntelligenceModifier();
        float resultDexterity = hero.getDexterity() * modifierAbilities.getDexterityModifier();
        float resultAgility = hero.getAgility() * modifierAbilities.getAgilityModifier();
        float resultSpeed = hero.getSpeed() * modifierAbilities.getSpeedModifier();

        printModifiers(resultStrength, resultDefence, resultIntelligence, resultDexterity, resultAgility, resultSpeed);
    }
    public void printModifiers(float strength, float defence, float intelligence, float dexterity, float agility, float speed) {
        System.out.println("Siła: " + strength);
        System.out.println("Obrona: " + defence);
        System.out.println("Inteligencja: " + intelligence);
        System.out.println("Zręczność: " + dexterity);
        System.out.println("Zwinność: " + agility);
        System.out.println("Prędkość: " + speed + "\n");
    }
}
