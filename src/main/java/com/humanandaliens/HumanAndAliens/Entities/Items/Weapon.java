package com.humanandaliens.HumanAndAliens.Entities.Items;

public class Weapon {
    String name;
    Double damageMultiplier;

    public Weapon(String name, Double damageMultiplier) {
        this.name = name;
        this.damageMultiplier = damageMultiplier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getDamageMultiplier() {
        return damageMultiplier;
    }

    public void setDamageMultiplier(Double damageMultiplier) {
        this.damageMultiplier = damageMultiplier;
    }
}
