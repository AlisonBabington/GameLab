package game.players;

import game.IHeal;

public class Cleric extends Player implements IHeal {

    private String name;

    public Cleric(String name) {
        this.name = name;
    }


    @Override
    public void changeHealing() {

    }

    @Override
    public void useHealing() {

    }
}
