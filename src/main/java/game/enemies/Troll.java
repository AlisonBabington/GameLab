package game.enemies;

import game.IAttack;
import game.IDefend;
import game.tools.WeaponType;

public class Troll extends Enemy implements IAttack, IDefend {

    public Troll(int healthpoints, WeaponType weapon) {
        super(healthpoints, weapon);
    }

    @Override
    public void attack(IDefend enemy) {
        int hitPoints =  getWeapon().getValue();
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
        setHealthpoints(getHealthpoints() - hitPoints);
        if (die()) return "Argh, I have died";
        return "Ouch, that hurt!";
    }

    @Override
    public boolean die() {
        if (getHealthpoints() <= 0) return true;
        return false;
    }
}
