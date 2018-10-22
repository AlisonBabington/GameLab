package game.players;

import game.IHeal;
import game.tools.SpellType;
import game.tools.WeaponType;

public class Cleric extends Player implements IHeal {

    private String name;
    private SpellType spell;

    public Cleric(String name, SpellType spell) {
        this.name = name;
        this.spell = spell;
    }


    @Override
    public void changeHealing(SpellType spell) {
       this.spell = spell;
    }

    @Override
    public int useHealing() {
        return spell.getValue();
    }

    public String getName() {
        return name;
    }

    public SpellType getSpell() {
        return spell;
    }
}
