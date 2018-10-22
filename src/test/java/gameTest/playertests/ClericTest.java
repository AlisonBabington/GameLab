package gameTest.playertests;

import game.players.Cleric;
import game.tools.SpellType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    Cleric cleric;

    @Before
    public void before() {
        cleric = new Cleric("Cleric", SpellType.ATTACK_SPELL);
    }

    @Test
    public void hasName() {
        assertEquals("Cleric", cleric.getName());
    }

    @Test
    public void hasSpellValue() {
        assertEquals(15, cleric.getSpell().getValue());
    }

    @Test
    public void canChangeSpell() {
        cleric.changeHealing(SpellType.DEFEND_SPELL);
        assertEquals(10, cleric.getSpell().getValue());
    }
}
