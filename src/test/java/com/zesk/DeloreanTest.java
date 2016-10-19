package com.zesk;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple Delorean.
 */
public class DeloreanTest
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public DeloreanTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( DeloreanTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testDelorean()
    {
        assertTrue( true );
        String[] args = null;
        Delorean.main(args);
        new Delorean();
    }

    public void testDeloreanSpeed()
    {
        Delorean delo = new Delorean();
        assertEquals(0, delo.getSpeed());
        for(int speed=0; speed<100; speed++){
            delo.setSpeed(speed);
            assertEquals(speed, delo.getSpeed());
        }
    }

    public void testDeloreanPlutonium()
    {
        Delorean delo = new Delorean();
        assertFalse(delo.hasPlutonium());
        delo.insertPlutonium();
        assertTrue(delo.hasPlutonium());
    }

    public void testDeloreanDate()
    {
        Delorean delo = new Delorean();
        assertEquals(2017, delo.getYear());
        delo.setYear(1955);
        assertEquals(1955, delo.getYear());
        assertEquals(0, delo.getTargetYear());
        delo.setTargetYear(1955);
        assertEquals(1955, delo.getTargetYear());

    }
}
