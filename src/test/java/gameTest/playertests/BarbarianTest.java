package gameTest.playertests;

import game.players.Barbarian;
import game.tools.WeaponType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    Barbarian barbarian;

    @Before
    public void before() {
        barbarian = new Barbarian("Obelix", WeaponType.SWORD);
    }

    @Test
    public void canGetName() {
        assertEquals("Obelix", barbarian.getName());
    }

    @Test
    public void canGetWeaponValue() {
        assertEquals(20, barbarian.getWeapon().getValue());
    }

    @Test
    public void canAttack() {
        assertEquals(40, barbarian.attack());
    }

    @Test
    public void canDie() {
        barbarian.setHealthpoints(0);
        assertEquals(true, barbarian.die());
    }

    @Test
    public void canBeHurt() {
        barbarian.getHurt(20);
        assertEquals("Ouch, that hurt!", barbarian.getHurt(10));
        assertEquals(70, barbarian.getHealthpoints());
        assertEquals("Argh, I have died", barbarian.getHurt(70));
    }
}
