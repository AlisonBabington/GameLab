package game.players;

import game.IAttack;
import game.IDefend;
import game.tools.WeaponType;



public class Dwarf extends Player implements IAttack, IDefend{

    private String name;
    private WeaponType weapon1;
    private WeaponType weapon2;



    public Dwarf (String name, WeaponType weapon1, WeaponType weapon2) {
        this.name = name;
        this.weapon1 = weapon1;
        this.weapon2 = weapon2;
    }

    @Override
    public int attack() {
        return getWeaponOne().getValue() + getWeaponTwo().getValue();
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
        if (getHealthpoints() == 0) return true;
        return false;
    }

    public String getName() {
        return name;
    }

    public WeaponType getWeaponOne() {
        return weapon1;
    }

    public WeaponType getWeaponTwo() {
        return weapon2;
    }
}
