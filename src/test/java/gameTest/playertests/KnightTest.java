package gameTest.playertests;

import game.players.Knight;
import game.tools.WeaponType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    Knight knight;

    @Before
    public void before() {
        knight = new Knight("Mr Knight", WeaponType.SWORD);
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
        assertEquals(20, knight.attack());
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
