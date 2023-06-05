package Modifier;

public class MageModifier implements Modifier {
    @Override
    public void setModifiers(ModifierAbilities modifierAbilities) {
        modifierAbilities.setStrengthModifier(1.00f);
        modifierAbilities.setDefenceModifier(1.00f);
        modifierAbilities.setIntelligenceModifier(1.2f);
        modifierAbilities.setDexterityModifier(1.05f);
        modifierAbilities.setAgilityModifier(1.02f);
        modifierAbilities.setSpeedModifier(1.0f);
    }
}
