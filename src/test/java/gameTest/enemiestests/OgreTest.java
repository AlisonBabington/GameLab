package gameTest.enemiestests;

import game.enemies.Ogre;
import game.players.Dwarf;
import game.tools.WeaponType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OgreTest {

    Ogre ogre;
    Dwarf dwarf;

    @Before
    public void before() {
        ogre = new Ogre(100, WeaponType.SWORD);
        dwarf = new Dwarf("Asterix", WeaponType.AXE, WeaponType.CLUB);
    }


    @Test
    public void canGetWeaponValue() {
        assertEquals(20, ogre.getWeapon().getValue());
    }

    @Test
    public void canAttack() {
        ogre.attack(dwarf);
        assertEquals(60, dwarf.getHealthpoints());
    }

    @Test
    public void canDie() {
        ogre.setHealthpoints(0);
        assertEquals(true, ogre.die());
    }

    @Test
    public void canBeHurt() {
        ogre.getHurt(20);
        assertEquals("Ouch, that hurt!", ogre.getHurt(10));
        assertEquals(70, ogre.getHealthpoints());
        assertEquals("Argh, I have died", ogre.getHurt(70));
    }
}

