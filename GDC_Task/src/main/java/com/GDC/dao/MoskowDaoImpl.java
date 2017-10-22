package com.GDC.dao;

import com.GDC.city.Moskow;
import com.GDC.parser.MoskowParser;
import com.GDC.patcher.PatternDateMoskow;
import com.GDC.patcher.PatternWeatherMoskow;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Component;

@Component
public class MoskowDaoImpl implements MoskowDao {

    MoskowParser moskowParser = new MoskowParser();
    PatternDateMoskow patternDateMoskow = new PatternDateMoskow();
    PatternWeatherMoskow patternWeatherMoskow = new PatternWeatherMoskow();
    Moskow moskow = new Moskow();

    public String getDateString() throws Exception {
        Document page = moskowParser.getPage();
        Element table = page.select("table").first();
        Elements strings1 = page.select("tr");
        Elements strings2 = strings1.select("td");
        Elements strings3 = strings2.select("table");
        Elements strings4 = strings3.select("tr");
        Elements strings5 = strings4.select("td");
        String dateString = strings5.select("td").text();
        String lastDate = patternDateMoskow.getDate(dateString);
        return lastDate;
    }

    public String getWeatherString() throws Exception {
        Document page = moskowParser.getPage();
        Element table = page.select("table").first();
        Elements strings1 = page.select("tr");
        Elements strings2 = strings1.select("td");
        Elements strings3 = strings2.select("table");
        Elements strings4 = strings3.select("tr");
        Elements strings5 = strings4.select("td");
        String dateString = strings5.select("td").text();
        String lastWeather = patternWeatherMoskow.getWeather(dateString);
        return lastWeather;
    }
}
