package com.bushe.weather;

/**
 * AN
 *
 */
public class WeatherApp
{
    private static WeatherService weatherService;

    public static void main( String[] args )
    {
        String result = weatherService.getWeather();
        System.out.println( "Boston weather: ${result}" );
    }
}
