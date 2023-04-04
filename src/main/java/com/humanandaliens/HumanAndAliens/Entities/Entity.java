package com.humanandaliens.HumanAndAliens.Entities;

import com.humanandaliens.HumanAndAliens.Entities.Items.Armor;
import com.humanandaliens.HumanAndAliens.Entities.Items.Weapon;

public class Entity {
    private String name;
    private int health;

    private int attack;

    private int level;

    private Armor armor;

    private Weapon weapon;

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

    public void receiveDamage(int damage) {
        this.health -= damage;
    }

    public void dealDamage(Entity entity, int damage) {
        entity.receiveDamage(damage);
    }
}
