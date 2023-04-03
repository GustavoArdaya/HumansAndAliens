package com.humanandaliens.HumanAndAliens.Entities;

public class Entity {
    private String name;
    private int health;

    private int attack;

    private int level;

    public Entity(String name) {
        this.name = name;
        this.health = 100;
        this.attack = 1;
        this.level = 1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
