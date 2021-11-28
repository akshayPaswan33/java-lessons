package com.tackwit.encapsulation;

public class EnhancedPlayer {
    private String name;
    private String weapon;
    private int health = 100;

    public EnhancedPlayer(String name, String weapon, int health) {
        this.name = name;
        this.weapon = weapon;
        if(health > 0 && health <= 100) {
            this.health = health;
        }
    }

    public void loseHealth(int damage) {
        this.health = this.health - damage;
        if(this.health <= 0) {
            System.out.println("Player knocked out");
        }
    }

    public int healthRemaining() {
        return this.health;
    }

    public int getHealth() {
        return health;
    }
}
