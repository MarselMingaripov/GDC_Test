package com.GDC.patcher;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternDateSpb {
    public Pattern pattern = Pattern.compile("\\d{2}\\.\\d{2}");
    public String getDate(String stringDate) throws Exception {
        Matcher matcher = pattern.matcher(stringDate);
        if (matcher.find()){
            return matcher.group();
        }
        throw new Exception("Can't extract date from string, Sorry!");
    }
}
