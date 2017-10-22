package com.GDC.city;


public class Moskow {

    private String Day;
    private String Temperature;

    public Moskow(String temperature, String day) {
        Temperature = temperature;
        Day = day;
    }

    public Moskow() {
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
        return "Москва " +
                "Дата" + " " + Day + " " +
                "Температура" + " " + Temperature;
    }
}
