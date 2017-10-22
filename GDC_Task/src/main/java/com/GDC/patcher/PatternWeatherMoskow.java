package com.GDC.patcher;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternWeatherMoskow {

    public Pattern pattern = Pattern.compile("\\D\\d{1,2}\\s\\W\\w");
    public String getWeather(String stringWeather) throws Exception {
        Matcher matcher = pattern.matcher(stringWeather);
        if (matcher.find()){
            return matcher.group();
        }
        throw new Exception("Can't extract weather from string");
    }
}
