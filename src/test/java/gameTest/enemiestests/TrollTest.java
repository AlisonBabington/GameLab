package gameTest.enemiestests;

import game.enemies.Troll;
import game.players.Dwarf;
import game.tools.WeaponType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrollTest {


        Troll troll;
        Dwarf dwarf;

        @Before
        public void before() {
            troll = new Troll(60, WeaponType.SWORD);
            dwarf = new Dwarf("Asterix", WeaponType.AXE, WeaponType.CLUB);
        }


        @Test
        public void canGetWeaponValue() {
            assertEquals(20, troll.getWeapon().getValue());
        }

        @Test
        public void canAttack() {
            troll.attack(dwarf);
            assertEquals(80, dwarf.getHealthpoints());
        }

        @Test
        public void canDie() {
            troll.setHealthpoints(0);
            assertEquals(true, troll.die());
        }

        @Test
        public void canBeHurt() {
            troll.getHurt(20);
            assertEquals("Ouch, that hurt!", troll.getHurt(10));
            assertEquals(30, troll.getHealthpoints());
            assertEquals("Argh, I have died", troll.getHurt(30));
        }
    }

