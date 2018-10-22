package game.players;

import game.IAttack;
import game.IDefend;
import game.tools.WeaponType;

public class Barbarian extends Player implements IAttack, IDefend {

        private String name;
        private WeaponType weapon;

        public Barbarian(String name, WeaponType weapon) {
            this.name = name;
            this.weapon = weapon;

    }

    @Override
    public void attack(IDefend enemy) {
            int hitPoints = weapon.getValue() * 2;
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

    public String getName() { return name; }

    public WeaponType getWeapon() {
            return weapon;
    }
}
