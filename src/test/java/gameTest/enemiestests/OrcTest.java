package gameTest.enemiestests;

import game.enemies.Orc;
import game.players.Dwarf;
import game.tools.WeaponType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OrcTest {


        Orc orc;
        Dwarf dwarf;

        @Before
        public void before() {
            orc = new Orc(100, WeaponType.SWORD);
            dwarf = new Dwarf("Asterix", WeaponType.AXE, WeaponType.CLUB);
        }


        @Test
        public void canGetWeaponValue() {
            assertEquals(20, orc.getWeapon().getValue());
        }

        @Test
        public void canAttack() {
            orc.attack(dwarf);
            assertEquals(80, dwarf.getHealthpoints());
        }

        @Test
        public void canDie() {
            orc.setHealthpoints(0);
            assertEquals(true, orc.die());
        }

        @Test
        public void canBeHurt() {
            orc.getHurt(20);
            assertEquals("Ouch, that hurt!", orc.getHurt(10));
            assertEquals(70, orc.getHealthpoints());
            assertEquals("Argh, I have died", orc.getHurt(70));
        }
    }

