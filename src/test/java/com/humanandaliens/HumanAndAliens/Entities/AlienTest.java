package com.humanandaliens.HumanAndAliens.Entities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlienTest {

    Alien testAlien = new Alien("Test Alien");
    @BeforeEach
    void setUp() {

    }

    @Test
    void alienShouldHave100Health() {
        var sut = testAlien.getHealth();
        assertEquals(100, sut);
    }


}