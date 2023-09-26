package com.skyPro.WeatherExample.demo.service;

import com.skyPro.WeatherExample.demo.model.Weather;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {
    public static String WEATHER_SERVICE_URL =
            "https://api.openweathermap.org/data/2.5/weather?q={city}&units=metric&appid=9bfe96441086fcf528a7f7111d22b267";

    @Autowired
    private RestTemplate restTemplate;

    public Weather getWeather(String city) {
        return restTemplate.exchange(
                WEATHER_SERVICE_URL,
                HttpMethod.GET,
                new HttpEntity<>(HttpHeaders.EMPTY),
                Weather.class, city
                ).getBody();
    }
}
