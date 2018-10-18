package gameTest.enemiestests;

import game.enemies.Orc;
import game.tools.WeaponType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OrcTest {

    Orc orc;

    @Before
    public void before(){
        orc = new Orc("Bob", 100, WeaponType.CLUB);
    }

    @Test
    public void hasName(){
        assertEquals("Bob", orc.getName());
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(100, orc.getHealthpoints());
    }

    @Test
    public void hasWeapon(){
        assertEquals(WeaponType.CLUB, orc.getWeapon());
    }



}
