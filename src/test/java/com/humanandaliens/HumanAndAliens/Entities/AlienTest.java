package com.humanandaliens.HumanAndAliens.Entities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlienTest {

    Alien testAlien = new Alien("Test Alien");
    Human testHuman = new Human("Test Human");
    @BeforeEach
    void setUp() {

    }

    @Test
    void alienShouldHave100Health() {
        var sut = testAlien.getHealth();
        assertEquals(100, sut);
    }

    @Test
    void alienShouldReceiveDamage() {
        testAlien.receiveDamage(20);
        var sut = testAlien.getHealth();
        assertEquals(80,sut);
    }

    @Test
    void alienShouldDealDamage() {
        testAlien.dealDamage(testHuman,20);
        var sut = testHuman.getHealth();
        assertEquals(80, sut);
    }


}