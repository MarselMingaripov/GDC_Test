package com.GDC.city;


public class Spb {
    private String Day;
    private String Temperature;

    public Spb(String temperature, String day) {
        Temperature = temperature;
        Day = day;
    }

    public Spb() {
    }

    public String getDay() {
        return Day;
    }

    public void setDay(String day) {
        Day = day;
    }

    public String getTemperature() {
        return Temperature;
    }

    public void setTemperature(String temperature) {
        Temperature = temperature;
    }

    @Override
    public String toString() {
        return "Санкт - Петербург " +
                "Дата" + " " + Day + " " +
                "Температура" + " " + Temperature;
    }
}
