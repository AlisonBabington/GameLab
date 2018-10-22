package game;

import game.tools.SpellType;

public interface IHeal {
    public void changeHealing(SpellType spell);
    public int useHealing();
}
