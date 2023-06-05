package Modifier;

public class ModifierAbilities {
    private float StrengthModifier;
    private float IntelligenceModifier;
    private float DefenceModifier;
    private float DexterityModifier;
    private float AgilityModifier;
    private float SpeedModifier;

    public float getStrengthModifier() {
        return StrengthModifier;
    }

    public void setStrengthModifier(float strengthModifier) {
        StrengthModifier = strengthModifier;
    }

    public float getIntelligenceModifier() {
        return IntelligenceModifier;
    }

    public void setIntelligenceModifier(float intelligenceModifier) {
        IntelligenceModifier = intelligenceModifier;
    }

    public float getDefenceModifier() {
        return DefenceModifier;
    }

    public void setDefenceModifier(float defenceModifier) {
        DefenceModifier = defenceModifier;
    }

    public float getDexterityModifier() {
        return DexterityModifier;
    }

    public void setDexterityModifier(float dexterityModifier) {
        DexterityModifier = dexterityModifier;
    }

    public float getAgilityModifier() {
        return AgilityModifier;
    }

    public void setAgilityModifier(float agilityModifier) {
        AgilityModifier = agilityModifier;
    }

    public float getSpeedModifier() {
        return SpeedModifier;
    }

    public void setSpeedModifier(float speedModifier) {
        SpeedModifier = speedModifier;
    }

    @Override
    public String toString() {
        return "{Strength=" + StrengthModifier +
                ", Intelligence=" + IntelligenceModifier +
                ", Defence=" + DefenceModifier +
                ", Dexterity=" + DexterityModifier +
                ", Agility=" + AgilityModifier +
                ", Speed=" + SpeedModifier +
                '}';
    }
}
