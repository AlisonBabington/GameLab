package game.enemies;

import game.IAttack;
import game.IDefend;
import game.tools.WeaponType;

public abstract class Enemy {

    private String name;
    private int healthpoints;


    public Enemy(String name, int healthpoints) {
        this.name = name;
        this.healthpoints = healthpoints;
    }

    public String getName() {
        return name;
    }

    public int getHealthpoints() {
        return healthpoints;
    }

    public void setHealthpoints(int healthpoints) {
        this.healthpoints = healthpoints;
    }



}
