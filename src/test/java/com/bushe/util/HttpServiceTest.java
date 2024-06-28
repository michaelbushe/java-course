package com.bushe.util;

import com.bushe.weather.WeatherService;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class HttpServiceTest
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public HttpServiceTest(String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( HttpServiceTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        WeatherService weatherService = new WeatherService();
        String weather = weatherService.getWeather();
        assertEquals("Boston,MA: ☀️   +60°F", weather);
    }
}
