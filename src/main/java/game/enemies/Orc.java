package game.enemies;

import game.IAttack;
import game.IDefend;
import game.enemies.Enemy;
import game.tools.WeaponType;

public class Orc extends Enemy implements IAttack, IDefend {

    private WeaponType weapon;

    public Orc(String name, int healthpoints, WeaponType weapon) {
        super(name, healthpoints);
        this.weapon = WeaponType.CLUB;
    }

    public WeaponType getWeapon() {
        return weapon;
    }


    @Override
    public int attack() {
        return getWeapon().getValue();
    }


    @Override
    public void isOpponentDefeated() {

    }

    @Override
    public void defendSelf() {

    }

    @Override
    public void getHurt(int hitPoints) {

    }

    @Override
    public boolean die() {
        return false;
    }
}