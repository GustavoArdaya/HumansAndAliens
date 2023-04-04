package com.humanandaliens.HumanAndAliens.Entities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HumanTest {

    Human testHuman = new Human("Test Human");
    Alien testAlien = new Alien("Test Alien");
    @BeforeEach
    void setUp() {

    }

    @Test
    void humanShouldStartWith100Health() {
        var sut = testHuman.getHealth();
        assertEquals(100, sut);
    }

    @Test
    void humanShouldStartWithLevel1() {
        var sut = testHuman.getLevel();
        assertEquals(1, sut);
    }

    @Test
    void humanShouldReceiveDamage() {
        testHuman.receiveDamage(20);
        var sut = testHuman.getHealth();
        assertEquals(80,sut);
    }

    @Test
    void humanShouldDealDamage() {
        testHuman.dealDamage(testAlien,20);
        var sut = testAlien.getHealth();
        assertEquals(80, sut);
    }

}