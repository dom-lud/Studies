package Modifier;

public class ArcherModifier implements Modifier {
    @Override
    public void setModifiers(ModifierAbilities modifierAbilities) {
        modifierAbilities.setStrengthModifier(1.05f);
        modifierAbilities.setDefenceModifier(1.05f);
        modifierAbilities.setIntelligenceModifier(1.0f);
        modifierAbilities.setDexterityModifier(1.2f);
        modifierAbilities.setAgilityModifier(1.1f);
        modifierAbilities.setSpeedModifier(1.05f);
    }
}
