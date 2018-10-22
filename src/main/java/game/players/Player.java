package game.players;

import game.enemies.Enemy;

public abstract class Player {

    private int healthpoints;
    private int coins;

    public Player() {
        this.healthpoints = 100;
        this.coins = 0;
    }

    public int getHealthpoints() {
        return healthpoints;
    }

    public void setHealthpoints(int healthpoints) {
        this.healthpoints = healthpoints;
    }

    public int getCoins() {
        return coins;
    }

    public void setCoins(int coins) {
        this.coins = coins;
    }

    

}
