package com.GDC.city;


public class Kazan {

    private String Day;
    private String Temperature;

    public Kazan(String temperature, String day) {
        Temperature = temperature;
        Day = day;
    }

    public Kazan() {
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
        return "Казань " +
                "Дата" + " " + Day + " " +
                "Температура" + " " + Temperature;
    }
}
