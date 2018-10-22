package game.enemies;

import game.IAttack;
import game.IDefend;
import game.tools.WeaponType;

public abstract class Enemy implements IAttack, IDefend {

    private int healthpoints;
    private WeaponType weapon;

    public Enemy(int healthpoints, WeaponType weapon) {

        this.healthpoints = healthpoints;
        this.weapon = weapon;
    }

    public int getHealthpoints() {
        return healthpoints;
    }

    public void setHealthpoints(int healthpoints) {
        this.healthpoints = healthpoints;
    }

    public WeaponType getWeapon() {
        return weapon;
    }

    public void setWeapon(WeaponType weapon) {
        this.weapon = weapon;
    }

    public abstract String getHurt(int hitPoints);
}
