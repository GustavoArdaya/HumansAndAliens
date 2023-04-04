package com.humanandaliens.HumanAndAliens.Entities;

import com.humanandaliens.HumanAndAliens.Entities.Items.Armor;
import com.humanandaliens.HumanAndAliens.Entities.Items.Weapon;

public class Entity {
    private String name;
    private Double health;

    private Double baseDamage;

    private int level;

    private Armor armor;

    private Weapon weapon;

    public Entity(String name) {
        this.name = name;
        this.health = 100d;
        this.baseDamage = 1d;
        this.level = 1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getHealth() {
        return health;
    }

    public void setHealth(Double health) {
        this.health = health;
    }

    public Double getBaseDamage() {
        return baseDamage;
    }

    public void setBaseDamage(Double baseDamage) {
        this.baseDamage = baseDamage;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void receiveDamage(Double damage) {
        this.health -= damage;
    }

    public void dealDamage(Entity entity, Double damage) {
        entity.receiveDamage(calculateDamageDealt(damage));
    }

    public Double calculateDamageDealt(Double damage) {
        return this.baseDamage * this.weapon.getDamageMultiplier() * damage;
    }
}
