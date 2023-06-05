package Tests;

import Hero.Hero;
import Services.HeroFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

class HeroFactoryTest {

    @Test
    public void testCreateHero() {
        HeroFactory heroFactory = new HeroFactory();

        // Test dla klasy "Mage"
        String input1 = "John";
        InputStream in1 = new ByteArrayInputStream(input1.getBytes());
        System.setIn(in1);
        Hero hero1 = heroFactory.createHero("Mage");
        Assertions.assertEquals("John", hero1.getName());
        Assertions.assertEquals("Mage", hero1.getCharacterClass());
        System.setIn(System.in); // Przywrócenie oryginalnego strumienia wejściowego

        // Test dla klasy "Archer"
        String input2 = "John";
        InputStream in2 = new ByteArrayInputStream(input2.getBytes());
        System.setIn(in2);
        Hero hero2 = heroFactory.createHero("Archer");
        Assertions.assertEquals("John", hero2.getName());
        Assertions.assertEquals("Archer", hero2.getCharacterClass());
        System.setIn(System.in); // Przywrócenie oryginalnego strumienia wejściowego

        // Test dla klasy "Knight"
        String input3 = "John";
        InputStream in3 = new ByteArrayInputStream(input3.getBytes());
        System.setIn(in3);
        Hero hero3 = heroFactory.createHero("Knight");
        Assertions.assertEquals("John", hero3.getName());
        Assertions.assertEquals("Knight", hero3.getCharacterClass());
        System.setIn(System.in); // Przywrócenie oryginalnego strumienia wejściowego
    }
}