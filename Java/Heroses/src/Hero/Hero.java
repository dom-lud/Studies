package Hero;

import Modifier.ModifierAbilities;

public class Hero {
    private String name;
    private int experience;
    private int level;
    private int strength;
    private int defence;
    private int intelligence;
    private int dexterity;
    private int agility;
    private int speed;
    private ModifierAbilities modifierAbilities;
    private int points;
    private String characterClass;

    public Hero(String name, int experience, int level, int strength, int defence, int intelligence, int dexterity, int agility, int speed, int points, String characterClass) {
        this.name = name;
        this.experience = experience;
        this.level = level;
        this.strength = strength;
        this.defence = defence;
        this.intelligence = intelligence;
        this.dexterity = dexterity;
        this.agility = agility;
        this.speed = speed;
        this.modifierAbilities = new ModifierAbilities();
        this.points = points;
        this.characterClass = characterClass;
    }

    public ModifierAbilities getModifierAbilities() {
        return modifierAbilities;
    }

    public void setModifierAbilities(ModifierAbilities modifierAbilities) {
        this.modifierAbilities = modifierAbilities;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String getCharacterClass() {
        return characterClass;
    }
}

