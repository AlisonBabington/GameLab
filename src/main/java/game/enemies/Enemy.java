package game.enemies;

public abstract class Enemy {

    private int healthpoints;

    public Enemy(int healthpoints) {
        this.healthpoints = healthpoints;
    }

    public int getHealthpoints() {
        return healthpoints;
    }

    public void setHealthpoints(int healthpoints) {
        this.healthpoints = healthpoints;
    }


}
