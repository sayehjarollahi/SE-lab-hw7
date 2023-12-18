package com.unittest.codecoverage.models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TrafficTest {

    private Traffic traffic;

    @BeforeEach
    public void setUp() {
        traffic = new Traffic();
    }

    @Test
    public void testCurrentTrafficLight() {
        TrafficLigth expected = TrafficLigth.RED;
        traffic.setCurrentTrafficLight(expected);
        assertEquals(expected, traffic.getCurrentTrafficLight());
    }

    @Test
    public void testIntenseCarTraffic() {
        boolean expected = true;
        traffic.setIntenseCarTraffic(expected);
        assertEquals(expected, traffic.intenseCarTraffic());
    }

    @Test
    public void testMinSpeedAllowed() {
        short expected = 10;
        traffic.setMinSpeedAllowed(expected);
        assertEquals(expected, traffic.getMinSpeedAllowed());
    }

    @Test
    public void testMaxSpeedAllowed() {
        short expected = 20;
        traffic.setMaxSpeedAllowed(expected);
        assertEquals(expected, traffic.getMaxSpeedAllowed());
    }

    @Test
    public void testStreetDirectionFlow() {
        StreetDirectionFlow expected = StreetDirectionFlow.ONE_WAY;
        traffic.setStreetDirectionFlow(expected);
        assertEquals(expected, traffic.getStreetDirectionFlow());
        traffic.setStreetDirectionFlow(StreetDirectionFlow.TWO_WAY);
        assertEquals(StreetDirectionFlow.TWO_WAY,  traffic.getStreetDirectionFlow());
    }
}