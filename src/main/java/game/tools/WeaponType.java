package game.tools;

public enum  WeaponType {

    SWORD(20),
    AXE(10),
    CLUB(5);

    private final int value;

    WeaponType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

}