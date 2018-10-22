package game.enemies;

import com.sun.xml.internal.bind.v2.model.core.ID;
import game.IAttack;
import game.IDefend;
import game.tools.WeaponType;

public class Orc extends Enemy implements IAttack, IDefend {

    public Orc(int healthpoints, WeaponType weapon) {
        super(healthpoints, weapon);
    }

    @Override
    public void attack(IDefend player) {
         int attackAmount = getWeapon().getValue();
         player.getHurt(attackAmount);
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
