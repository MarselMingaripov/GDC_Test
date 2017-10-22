package com.GDC.dao;

import com.GDC.parser.SpbParser;
import com.GDC.patcher.PatternDateSpb;
import com.GDC.patcher.PatternWeatherSpb;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Component;

@Component
public class SpbDaoImpl implements SpbDao {
    SpbParser spbParser = new SpbParser();
    PatternDateSpb patternDateSpb = new PatternDateSpb();
    PatternWeatherSpb patternWeatherSpb = new PatternWeatherSpb();


    @Override
    public String getDateString() throws Exception {
        Document page = spbParser.getPage();
        Element table = page.select("table").first();
        Elements strings1 = page.select("tr");
        Elements strings2 = strings1.select("td");
        Elements strings3 = strings2.select("table");
        Elements strings4 = strings3.select("tr");
        Elements strings5 = strings4.select("td");
        String dateString = strings5.select("td").text();
        String lastDate = patternDateSpb.getDate(dateString);
        return lastDate;
    }

    @Override
    public String getWeatherString() throws Exception {
        Document page = spbParser.getPage();
        Element table = page.select("table").first();
        Elements strings1 = page.select("tr");
        Elements strings2 = strings1.select("td");
        Elements strings3 = strings2.select("table");
        Elements strings4 = strings3.select("tr");
        Elements strings5 = strings4.select("td");
        String dateString = strings5.select("td").text();
        String lastWeather = patternWeatherSpb.getWeather(dateString);
        return lastWeather;
    }
}
