package com.skyPro.WeatherExample.demo.model;

public class Weather {
    private WeatherMain main;
    private WeatherWind wind;

    public Weather() {
    }

    public WeatherMain getMain() {
        return main;
    }

    public void setMain(WeatherMain main) {
        this.main = main;
    }

    public WeatherWind getWind() {
        return wind;
    }

    public void setWind(WeatherWind wind) {
        this.wind = wind;
    }
}
