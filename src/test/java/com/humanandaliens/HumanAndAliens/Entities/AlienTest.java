package com.humanandaliens.HumanAndAliens.Entities;

import com.humanandaliens.HumanAndAliens.Entities.Items.Weapon;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlienTest {

    Alien testAlien = new Alien("Test Alien");
    Human testHuman = new Human("Test Human");
    Weapon blaster = new Weapon("Blaster", 1.5);
    @BeforeEach
    void setUp() {
        testAlien.setWeapon(blaster);
    }

    @Test
    void alienShouldStartWith100Health() {
        var sut = testAlien.getHealth();
        assertEquals(100, sut);
    }

    @Test
    void alienShouldStartWithLevel1() {
        var sut = testAlien.getLevel();
        assertEquals(1, sut);
    }

    @Test
    void alienShouldReceiveDamage() {
        testAlien.receiveDamage(10d);
        var sut = testAlien.getHealth();
        assertEquals(90,sut);
    }

    @Test
    void alienShouldDealDamage() {
        testAlien.dealDamage(testHuman,10d);
        var sut = testHuman.getHealth();
        assertEquals(85, sut);
    }


}