package com.bushe.weather;

import org.bushe.util.HttpService;

public class WeatherService {
    static String weatherUrl = "https://wttr.in/Boston,MA?format=3";
    public String getWeather() {
        HttpService httpService = new HttpService();
        String fetch = httpService.fetch(weatherUrl);
        System.out.println("Fetched: " +fetch);
        return fetch;
    }
}
