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
}
