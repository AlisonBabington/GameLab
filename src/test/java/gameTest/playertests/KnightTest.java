package gameTest.playertests;

import game.enemies.Ogre;
import game.players.Knight;
import game.tools.WeaponType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    Knight knight;
    Ogre ogre;

    @Before
    public void before() {
        knight = new Knight("Mr Knight", WeaponType.SWORD);
        ogre = new Ogre(90, WeaponType.SWORD);
    }

    @Test
    public void hasName() {
        assertEquals("Mr Knight", knight.getName());
    }

    @Test
    public void hasWeaponValue() {
        assertEquals(20, knight.getWeapon().getValue());
    }

    @Test
    public void canAttack() {
        knight.attack(ogre);
        assertEquals(70, ogre.getHealthpoints());
    }

    @Test
    public void canDie() {
        knight.setHealthpoints(-1);
        assertEquals(true, knight.die());
    }

    @Test
    public void canGetHurt() {
       knight.getHurt(20);
       assertEquals(90, knight.getHealthpoints());
    }
}
