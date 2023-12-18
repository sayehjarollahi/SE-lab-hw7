package com.unittest.codecoverage.models;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class FootpassengerTest {
    @Test
    public void testAge() {
        Footpassenger footpassenger = new Footpassenger();
        footpassenger.setCrossedTheCrosswalk(true);
        assertTrue(footpassenger.crossedTheCrosswalk());
    }
}