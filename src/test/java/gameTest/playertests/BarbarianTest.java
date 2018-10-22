package gameTest.playertests;

import game.enemies.Ogre;
import game.players.Barbarian;
import game.tools.WeaponType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    Barbarian barbarian;
    Ogre ogre;

    @Before
    public void before() {
        barbarian = new Barbarian("Obelix", WeaponType.SWORD);
        ogre = new Ogre(80, WeaponType.SWORD);
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
        barbarian.attack(ogre);
        assertEquals(40, ogre.getHealthpoints());
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
