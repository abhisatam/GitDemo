package qaclickacademy;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class Demo1 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public Demo1( String testName )
    {
        super( testName );
        System.out.println("Hi");
        System.out.println("Hello");
        System.out.println("Hey");
        
        System.out.println("Hi Sam");
        System.out.println("Hello Sam");
        System.out.println("Hey Sam");
        
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
