package gameTest.roomstests;

import game.enemies.Troll;
import game.players.Barbarian;
import game.players.Cleric;
import game.players.Knight;
import game.rooms.Room;
import game.tools.SpellType;
import game.tools.WeaponType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    Room room;
    Troll troll;
    Barbarian barbs;
    Cleric cleric;
    Knight knight;

    @Before
    public void before() {
        barbs = new Barbarian("Obelix", WeaponType.SWORD);
        cleric = new Cleric("Cleric", SpellType.ATTACK_SPELL);
        knight = new Knight("Mr Knight", WeaponType.SWORD);
        troll = new Troll(60, WeaponType.SWORD);
        room = new Room("Library", 200, troll);
    }

    @Test
    public void canAddPlayers() {
        room.add(barbs);
        room.add(cleric);
        assertEquals(2, room.checkPlayersSize());
        room.add(knight);
        assertEquals(3, room.checkPlayersSize());
    }

    @Test
    public void canCheckIfEnemyDead() {
        assertEquals(false, room.checkEnemy());
    }

    @Test
    public void canGiveTreasure() {
        troll.setHealthpoints(0);
        room.foeDefeated(barbs);
        assertEquals(200, barbs.getCoins());
    }

}
