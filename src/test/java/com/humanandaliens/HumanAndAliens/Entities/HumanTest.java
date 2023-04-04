package com.humanandaliens.HumanAndAliens.Entities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HumanTest {

    Human testHuman = new Human("Test Human");
    @BeforeEach
    void setUp() {

    }

    @Test
    void humanShouldHave100Health() {
        var sut = testHuman.getHealth();
        assertEquals(100, sut);
    }

}