package gameTest.playertests;

import game.players.Dwarf;
import game.tools.WeaponType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DwarfTest {

    Dwarf dwarf;


    @Before
    public void before() {
        dwarf = new Dwarf("Asterix", WeaponType.AXE, WeaponType.CLUB);
    }

    @Test
    public void canGetName() {
        assertEquals("Asterix", dwarf.getName());
    }

    @Test
    public void canGetWeaponValue() {
        assertEquals(5, dwarf.getWeaponTwo().getValue());
    }

    @Test
    public void canDie() {
        System.out.println(dwarf.getHealthpoints());
        dwarf.setHealthpoints(0);
        assertEquals(true, dwarf.die());
    }

    @Test
    public void canGetHurt() {
        dwarf.getHurt(10);
        assertEquals(90, dwarf.getHealthpoints());
    }





}
