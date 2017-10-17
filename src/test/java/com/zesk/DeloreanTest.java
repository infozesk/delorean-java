package com.zesk;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple Delorean.
 */
public class DeloreanTest extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public DeloreanTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(DeloreanTest.class);
    }

    /**
     * Rigourous Test :-)
     */
    public void testDelorean() {
        assertTrue(true);
        String[] args = null;
        Delorean.main(args);
        new Delorean();
    }

    public void testDeloreanSpeed() {
        Delorean delo = new Delorean();
        assertEquals(0, delo.getSpeed());
        for (int speed = 0; speed < 100; speed++) {
            delo.setSpeed(speed);
            assertEquals(speed, delo.getSpeed());
        }
        // coverage

        // no plutonium == no time travel
        delo.setTargetYear(2100);
        delo.setSpeed(100);
        assertEquals(100, delo.getSpeed());

        // not enough speed == no time travel
        delo.insertPlutonium();
        delo.setSpeed(87);
        assertEquals(87, delo.getSpeed());

        // no target year == no time travel
        delo.setTargetYear(null);
        delo.setSpeed(100);
        assertEquals(100, delo.getSpeed());

        // TIME TRAVEL DUDE
        delo.setTargetYear(2222);
        delo.setSpeed(100);
        assertEquals(100, delo.getSpeed());
        assertEquals(2222, delo.getYear());

    }

    public void testDeloreanPlutonium() {
        Delorean delo = new Delorean();
        assertFalse(delo.hasPlutonium());
        delo.insertPlutonium();
        assertTrue(delo.hasPlutonium());
    }

    public void testDeloreanDate() {
        Delorean delo = new Delorean();
        assertEquals(2017, delo.getYear());
        delo.setYear(1955);
        assertEquals(1955, delo.getYear());
        assertEquals(null, delo.getTargetYear());
        delo.setTargetYear(1955);
        assertEquals(1955, (int) delo.getTargetYear());
        for (int expectedDate = 0; expectedDate < 300; expectedDate++) {
            delo.setTargetYear(expectedDate);
            assertEquals(expectedDate, (int) delo.getTargetYear());
        }
    }
}
