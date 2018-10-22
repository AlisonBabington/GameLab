package game.rooms;

import game.IAttack;
import game.IDefend;
import game.enemies.Enemy;
import game.enemies.Ogre;
import game.players.Barbarian;
import game.players.Player;

import java.util.ArrayList;

public class Room {

    private String name;
    private int treasure;
    private Enemy enemy;
    private ArrayList<Player> currentPlayers;

    public Room (String name, int treasure, Enemy enemy) {
        this.name = name;
        this.treasure = treasure;
        this.enemy = enemy;
        this.currentPlayers = new ArrayList<>();
    }

    public int checkPlayersSize() {
        return currentPlayers.size();
    }

    public void add(Player player) {
        currentPlayers.add(player);
    }

    public boolean checkEnemy() {
        if (enemy.getHealthpoints() <= 0) {
            return true;
        }
        return false;
    }

    public void foeDefeated(Player player) {
        if (checkEnemy() == true) {
            player.setCoins(player.getCoins() + treasure);
        }
    }


}
