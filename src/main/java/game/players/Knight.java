package game.players;

import game.IAttack;
import game.IDefend;
import game.enemies.Enemy;
import game.tools.WeaponType;

public class Knight extends Player implements IDefend, IAttack {

    private String name;
    private WeaponType weapon;

    public Knight(String name, WeaponType weapon) {
        this.name = name;
        this.weapon = weapon;
    }


    @Override
    public void attack(IDefend enemy) {
        int hitPoints = weapon.getValue();
        enemy.getHurt(hitPoints);
    }




    @Override
    public void isOpponentDefeated() {

    }

    @Override
    public void defendSelf() {

    }


    @Override
    public String getHurt(int hitPoints) {
        setHealthpoints(getHealthpoints() - hitPoints / 2);
        if (die()) return "Argh, I have died";
        return "Ouch, that hurt!";
    }

    @Override
    public boolean die() {
        if (getHealthpoints() <= 0) return true;
        return false;
    }

    public String getName() {
        return name;
    }

    public WeaponType getWeapon() {
        return weapon;
    }
}
